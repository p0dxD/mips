/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mips;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author p0dxD
 */
public class MIPSGui {
    private int width = 200;
    private int height = 200;
    //Main pane objects
    private Stage primaryStage;
    private Pane mainPane;
    private Scene mainScene;
    //for the main layout
    private MenuBar menuBar;
    private final Menu options = new Menu("Options");
    private TabPane tabs;
    private Tab arithmeticTab;
    private Tab syscalls;
    private Tab directives;

    /**
     * Constructor takes a stage as a param
     * @param primaryStage Stage to set as default
     * @param width
     * @param height
     */
    public MIPSGui(Stage primaryStage, int width, int height){
        this.width = width;
        this.height = height;
        this.primaryStage = primaryStage;
        init();
    }
    /**
     * Sets stage according to user preference
     * @param primaryStage Stage to set as default
     */
    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
    /**
     * Initializes the main pane 
     */
    public void initMainPane(){
        mainPane = new Pane();
    }
    /**
     * Initializes the scene with the pan and width and height 
     */
    public void initScene(){
        mainScene = new Scene(mainPane, width, height);
        primaryStage.setScene(mainScene);
    }
    /**
     * initializes all GUI's and handlers
     */
    public final void init(){
        initMainPane();
        initScene();
        initApp();
    }
    
    /**
     * 
     * @return The main border pane
     */
    public Pane getMainPane(){
        return mainPane;
    }
    public void initApp(){
    menuBar = new MenuBar();
    menuBar.setPrefHeight(20);
    tabs = new TabPane();
    tabs.tabClosingPolicyProperty().
            set(TabPane.TabClosingPolicy.UNAVAILABLE);//closing not available
    arithmeticTab = new Tab("Arithmetic");
    directives = new Tab("Directives");
    syscalls = new Tab("Syscalls");
    //Add menu items to menubar
    menuBar.getMenus().add(options);
    //add the tabs
    tabs.getTabs().addAll(arithmeticTab, syscalls, directives);
    tabs.setTranslateY(menuBar.getPrefHeight()+5);//move the tabs a bit bellow
    //add to main pane 
    mainPane.getChildren().add(menuBar);
    mainPane.getChildren().add(tabs);
    }
}

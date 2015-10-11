/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mips;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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
    private BorderPane mainPane;
    private Scene mainScene;

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
        mainPane = new BorderPane();
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
    }
    /**
     * 
     * @return The main border pane
     */
    public BorderPane getMainPane(){
        return mainPane;
    }
}

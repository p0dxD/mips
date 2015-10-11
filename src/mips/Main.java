/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mips;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author Jose 
 */
public class Main extends Application {
    private final String title = "MIPS Creator";
    private final int width = 500, height = 500;
    @Override
    public void start(Stage primaryStage) {
        MIPSGui gui = new MIPSGui(primaryStage, width, height);
        primaryStage.setTitle(title);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

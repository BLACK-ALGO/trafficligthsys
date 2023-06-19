package com.trafficligthsys;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class PrimaryController {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane db;

    @FXML
    private ToggleGroup traffic;

    @FXML
    void getGreeb(MouseEvent event) throws IOException {
        loadPage("green");

    }

    @FXML
    void Reset(MouseEvent event) {
        db.setCenter(ap);
        System.out.println("Nooo");
    }

    @FXML
    void getRed(MouseEvent event) throws IOException {
        loadPage("red");
    }

    @FXML
    void getYellow(MouseEvent event) throws IOException {
        loadPage("yellow");

    }

    /**
     * @param Page
     * @throws IOException
     */
    private void loadPage(String Page) throws IOException{
        Parent root = null ;
        // root = App.setRoot(Page);
       
         root = FXMLLoader.load(getClass().getResource(Page + ".fxml"));
        db.setCenter(root);
    }
}

package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//sdasdasd
        Pane root = new Pane();
        Scene scene1 = new Scene(root, 800, 600);

        Rectangle rect = new Rectangle(50,50,100,100);
        root.getChildren().add(rect);
        scene1.setOnMouseMoved(e->{
            rect.setX(e.getX()- rect.getWidth()/2);
            rect.setY(e.getY()- rect.getHeight()/2);
        });

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
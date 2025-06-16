package com.paineladminprodutos.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        setScene("view/listagem.fxml", "Lista de Produtos");
    }

    public static void setScene(String fxmlPath, String title) throws IOException {
        URL url = Main.class.getClassLoader().getResource(fxmlPath);
        if (url == null) {
            throw new IOException("FXML not found: " + fxmlPath);
        }
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

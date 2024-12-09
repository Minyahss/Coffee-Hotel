package controller;


import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class TelaInicialController {

    @FXML
    private Button idCadButton;

    @FXML
    private Button idLogin;

    @FXML
    private TextField idSenhaFunc;

    @FXML
    private TextField idUsuario;

    @FXML
    void idCadButtonA(ActionEvent event) throws IOException {
        URL url = getClass().getResource("/view/TelaCadastro.fxml");
        Parent root = FXMLLoader.load(url);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Yasmin dos Santos Silva e kawa gregorio da costa");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();         
    }

    @FXML
    void idLoginA(ActionEvent event) throws IOException {

        URL url = getClass().getResource("/view/TelaMenu.fxml");
        Parent root = FXMLLoader.load(url);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Yasmin dos Santos Silva e kawa gregorio da costa");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();         
    }

}

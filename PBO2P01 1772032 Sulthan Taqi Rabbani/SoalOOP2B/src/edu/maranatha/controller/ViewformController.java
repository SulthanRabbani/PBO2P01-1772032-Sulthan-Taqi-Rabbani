/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.maranatha.controller;

import edu.maranatha.Player;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author master
 */
public class ViewformController implements Initializable {

    @FXML
    private ImageView userImage;
    @FXML
    private ImageView computerImage;
    @FXML
    private TextField winText;
    @FXML
    private TextField drawText;
    @FXML
    private TextField loseText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        drawText.setText("0");
        winText.setText("0");
        loseText.setText("0");

    }

    @FXML
    private void exitClick(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void rockClick(ActionEvent event) {
        Random randint = new Random();
        Image rock = new Image("edu/maranatha/rock.jpg");
        userImage.setImage(rock);
        int comValue = randint.nextInt(3);
        switch (comValue) {
            case 0: {
                Image rock2 = new Image("edu/maranatha/rock.jpg");
                computerImage.setImage(rock2);
                int iter = Integer.parseInt(drawText.getText());
                iter++;
                drawText.setText(String.valueOf(iter));
                break;
            }
            case 1: {
                Image paper = new Image("edu/maranatha/paper.jpg");
                computerImage.setImage(paper);
                int iter = Integer.parseInt(loseText.getText());
                iter++;
                loseText.setText(String.valueOf(iter));
                break;
            }
            default: {
                Image scissors = new Image("edu/maranatha/scissors.jpg");
                computerImage.setImage(scissors);
                int iter = Integer.parseInt(winText.getText());
                iter++;
                winText.setText(String.valueOf(iter));
                break;
            }
        }

    }

    @FXML
    private void paperClick(ActionEvent event) {
        Random randint = new Random();
        Image paper = new Image("edu/maranatha/paper.jpg");
        userImage.setImage(paper);
        int comValue = randint.nextInt(3);
        switch (comValue) {
            case 0: {
                Image rock2 = new Image("edu/maranatha/rock.jpg");
                computerImage.setImage(rock2);
                int iter = Integer.parseInt(winText.getText());
                iter++;
                winText.setText(String.valueOf(iter));
                break;
            }
            case 1: {
                Image paper2 = new Image("edu/maranatha/paper.jpg");
                computerImage.setImage(paper2);
                int iter = Integer.parseInt(drawText.getText());
                iter++;
                drawText.setText(String.valueOf(iter));
                break;
            }
            default: {
                Image scissors = new Image("edu/maranatha/scissors.jpg");
                computerImage.setImage(scissors);
                int iter = Integer.parseInt(loseText.getText());
                iter++;
                loseText.setText(String.valueOf(iter));
                break;
            }
        }
    }

    @FXML
    private void scissorsClick(ActionEvent event) {
        Random randint = new Random();
        Image scissors = new Image("edu/maranatha/scissors.jpg");
        userImage.setImage(scissors);
        int comValue = randint.nextInt(3);
        switch (comValue) {
            case 0: {
                Image rock2 = new Image("edu/maranatha/rock.jpg");
                computerImage.setImage(rock2);
                int iter = Integer.parseInt(loseText.getText());
                iter++;
                loseText.setText(String.valueOf(iter));
                break;
            }
            case 1: {
                Image paper = new Image("edu/maranatha/paper.jpg");
                computerImage.setImage(paper);
                int iter = Integer.parseInt(winText.getText());
                iter++;
                winText.setText(String.valueOf(iter));
                break;
            }
            default: {
                Image scissors1 = new Image("edu/maranatha/scissors.jpg");
                computerImage.setImage(scissors1);
                int iter = Integer.parseInt(drawText.getText());
                iter++;
                drawText.setText(String.valueOf(iter));
                break;
            }
        }
    }

}

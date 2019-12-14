package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {
    int[][] array = new int[1920][1080];

    public void loadFile() throws FileNotFoundException {
        Image image = new Image(new FileInputStream("ABC.png"));

        PixelReader pixelReader = image.getPixelReader();
        for (int y = 0; y < 1080; y++) {
            for (int x = 0; x < 1920; x++) {
                Color color = pixelReader.getColor(x, y);
                if (color == Color.BLACK) {
                    array[x][y]=1;
                } else{ array[x][y]=0;

                }


            }
        }
        System.out.println("works");
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        loadFile();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

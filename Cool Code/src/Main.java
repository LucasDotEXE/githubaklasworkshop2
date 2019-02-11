import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane);

        ImageView imageView = new ImageView();
        imageView.setImage(new Image("rec/low_temperature-512.png"));
        borderPane.setCenter(imageView);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

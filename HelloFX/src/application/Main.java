package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 600.0,600.0, Color.DEEPSKYBLUE);
		
		Text  text = new Text();
		text.setText("Jhandoooooo");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font(50));
		
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.ALICEBLUE);
		rectangle.setStroke(Color.RED);
		
		Circle circle = new Circle(300,400,50);
		circle.setFill(Color.RED);
		circle.setStroke(Color.BLACK);
		
		root.getChildren().add(text);
		root.getChildren().add(circle);
		root.getChildren().add(rectangle);
	
		stage.setTitle("Stage Demo program w00t w00t");
		Image icon = new Image("Icon.png");
		stage.getIcons().add(icon);
//		stage.setResizable(false);
//		stage.setFullScreen(true);
//		stage.setFullScreenExitHint("Please press q to exit");
//		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		stage.setScene(scene);
		stage.show();
	}
}

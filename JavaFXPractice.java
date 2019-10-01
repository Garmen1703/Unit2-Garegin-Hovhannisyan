import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXPractice extends Application {

  public void start(Stage stage){
    Text hello = new Text(50, 50, "I dont know what I'm doing");
    Text question = new Text(120, 80, "Send help");
    Rectangle box = new Rectangle(45, 30, 155, 30);
    Line under = new Line(120,85,175,85);
    Circle around = new Circle(150,80,50);

    box.setStroke(Color.BLUE);
    box.setFill(null);
    under.setStroke(Color.RED);
    under.setFill(null);
    around.setStroke(Color.PURPLE);
    around.setFill(null);

    Group root = new Group(hello, question, box, under, around);
    Scene scene = new Scene(root, 300, 120, Color.YELLOW);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}

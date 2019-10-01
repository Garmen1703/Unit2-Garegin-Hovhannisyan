import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class FXsnowman extends Application{
  public void start(Stage stage){
    Circle head = new Circle(150, 50, 25);
    head.setFill(Color.WHITE);
    Circle body = new Circle(150, 95, 40);
    body.setFill(Color.WHITE);
    Circle bottom = new Circle(150, 155, 60);
    bottom.setFill(Color.WHITE);
    Rectangle ground = new Rectangle(0, 205,300, 300);
    ground.setFill(Color.WHITE);
    Circle eye1 = new Circle(135 , 40, 3);
    Circle eye2 = new Circle(165 , 40, 3);
    Rectangle arm1 = new Rectangle(45, 80, 70, 15);
    arm1.setFill(Color.MAROON);
    Rectangle arm2 = new Rectangle(185, 80, 70, 15);
    arm2.setFill(Color.MAROON);
    Circle nose = new Circle(150, 55 , 2);
    Rectangle rim = new Rectangle(125,25, 50,5);
    Rectangle top = new Rectangle(135, 10, 30, 15);

    Group root = new Group(head,body,bottom,ground,eye1,eye2,arm1,arm2, nose, rim, top);
    Scene scene = new Scene(root, 300, 300, Color.LIGHTBLUE);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }
}

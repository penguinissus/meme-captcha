package hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class Controller{
    @FXML
    private StackPane root;

    public void initialize(){
        // String javaVersion = System.getProperty("java.version");
        // String javafxVersion = System.getProperty("javafx.version");
        levelOne();
    }

    public void levelOne(){
        //big box
        Rectangle rect = new Rectangle(350, 100, Color.web("#EEEEEE"));
        modifyRect(rect, "#D0D0D0", 2.0, 20, 20);
        root.getChildren().add(rect);

        //checkbox
        Rectangle checkbox = new Rectangle(50, 50, Color.WHITE);
        modifyRect(checkbox, "#D0D0D0", 2.0, 5, 5);
        checkbox.setTranslateX(-120);
        root.getChildren().add(checkbox);

        //I'm not a robot text
        Text text = new Text("I'm not a robot");
        text.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR, 25));
        text.setTranslateX(30);
        root.getChildren().add(text);

        checkbox.setOnMouseEntered(e -> {
            checkbox.setStroke(Color.GREY);
            checkbox.setStrokeWidth(3.0);
        });
        checkbox.setOnMouseExited(e -> {
            checkbox.setStroke(Color.web("#D0D0D0"));
            checkbox.setStrokeWidth(2.0);
        });
    }

    public void modifyRect(
        Rectangle r, 
        String strokeC, 
        double strokeW, 
        int arcW,
        int arcH
    ){
        r.setStroke(Color.web(strokeC));
        r.setStrokeWidth(strokeW);
        r.setArcWidth(arcW);
        r.setArcHeight(arcH);
    }
}
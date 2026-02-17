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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
        checkbox.setOnMouseClicked(e -> {
            rect.setVisible(false);
            checkbox.setVisible(false);
            text.setVisible(false);
            levelTwo();
        });
    }

    public void levelTwo(){
        double mouseX = 0;
        double mouseY = 0;
        Text instruction = new Text(mouseX + ", " + mouseY);
        instruction.setTranslateY(-250);
        root.getChildren().add(instruction);

        Image ah1 = new Image("file:images/levelTwo/arcHole1.png");
        ImageView ah1V = new ImageView(ah1);
        ah1V.setFitWidth(40);
        ah1V.setPreserveRatio(true);
        root.getChildren().add(ah1V);

        Image ah1g = new Image("file:images/levelTwo/arcHole1g.png");
        ImageView ah1gV = new ImageView(ah1g);
        ah1gV.setFitWidth(40);
        ah1gV.setPreserveRatio(true);
        root.getChildren().add(ah1gV);
        ah1gV.setVisible(false);

        Image ch1 = new Image("file:images/levelTwo/circleHole1.png");
        ImageView ch1V = new ImageView(ch1);
        ch1V.setFitWidth(40);
        ch1V.setPreserveRatio(true);
        root.getChildren().add(ch1V);

        Image ch1g = new Image("file:images/levelTwo/circleHole1g.png");
        ImageView ch1gV = new ImageView(ch1g);
        ch1gV.setFitWidth(40);
        ch1gV.setPreserveRatio(true);
        root.getChildren().add(ch1gV);
        ch1gV.setVisible(false);

        Image rh1 = new Image("file:images/levelTwo/rectangleHole1.png");
        ImageView rh1V = new ImageView(rh1);
        rh1V.setFitWidth(40);
        rh1V.setPreserveRatio(true);
        root.getChildren().add(rh1V);

        Image rh1g = new Image("file:images/levelTwo/rectangleHole1g.png");
        ImageView rh1gV = new ImageView(rh1g);
        rh1gV.setFitWidth(40);
        rh1gV.setPreserveRatio(true);
        root.getChildren().add(rh1gV);
        rh1gV.setVisible(false);

        Image sh1 = new Image("file:images/levelTwo/squareHole1.png");
        ImageView sh1V = new ImageView(sh1);
        sh1V.setFitWidth(40);
        sh1V.setPreserveRatio(true);
        root.getChildren().add(sh1V);

        Image sh1g = new Image("file:images/levelTwo/squareHole1g.png");
        ImageView sh1gV = new ImageView(sh1g);
        sh1gV.setFitWidth(40);
        sh1gV.setPreserveRatio(true);
        root.getChildren().add(sh1gV);
        sh1gV.setVisible(false);

        Image th1 = new Image("file:images/levelTwo/triangleHole1.png");
        ImageView th1V = new ImageView(th1);
        th1V.setFitWidth(40);
        th1V.setPreserveRatio(true);
        root.getChildren().add(th1V);

        Image th1g = new Image("file:images/levelTwo/triangleHole1g.png");
        ImageView th1gV = new ImageView(th1g);
        th1gV.setFitWidth(40);
        th1gV.setPreserveRatio(true);
        root.getChildren().add(th1gV);
        th1gV.setVisible(false);

        Image a = new Image("file:images/levelTwo/arc.png");
        ImageView arc = new ImageView(a);
        arc.setFitWidth(40);
        arc.setPreserveRatio(true);
        root.getChildren().add(arc);

        Image c = new Image("file:images/levelTwo/circle.png");
        ImageView circle = new ImageView(c);
        circle.setFitWidth(40);
        circle.setPreserveRatio(true);
        root.getChildren().add(circle);

        Image r = new Image("file:images/levelTwo/rectangle.png");
        ImageView rectangle = new ImageView(r);
        rectangle.setFitWidth(40);
        rectangle.setPreserveRatio(true);
        root.getChildren().add(rectangle);

        Image s = new Image("file:images/levelTwo/square.png");
        ImageView square = new ImageView(s);
        square.setFitWidth(40);
        square.setPreserveRatio(true);
        root.getChildren().add(square);

        Image t = new Image("file:images/levelTwo/triangle.png");
        ImageView triangle = new ImageView(t);
        triangle.setFitWidth(40);
        triangle.setPreserveRatio(true);
        root.getChildren().add(triangle);

        Image sh2 = new Image("file:images/levelTwo/squareHole2.png");
        ImageView sh2V = new ImageView(sh2);
        sh2V.setFitWidth(40);
        sh2V.setPreserveRatio(true);
        root.getChildren().add(sh2V);

        Image sh2g = new Image("file:images/levelTwo/squareHole2g.png");
        ImageView sh2gV = new ImageView(sh2g);
        sh2gV.setFitWidth(40);
        sh2gV.setPreserveRatio(true);
        root.getChildren().add(sh2gV);
        sh2gV.setVisible(false);

        Image ah2 = new Image("file:images/levelTwo/arcHole2.png");
        ImageView ah2V = new ImageView(ah2);
        ah2V.setFitWidth(40);
        ah2V.setPreserveRatio(true);
        root.getChildren().add(ah2V);

        Image ah2g = new Image("file:images/levelTwo/arcHole2g.png");
        ImageView ah2gV = new ImageView(ah2g);
        ah2gV.setFitWidth(40);
        ah2gV.setPreserveRatio(true);
        root.getChildren().add(ah2gV);
        ah2gV.setVisible(false);

        Image ch2 = new Image("file:images/levelTwo/circleHole2.png");
        ImageView ch2V = new ImageView(ch2);
        ch2V.setFitWidth(40);
        ch2V.setPreserveRatio(true);
        root.getChildren().add(ch2V);

        Image ch2g = new Image("file:images/levelTwo/circleHole2g.png");
        ImageView ch2gV = new ImageView(ch2g);
        ch2gV.setFitWidth(40);
        ch2gV.setPreserveRatio(true);
        root.getChildren().add(ch2gV);
        ch2gV.setVisible(false);

        Image rh2 = new Image("file:images/levelTwo/rectangleHole2.png");
        ImageView rh2V = new ImageView(rh2);
        rh2V.setFitWidth(40);
        rh2V.setPreserveRatio(true);
        root.getChildren().add(rh2V);

        Image rh2g = new Image("file:images/levelTwo/rectangleHole2g.png");
        ImageView rh2gV = new ImageView(rh2g);
        rh2gV.setFitWidth(40);
        rh2gV.setPreserveRatio(true);
        root.getChildren().add(rh2gV);
        rh2gV.setVisible(false);

        Image th2 = new Image("file:images/levelTwo/triangleHole2.png");
        ImageView th2V = new ImageView(th2);
        th2V.setFitWidth(40);
        th2V.setPreserveRatio(true);
        root.getChildren().add(th2V);

        Image th2g = new Image("file:images/levelTwo/triangleHole2g.png");
        ImageView th2gV = new ImageView(th2g);
        th2gV.setFitWidth(40);
        th2gV.setPreserveRatio(true);
        root.getChildren().add(th2gV);
        th2gV.setVisible(false);

        arc.setTranslateY(-100);
        circle.setTranslateY(-110);
        rectangle.setTranslateY(-113);
        square.setTranslateY(-105);
        triangle.setTranslateY(-108);
        arc.setTranslateX(200);
        circle.setTranslateX(-100);
        rectangle.setTranslateX(0);
        square.setTranslateX(100);
        triangle.setTranslateX(-200);

        ah1V.setTranslateX(-200);
        ah1gV.setTranslateX(-200);
        ah2V.setTranslateX(-200);
        ah2gV.setTranslateX(-200);
        ch1V.setTranslateX(-100);
        ch1gV.setTranslateX(-100);
        ch2V.setTranslateX(-100);
        ch2gV.setTranslateX(-100);
        rh1V.setTranslateX(100);
        rh1gV.setTranslateX(100);
        rh2V.setTranslateX(100);
        rh2gV.setTranslateX(100);
        th1V.setTranslateX(200);
        th1gV.setTranslateX(200);
        th2V.setTranslateX(200);
        th2gV.setTranslateX(200);

        DraggableMaker draggableMaker = new DraggableMaker();
        draggableMaker.makeDraggable(arc);
        draggableMaker.makeDraggable(circle);
        draggableMaker.makeDraggable(rectangle);
        draggableMaker.makeDraggable(square);
        draggableMaker.makeDraggable(triangle);

        Rectangle next = new Rectangle(100, 30, Color.web("#EEEEEE"));
        modifyRect(next, "#D0D0D0", 2.0, 20, 20);
        next.setTranslateY(-300.0);
        next.setTranslateX(-300.0);
        root.getChildren().add(next);
        next.setOnMouseClicked(e -> {
            sh2V.setVisible(false);
            sh1V.setVisible(false);
            ah1V.setVisible(false);
            ah2V.setVisible(false);
            ch1V.setVisible(false);
            ch2V.setVisible(false);
            rh1V.setVisible(false);
            rh2V.setVisible(false);
            th1V.setVisible(false);
            th2V.setVisible(false);
            robotSpotted();
        });
    }

    public void robotSpotted(){
        Text text = new Text("haha u robot");
        text.setTranslateY(-30.0);
        root.getChildren().add(text);
        Text text2 = new Text("go away clanker");
        text2.setTranslateY(-10.0);
        root.getChildren().add(text2);
        Rectangle retry = new Rectangle(100, 30, Color.web("#EEEEEE"));
        modifyRect(retry, "#D0D0D0", 2.0, 20, 20);
        retry.setTranslateY(20.0);
        root.getChildren().add(retry);
        Text retryText = new Text("Retry");
        retryText.setTranslateY(20);
        root.getChildren().add(retryText);

        retry.setOnMouseEntered(e -> {
            retry.setStroke(Color.GREY);
            retry.setStrokeWidth(3.0);
        });

        retry.setOnMouseExited(e -> {
            retry.setStroke(Color.web("#D0D0D0"));
            retry.setStrokeWidth(2.0);
        });

        retryText.setOnMouseEntered(e -> {
            retry.setStroke(Color.GREY);
            retry.setStrokeWidth(3.0);
        });

        retryText.setOnMouseExited(e -> {
            retry.setStroke(Color.web("#D0D0D0"));
            retry.setStrokeWidth(2.0);
        });

        retry.setOnMouseClicked(e -> {
            text.setVisible(false);
            text2.setVisible(false);
            retry.setVisible(false);
            retryText.setVisible(false);
            levelOne();
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
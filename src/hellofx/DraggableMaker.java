package hellofx;

import javafx.fxml.FXML;
import javafx.scene.image.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

public class DraggableMaker {
    private double mouseX, mouseY;

    @FXML
    private StackPane root;

    public void makeDraggable(ImageView node){
        Text text = new Text(mouseX + ", " + mouseY);
        root.getChildren().add(text);
        text.setTranslateY(-250);

        node.setOnMousePressed(mouseEvent -> {
            mouseX = mouseEvent.getSceneX();
            mouseY = mouseEvent.getSceneY();
        });

        node.setOnMouseDragged(mouseEvent -> {
            double deltaX = mouseEvent.getSceneX() - mouseX;
            double deltaY = mouseEvent.getSceneY() - mouseY;
            node.setTranslateX(node.getTranslateX() + deltaX);
            node.setTranslateY(node.getTranslateY() + deltaY);
            mouseX = mouseEvent.getSceneX();
            mouseY = mouseEvent.getSceneY();
        });

        node.setOnMouseDragReleased(mouseEvent -> {
        });
    }
}
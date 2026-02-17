package hellofx;

<<<<<<< HEAD
import javafx.fxml.FXML;
import javafx.scene.image.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
=======
import javafx.scene.Node;
>>>>>>> parent of e3f1504 (limit draggable area)

public class DraggableMaker {
    private double mouseX, mouseY;

<<<<<<< HEAD
    @FXML
    private StackPane root;

    public void makeDraggable(ImageView node){
        Text text = new Text(mouseX + ", " + mouseY);
        root.getChildren().add(text);
        text.setTranslateY(-250);

=======
    public void makeDraggable(Node node){
>>>>>>> parent of e3f1504 (limit draggable area)
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
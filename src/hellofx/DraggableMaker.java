package hellofx;

import javafx.scene.Node;

public class DraggableMaker {
    private double mouseX, mouseY;

    public void makeDraggable(Node node){
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
    }
}
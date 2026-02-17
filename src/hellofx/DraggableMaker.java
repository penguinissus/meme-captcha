package hellofx;

import javafx.scene.image.*;

public class DraggableMaker {
    private double mouseX, mouseY;

    public void makeDraggable(ImageView node){

        node.setOnMousePressed(mouseEvent -> {
            mouseX = mouseEvent.getSceneX();
            mouseY = mouseEvent.getSceneY();
        });

        node.setOnMouseDragged(mouseEvent -> {
            double deltaX = mouseEvent.getSceneX() - mouseX;
            double deltaY = mouseEvent.getSceneY() - mouseY;
            if (node.getTranslateX() < 200 && node.getTranslateX() > -200){
                node.setTranslateX(node.getTranslateX() + deltaX);
            } else if (node.getTranslateX() >= 200){
                node.setTranslateX(199.9);
            } else {
                node.setTranslateX(-199.9);
            }
            if (node.getTranslateY() > -200 && node.getTranslateY() < 0){
                node.setTranslateY(node.getTranslateY() + deltaY);
            } else if (node.getTranslateY() <= -200){
                node.setTranslateY(-199.9);
            } else {
                node.setTranslateY(-30.1);
            }
            mouseX = mouseEvent.getSceneX();
            mouseY = mouseEvent.getSceneY();
        });

        node.setOnMouseReleased(mouseEvent -> {
            node.setVisible(false);
        });
    }
}
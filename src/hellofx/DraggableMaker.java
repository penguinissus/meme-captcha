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
            if(node.getTranslateX() > -250 && node.getTranslateX() < 250){
                node.setTranslateX(node.getTranslateX() + deltaX);
            } else if (node.getTranslateX() <= -250){
                node.setTranslateX(-249);
            } else {
                node.setTranslateX(249);
            }
            if(node.getTranslateY() > -250 && node.getTranslateY() < -50){
                node.setTranslateY(node.getTranslateY() + deltaY);
            } else if (node.getTranslateY() <= -250){
                node.setTranslateY(-249);
            } else {
                node.setTranslateY(-51);
            }
            mouseX = mouseEvent.getSceneX();
            mouseY = mouseEvent.getSceneY();
        });
    }
}
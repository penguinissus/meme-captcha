package hellofx;

import javafx.scene.image.*;

public class DraggableMaker {
    private double mouseX, mouseY;

    public void makeDraggable(ImageView node, 
        ImageView a1, ImageView c1, ImageView r1, ImageView s1, ImageView t1,
        ImageView a2, ImageView c2, ImageView r2, ImageView s2, ImageView t2,
        ImageView a1g, ImageView c1g, ImageView r1g, ImageView s1g, ImageView t1g,
        ImageView a2g, ImageView c2g, ImageView r2g, ImageView s2g, ImageView t2g){

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
            if (node.getTranslateX() > -220 && node.getTranslateX() < -180){
                a1.setVisible(false);
                a1g.setVisible(true);
                a2.setVisible(false);
                a2g.setVisible(true);
                c1.setVisible(true);
                c2.setVisible(true);
                c1g.setVisible(false);
                c2g.setVisible(false);
                r1.setVisible(true);
                r2.setVisible(true);
                r1g.setVisible(false);
                r2g.setVisible(false);
                s1.setVisible(true);
                s2.setVisible(true);
                s1g.setVisible(false);
                s2g.setVisible(false);
                t1.setVisible(true);
                t2.setVisible(true);
                t1g.setVisible(false);
                t2g.setVisible(false);
            } else if (node.getTranslateX() > -120 && node.getTranslateX() < -80){
                a1.setVisible(true);
                a2.setVisible(true);
                a1g.setVisible(false);
                a2g.setVisible(false);
                c1.setVisible(false);
                c2.setVisible(false);
                c1g.setVisible(true);
                c2g.setVisible(true);
                r1.setVisible(true);
                r2.setVisible(true);
                r1g.setVisible(false);
                r2g.setVisible(false);
                s1.setVisible(true);
                s2.setVisible(true);
                s1g.setVisible(false);
                s2g.setVisible(false);
                t1.setVisible(true);
                t2.setVisible(true);
                t1g.setVisible(false);
                t2g.setVisible(false);
            } else if (node.getTranslateX() > -20 && node.getTranslateX() <20){
                a1.setVisible(true);
                a2.setVisible(true);
                a1g.setVisible(false);
                a2g.setVisible(false);
                c1.setVisible(true);
                c2.setVisible(true);
                c1g.setVisible(false);
                c2g.setVisible(false);
                r1.setVisible(true);
                r2.setVisible(true);
                r1g.setVisible(false);
                r2g.setVisible(false);
                s1.setVisible(false);
                s2.setVisible(false);
                s1g.setVisible(true);
                s2g.setVisible(true);
                t1.setVisible(true);
                t2.setVisible(true);
                t1g.setVisible(false);
                t2g.setVisible(false);
            } else if (node.getTranslateX() > 80 && node.getTranslateX() < 120){
                a1.setVisible(true);
                a2.setVisible(true);
                a1g.setVisible(false);
                a2g.setVisible(false);
                c1.setVisible(true);
                c2.setVisible(true);
                c1g.setVisible(false);
                c2g.setVisible(false);
                r1.setVisible(false);
                r2.setVisible(false);
                r1g.setVisible(true);
                r2g.setVisible(true);
                s1.setVisible(true);
                s2.setVisible(true);
                s1g.setVisible(false);
                s2g.setVisible(false);
                t1.setVisible(true);
                t2.setVisible(true);
                t1g.setVisible(false);
                t2g.setVisible(false);
            } else if (node.getTranslateX() > 180 && node.getTranslateX() < 220){
                a1.setVisible(true);
                a2.setVisible(true);
                a1g.setVisible(false);
                a2g.setVisible(false);
                c1.setVisible(true);
                c2.setVisible(true);
                c1g.setVisible(false);
                c2g.setVisible(false);
                r1.setVisible(true);
                r2.setVisible(true);
                r1g.setVisible(false);
                r2g.setVisible(false);
                s1.setVisible(true);
                s2.setVisible(true);
                s1g.setVisible(false);
                s2g.setVisible(false);
                t1.setVisible(false);
                t2.setVisible(false);
                t1g.setVisible(true);
                t2g.setVisible(true);
            } else {
                a1.setVisible(true);
                a2.setVisible(true);
                a1g.setVisible(false);
                a2g.setVisible(false);
                c1.setVisible(true);
                c2.setVisible(true);
                c1g.setVisible(false);
                c2g.setVisible(false);
                r1.setVisible(true);
                r2.setVisible(true);
                r1g.setVisible(false);
                r2g.setVisible(false);
                s1.setVisible(true);
                s2.setVisible(true);
                s1g.setVisible(false);
                s2g.setVisible(false);
                t1.setVisible(true);
                t2.setVisible(true);
                t1g.setVisible(false);
                t2g.setVisible(false);
            }
        });

        node.setOnMouseReleased(mouseEvent -> {
            node.setVisible(false);
        });
    }
}
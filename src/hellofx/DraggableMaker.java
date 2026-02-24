package hellofx;

import javafx.scene.image.*;
import java.util.Arrays;

public class DraggableMaker {
    private double mouseX, mouseY;
    private int status = 0;
    boolean[][] positions = {
        {false, false, false, false, false},
        {false, false, false, false, false},
        {false, false, false, false, false},
        {false, false, false, false, false},
        {false, false, false, false, false}
    };

    boolean[][] bot = {
        {true, false, false, false, false},
        {false, true, false, false, false},
        {false, false, false, true, false},
        {false, false, true, false, false},
        {false, false, false, false, true}
    };

    boolean[][] human = {
        {false, false, false, false, false},
        {false, false, false, false, false},
        {true, true, true, true, true},
        {false, false, false, false, false},
        {false, false, false, false, false}
    };

    int count = 0;

    public void makeDraggable(ImageView node, int n,
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
            if (node.getTranslateX() > -220 && node.getTranslateX() < -180 && node.getTranslateY() > -50){
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
            } else if (node.getTranslateX() > -120 && node.getTranslateX() < -80 && node.getTranslateY() > -50){
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
            } else if (node.getTranslateX() > -20 && node.getTranslateX() <20 && node.getTranslateY() > -50){
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
            } else if (node.getTranslateX() > 80 && node.getTranslateX() < 120 && node.getTranslateY() > -50){
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
            } else if (node.getTranslateX() > 180 && node.getTranslateX() < 220 && node.getTranslateY() > -50){
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
            if (node.getTranslateX() > -220 && node.getTranslateX() < -180 && node.getTranslateY() > -50){
                if (n==1){
                    positions[0][0] = true;
                } else if (n==2){
                    positions[0][1] = true;
                } else if (n==3){
                    positions[0][2] = true;
                } else if (n==4){
                    positions[0][3] = true;
                } else if (n==5){
                    positions[0][4] = true;
                }
                node.setVisible(false);
                count++;
            } else if (node.getTranslateX() > -120 && node.getTranslateX() < -80 && node.getTranslateY() > -50){
                if (n==1){
                    positions[1][0] = true;

                } else if (n==2){
                    positions[1][1] = true;
                } else if (n==3){
                    positions[1][2] = true;
                } else if (n==4){
                    positions[1][3] = true;
                } else if (n==5){
                    positions[1][4] = true;
                }
                node.setVisible(false);
                count++;
            } else if (node.getTranslateX() > -20 && node.getTranslateX() < 20 && node.getTranslateY() > -50){
                if (n==1){
                    positions[2][0] = true;
                } else if (n==2){
                    positions[2][1] = true;
                } else if (n==3){
                    positions[2][2] = true;
                } else if (n==4){
                    positions[2][3] = true;
                } else if (n==5){
                    positions[2][4] = true;
                }
                node.setVisible(false);
                count++;
            } else if (node.getTranslateX() > 80 && node.getTranslateX() < 120 && node.getTranslateY() > -50){
                if (n==1){
                    positions[3][0] = true;
                } else if (n==2){
                    positions[3][1] = true;
                } else if (n==3){
                    positions[3][2] = true;
                } else if (n==4){
                    positions[3][3] = true;
                } else if (n==5){
                    positions[3][4] = true;
                }
                node.setVisible(false);
                count++;
            } else if (node.getTranslateX() > 180 && node.getTranslateX() < 220 && node.getTranslateY() > -50){
                if (n==1){
                    positions[4][0] = true;
                } else if (n==2){
                    positions[4][1] = true;
                } else if (n==3){
                    positions[4][2] = true;
                } else if (n==4){
                    positions[4][3] = true;
                } else if (n==5){
                    positions[4][4] = true;
                }
                node.setVisible(false);
                count++;
            }
            if (count >= 5){
                //check if they are all in the right place
                if(Arrays.deepEquals(positions, bot)){
                    status = 1;
                } else if (Arrays.deepEquals(positions, human)){
                    status = 2;
                } else {
                    status = 3;
                }
            }
        });
    }

    public int getSolveStatus(){
        return status;
    }
}
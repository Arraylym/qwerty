package ITC;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ict_tri extends Application{
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Pane pan1 = new Pane();
        Polygon tri = new Polygon(10,0,0,20,20,20);
        ObservableList<Double> list = tri.getPoints();
        tri.setFill(Color.BLACK);
        pane.getChildren().addAll(tri);
        pane.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.R){
                tri.setRotate(tri.getRotate()+2);
            }
            if(e.getCode() == KeyCode.E)
                tri.setRotate(tri.getRotate()-2);
            if(e.getCode() == KeyCode.NUMPAD1){
                tri.setScaleY(tri.getScaleY()+1);
                tri.setScaleX(tri.getScaleX()+1);}
            if(e.getCode() == KeyCode.NUMPAD2){
                tri.setScaleY(tri.getScaleY()-1);
                tri.setScaleX(tri.getScaleX()-1);}
            if(e.getCode() == KeyCode.UP){
                tri.getPoints().set(1,tri.getPoints().get(1)-5);
                tri.getPoints().set(3,tri.getPoints().get(3)-5);
                tri.getPoints().set(5,tri.getPoints().get(5)-5);
            }
            if(e.getCode() == KeyCode.DOWN){
                tri.getPoints().set(1,tri.getPoints().get(1)+5);
                tri.getPoints().set(3,tri.getPoints().get(3)+5);
                tri.getPoints().set(5,tri.getPoints().get(5)+5);
            }
            if(e.getCode() == KeyCode.LEFT){
                tri.getPoints().set(0,tri.getPoints().get(0)-5);
                tri.getPoints().set(2,tri.getPoints().get(2)-5);
                tri.getPoints().set(4,tri.getPoints().get(4)-5);
            }
            if(e.getCode() == KeyCode.RIGHT){
                tri.getPoints().set(0,tri.getPoints().get(0)+5);
                tri.getPoints().set(2,tri.getPoints().get(2)+5);
                tri.getPoints().set(4,tri.getPoints().get(4)+5);
            }
        });
        //pane.getChildren().add(pan1);

        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }


}

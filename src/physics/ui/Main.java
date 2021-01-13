package physics.ui;


import physics.geometry.Vector2;
import physics.physics.Material;
import physics.physics.Space;
import physics.utils.Tools;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Main {

    public static void main(String[] args) {
//        DrawingPanel panel = new DrawingPanel();
//        panel.addSpace(0.01f, 300f);
//        JFrame frame = new JFrame("Engine");
//        frame.setSize(Tools.transformFloat(1600), Tools.transformFloat(1000));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBackground(Color.BLACK) ;
//        frame.setLocation(200, 0);
//        frame.setResizable(false);
//        frame.add(panel);
//        frame.setUndecorated(false);
//        frame.setVisible(true);
        Scene scene = new Scene(new Space(0.01f, 300f), Color.BLACK, 1600, 1000);
//        panel.space.addWall(0,400,1000,1000);
//        panel.space.addWall(1000,400,0,1000);
//        panel.space.addLine(0, 1000, 0, 0);
//        panel.space.addTriangle(new Vector2(0,0), 0.05f, 500,600, 100, Material.LapisLazuli);
//        panel.space.addLine(900, 0, 700, 1000);
      scene.getSpace().addWall(1400,600,600,900);
        scene.getSpace().addWall(1200,550,200,200);
//        panel.space.addSphere(new Vector2(0,0), 0f, 800, 500, 200, Material.Steel);
        scene.getSpace().addBlock(-1,900,2000,200);
//        panel.space.addTriangle(new Vector2(0,0), 3f, 200, 500, 90);
//        panel.space.addTriangle(new Vector2(0,0), 3f, 1000, 800, 90);
//        panel.space.addBlock(1400,600-1,500,300);
//        panel.space.addBlock(100,200,100,20);
//        panel.space.addSphere(new Vector2(0,0), 0f, 400, 850, 30, Material.Steel);
//        panel.space.addThing(new Vector2(0,0), 0, 150, 160, 20, Material.Steel);
//        panel.space.addWall(0, 901, 1800, 901);
//        panel.space.addLine(0, 902, 1800, 902);
//        panel.space.addLine(0, 903, 1800, 903);
//        panel.space.addLine(0, 904, 1800, 904);
//        panel.space.addLine(0, 905, 1800, 905);
//        panel.space.addLine(0, 906, 1800, 906);
//        panel.space.addLine(050,249,700,599);
        for (int i = 0; i <5 ; i++) {
            int x = 040 + i * 25;
            int y = 100;
            for (int j = 0; j < 20; j++) {
//                panel.space.addSphere(new Vector2(0f, 0f), 0.0f, x, y+25*j, 10f , Material.Constantin);
            }
        }
        while (true) scene.update();
    }
}

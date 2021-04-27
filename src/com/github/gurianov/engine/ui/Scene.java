package com.github.gurianov.engine.ui;

import com.github.gurianov.engine.physics.Space;

import java.awt.*;

public class Scene {

    private final Space space;
    private final com.github.gurianov.engine.ui.Frame frame;


    public Scene(Space space, Color bgColor, int width, int height) {
        this.space = space;
        frame = new Frame(this, bgColor, width, height);
        }


        public Space getSpace () {
            return space;
        }


        public void addObjectController(ObjectController objectController){
            frame.addKeyListener(objectController.getKeyListener());
            frame.addMouseMotionListener(objectController.getMouseMotionListener());
            frame.addMouseListener(objectController.getMouseListener());
            frame.addMouseWheelListener(objectController.getMouseWheelListener());
        }

        public void addSceneController(SceneController sceneController){
            frame.addKeyListener(sceneController.getKeyListener());
            frame.addMouseMotionListener(sceneController.getMouseMotionListener());
            frame.addMouseListener(sceneController.getMouseListener());
        }

        public void update () {
            space.changeTime();
            frame.repaint();
        }
    }
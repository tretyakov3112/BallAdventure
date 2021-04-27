package com.github.gurianov.engine.drawing;

import com.github.gurianov.engine.geometry.Point2;
import com.github.gurianov.engine.utils.Tools;

import java.awt.*;
import java.util.ArrayList;

public class ArbitraryFigure {

    private final ArrayList<Point2> points;

    public ArbitraryFigure(ArrayList<Point2> points){
        this.points = points;
    }

    public final Polygon getPolygon(){
        int[] xs = new int[points.size()];
        int[] ys = new int[points.size()];
        for (int i = 0; i < points.size(); i++){
            xs[i] = Tools.transformFloat(points.get(i).x);
            ys[i] = Tools.transformFloat(points.get(i).y);
        }
        return new Polygon(xs, ys, points.size()) ;
    }
}
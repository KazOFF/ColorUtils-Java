/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.das.colorutil.colorspaces;

/**
 *
 * @author Kaz
 */
public class Yxy extends ColorSpace {
    
    protected double x;
    protected double Y;
    protected double y2;
    
    public Yxy(double Y, double x, double y2){
        this.x = x;
        this.Y = Y;
        this.y2 = this.y2;
    }

    public double getX() {
        return Math.round(x);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return Math.round(Y);
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public double getY2() {
        return Math.round(y2);
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}

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
public class RYB extends ColorSpace {
    protected double R = 0;
    protected double Y = 0;
    protected double B = 0;

    public RYB(double R, double Y, double B){
        this.R = R;
        this.Y = Y;
        this.B = B;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public double getY() {
        return Y;
    }

    public void setY(double G) {
        this.Y = G;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.kazov.colorutils.colorspaces;

/**
 *
 * @author Kaz
 */
public class XYZ extends ColorSpace {
    
    protected double X;
    protected double Y;
    protected double Z;
    
    public XYZ(double X, double Y, double Z){
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public double getX() {
        return Math.round(X);
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Math.round(Y);
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public double getZ() {
        return Math.round(Z);
    }

    public void setZ(double Z) {
        this.Z = Z;
    }
}

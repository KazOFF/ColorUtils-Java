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
public class ARGB extends ColorSpace {
    protected double R = 0;
    protected double G = 0;
    protected double B = 0;

    public ARGB(double R, double G, double B){
        this.R = R;
        this.G = G;
        this.B = B;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public double getG() {
        return G;
    }

    public void setG(double G) {
        this.G = G;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }
}

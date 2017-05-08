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
public class CMYK extends ColorSpace {
    protected double C;
    protected double M;
    protected double Y;
    protected double K;
    
    public CMYK(double C, double M, double Y, double K){
        this.C = C;
        this.M = M;
        this.Y = Y;
        this.K = K;
    }

    public double getC() {
        return Math.round(C);
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getM() {
        return Math.round(M);
    }

    public void setM(double M) {
        this.M = M;
    }

    public double getY() {
        return Math.round(Y);
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public double getK() {
        return Math.round(K);
    }

    public void setK(double K) {
        this.K = K;
    }
}

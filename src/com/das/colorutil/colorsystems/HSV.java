/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.das.colorutil.colorsystems;

/**
 *
 * @author Kaz
 */
public class HSV extends ColorSystem {
    protected double H;
    protected double S;
    protected double V;
    
    public HSV(double H, double S, double V){
        this.H = H;
        this.S = S;
        this.V = V;
    }

    public HSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getH() {
        return Math.round(H);
    }
    
    public double getH(int c){
        return rd(H,c);
    }

    public void setH(double H) {
        this.H = H;
    }

    public double getS() {
        return Math.round(S);
    }
    
    public double getS(int c){
        return rd(S,c);
    }

    public void setS(double S) {
        this.S = S;
    }

    public double getV() {
        return Math.round(V);
    }

    public double getV(int c) {
        return rd(V,c);
    }
    
    public void setV(double V) {
        this.V = V;
    }
}

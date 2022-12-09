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
public class CIELuv extends ColorSpace {
    protected double L;
    protected double u;
    protected double v;
    
    public CIELuv(double L, double u, double v){
        this.L = L;
        this.u = u;
        this.v = v;
    }

    public double getL() {
        return Math.round(L);
    }
    
    public double getL(int c) {
        return rd(L,c);
    }

    public void setL(double L) {
        this.L = L;
    }

    public double getU() {
        return Math.round(u);
    }
    
    public double getU(int c) {
        return rd(u,c);
    }

    public void setU(double u) {
        this.u = u;
    }

    public double getV() {
        return Math.round(v);
    }
    
    public double getV(int c) {
        return rd(v,c);
    }

    public void setV(double v) {
        this.v = v;
    }
}

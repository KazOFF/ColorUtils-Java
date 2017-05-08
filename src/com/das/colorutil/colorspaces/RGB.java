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
public class RGB extends ColorSpace {
    protected double R = 0;
    protected double G = 0;
    protected double B = 0;
    
    public RGB(double R, double G, double B){
        this.R = R;
        this.G = G;
        this.B = B;
    }
    
    public RGB(String hex){
        if(hex.length()<6)
        {
            throw new IllegalArgumentException();
        }else{
            this.R = Integer.valueOf( hex.substring( 1, 3 ), 16 );
            this.G = Integer.valueOf( hex.substring( 3, 5 ), 16 );
            this.B = Integer.valueOf( hex.substring( 5, 7 ), 16 );
        }
    }
    
    public String getHEX(){
        return String.format("#%02x%02x%02x", this.R, this.G, this.B);
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

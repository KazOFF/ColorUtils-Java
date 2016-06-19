/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.das.colorutil;

import com.das.colorutil.colorsystems.RGB;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author kazov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedImage img = ImageIO.read(new File("1.jpg"));

        RGB r = ImageAnalyze.averageColor(img);
        System.out.println("Average");
        System.out.println("R: " + r.getR() + ", G: " + r.getG() + ", B: " + r.getB());

        r = ImageAnalyze.dominantColor(img);
        System.out.println("Dominant");
        System.out.println("R: " + r.getR() + ", G: " + r.getG() + ", B: " + r.getB());
        
        List<RGB> list = ImageAnalyze.generatePalette(img, 8);
        System.out.println("Palette");
        for(RGB rgb:list){
            System.out.println("R: " + rgb.getR() + ", G: " + rgb.getG() + ", B: " + rgb.getB());
        }
    }

}

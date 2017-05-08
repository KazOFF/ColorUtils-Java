/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.das.colorutil;

import com.das.colorutil.colorspaces.*;

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
        System.out.println("R: " + r.getR() + ", Y: " + r.getG() + ", B: " + r.getB());

        r = ImageAnalyze.dominantColor(img);
        System.out.println("Dominant");
        System.out.println("R: " + r.getR() + ", Y: " + r.getG() + ", B: " + r.getB());
        
        List<RGB> list = ImageAnalyze.generatePalette(img, 20);
        System.out.println("Palette");
        for(RGB rgb:list){
            System.out.println("R: " + rgb.getR() + ", G: " + rgb.getG() + ", B: " + rgb.getB());
        }

        System.out.println("RGB2RYB");
        RGB nrgb = new RGB(3,27,99);
        RYB ryb = nrgb.toRYB();
        System.out.println("R: " + ryb.getR() + ", Y: " + ryb.getY() + ", B: " + ryb.getB());
        RGB n2rgb = ryb.toRGB();
        System.out.println("R: " + n2rgb.getR() + ", G: " + n2rgb.getG() + ", B: " + n2rgb.getB());


        RGB or = new RGB(52, 173, 70);

        or.setTristimulus(ColorSpace.OBSERVER_2, ColorSpace.ILLUMINANT_D65);
        CIELab xyz = or.toCIELab();
        xyz.setTristimulus(ColorSpace.OBSERVER_2, ColorSpace.ILLUMINANT_C);
        or = xyz.toRGB();
        System.out.println("R: " + or.getR() + ", G: " + or.getG() + ", B: " + or.getB());

    }

}

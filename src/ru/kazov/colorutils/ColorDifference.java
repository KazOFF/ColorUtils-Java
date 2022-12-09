/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kazov.colorutils;

import ru.kazov.colorutils.colorspaces.CIELab;

/**
 *
 * @author kazov
 */
public class ColorDifference {

    public static double differenceWithoutRoot(CIELab c1, CIELab c2) {
        return Math.pow((c1.getL() - c2.getL()), 2) + Math.pow((c1.getA() - c2.getA()), 2) + Math.pow((c1.getB() - c2.getB()), 2);
    }

    public static double difference(CIELab c1, CIELab c2) {
        return Math.pow(differenceWithoutRoot(c1, c2), 1 / 2);
    }



    public static double differenceWithoutRoot(double L1, double a1, double b1, double L2, double a2, double b2) {
        return Math.pow((L1 - L2), 2) + Math.pow((a1 - a2), 2) + Math.pow((b1 - b2), 2);
    }

    public static double difference(double L1, double a1, double b1, double L2, double a2, double b2) {
        return Math.pow(differenceWithoutRoot(L1, a1, b1, L2, a2, b2), 1 / 2);
    }

}

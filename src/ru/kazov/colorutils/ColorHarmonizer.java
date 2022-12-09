/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kazov.colorutils;

import ru.kazov.colorutils.colorspaces.HSV;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kazov
 */
public class ColorHarmonizer {

    public static final int METHOD_COMPLEMENTARY = 0;
    public static final int METHOD_SPLIT_COMPLEMENTARY = 1;
    public static final int METHOD_ANALOGOUS = 2;
    public static final int METHOD_ANALOGOUS_ACCENT = 3;
    public static final int METHOD_TRIADIC = 4;
    public static final int METHOD_SQUARE = 5;
    public static final int METHOD_TETRADIC_PLUS = 6;
    public static final int METHOD_TETRADIC_MINUS = 7;
    public static final int METHOD_CLASH = 8;
    public static final int METHOD_FIVE_TONE = 9;
    public static final int METHOD_SIX_TONE = 10;
    public static final int METHOD_MONOCHROMATIC = 11;

    public static List<HSV> harmonize(HSV hsv, int method) {
        List<HSV> list = new ArrayList();
        switch (method) {
            case METHOD_COMPLEMENTARY:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 180) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_SPLIT_COMPLEMENTARY:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 150) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 210) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_ANALOGOUS:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 330) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 30) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_ANALOGOUS_ACCENT:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 330) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 30) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 180) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_TRIADIC:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 120) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 240) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_SQUARE:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 90) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 180) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 270) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_TETRADIC_PLUS:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 60) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 180) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 240) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_TETRADIC_MINUS:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 120) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 180) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH() + 300) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_CLASH:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+90) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+270) % 360, hsv.getS(), hsv.getV()));
            case METHOD_FIVE_TONE:
                list.add(new HSV((hsv.getH()) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+60) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+120) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+240) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+300) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_SIX_TONE:
                list.add(new HSV((hsv.getH()+30) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+90) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+120) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+240) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+270) % 360, hsv.getS(), hsv.getV()));
                list.add(new HSV((hsv.getH()+330) % 360, hsv.getS(), hsv.getV()));
                break;
            case METHOD_MONOCHROMATIC:
                list.add(new HSV(hsv.getH(), 20, hsv.getV()));
                list.add(new HSV(hsv.getH(), 40, hsv.getV()));
                list.add(new HSV(hsv.getH(), 60, hsv.getV()));
                list.add(new HSV(hsv.getH(), 80, hsv.getV()));
                list.add(new HSV(hsv.getH(), 100, hsv.getV()));
                break;
            default:
                list.add(hsv);
                break;
        }

        return list;
    }
}

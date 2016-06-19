/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.das.colorutil.colorsystems;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Kaz
 */
public class ColorSystem {

    public final int OBSERVER_2 = 0;
    public final int OBSERVER_10 = 1;

    public final int ILLUMINANT_A = 0;
    public final int ILLUMINANT_C = 1;
    public final int ILLUMINANT_D50 = 2;
    public final int ILLUMINANT_D55 = 3;
    public final int ILLUMINANT_D65 = 4;
    public final int ILLUMINANT_D75 = 5;
    public final int ILLUMINANT_F2 = 6;
    public final int ILLUMINANT_F7 = 7;
    public final int ILLUMINANT_F11 = 8;

    private double ref_x = 95.047;
    private double ref_y = 100;
    private double ref_z = 108.883;

    protected void setTristimulus(int observer, int illuminant) {

        if (observer == OBSERVER_2) {
            switch (illuminant) {
                case ILLUMINANT_A:
                    ref_x = 109.850;
                    ref_z = 35.585;
                    break;
                case ILLUMINANT_C:
                    ref_x = 98.074;
                    ref_z = 118.232;
                    break;
                case ILLUMINANT_D50:
                    ref_x = 96.422;
                    ref_z = 82.521;
                    break;
                case ILLUMINANT_D55:
                    ref_x = 95.682;
                    ref_z = 92.149;
                    break;
                case ILLUMINANT_D65:
                    ref_x = 95.047;
                    ref_z = 108.883;
                    break;
                case ILLUMINANT_D75:
                    ref_x = 94.972;
                    ref_z = 122.638;
                    break;
                case ILLUMINANT_F2:
                    ref_x = 99.187;
                    ref_z = 67.395;
                    break;
                case ILLUMINANT_F7:
                    ref_x = 95.044;
                    ref_z = 108.755;
                    break;
                case ILLUMINANT_F11:
                    ref_x = 100.966;
                    ref_z = 64.370;
                    break;
                default:
                    ref_x = 95.047;
                    ref_z = 108.883;
                    break;
            }
        } else {
            switch (illuminant) {
                case ILLUMINANT_A:
                    ref_x = 111.144;
                    ref_z = 35.200;
                    break;
                case ILLUMINANT_C:
                    ref_x = 97.285;
                    ref_z = 116.145;
                    break;
                case ILLUMINANT_D50:
                    ref_x = 96.720;
                    ref_z = 81.427;
                    break;
                case ILLUMINANT_D55:
                    ref_x = 95.799;
                    ref_z = 90.926;
                    break;
                case ILLUMINANT_D65:
                    ref_x = 94.811;
                    ref_z = 107.304;
                    break;
                case ILLUMINANT_D75:
                    ref_x = 94.416;
                    ref_z = 120.641;
                    break;
                case ILLUMINANT_F2:
                    ref_x = 103.280;
                    ref_z = 69.026;
                    break;
                case ILLUMINANT_F7:
                    ref_x = 95.792;
                    ref_z = 107.687;
                    break;
                case ILLUMINANT_F11:
                    ref_x = 103.866;
                    ref_z = 65.627;
                    break;
                default:
                    ref_x = 94.811;
                    ref_z = 107.304;
                    break;
            }
        }

    }

    public CMYK toCMYK() {
        if (this instanceof RGB) {
            return RGBtoCMYK((RGB) this);
        } else if (this instanceof CMYK) {
            return (CMYK) this;
        } else if (this instanceof HSV) {
            return RGBtoCMYK(HSVtoRGB((HSV) this));
        } else if (this instanceof HSL) {
            return RGBtoCMYK(HSLtoRGB((HSL) this));
        } else if (this instanceof XYZ) {
            return RGBtoCMYK(XYZtoRGB((XYZ) this));
        } else if (this instanceof Yxy) {
            return RGBtoCMYK(XYZtoRGB(YxytoXYZ((Yxy) this)));
        } else if (this instanceof CIELab) {
            return RGBtoCMYK(XYZtoRGB(CIELabtoXYZ((CIELab) this)));
        } else if (this instanceof CIELCH) {
            return RGBtoCMYK(XYZtoRGB(CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this))));
        } else if (this instanceof CIELuv) {
            return RGBtoCMYK(XYZtoRGB(CIELuvtoXYZ((CIELuv) this)));
        } else if (this instanceof HunterLab) {
            return RGBtoCMYK(XYZtoRGB(HunterLabtoXYZ((HunterLab) this)));
        }
        return null;
    }

    public HSV toHSV() {
        if (this instanceof RGB) {
            return RGBtoHSV((RGB) this);
        } else if (this instanceof CMYK) {
            return RGBtoHSV(CMYKtoRGB((CMYK) this));
        } else if (this instanceof HSV) {
            return (HSV) this;
        } else if (this instanceof HSL) {
            return RGBtoHSV(HSLtoRGB((HSL) this));
        } else if (this instanceof XYZ) {
            return RGBtoHSV(XYZtoRGB((XYZ) this));
        } else if (this instanceof Yxy) {
            return RGBtoHSV(XYZtoRGB(YxytoXYZ((Yxy) this)));
        } else if (this instanceof CIELab) {
            return RGBtoHSV(XYZtoRGB(CIELabtoXYZ((CIELab) this)));
        } else if (this instanceof CIELCH) {
            return RGBtoHSV(XYZtoRGB(CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this))));
        } else if (this instanceof CIELuv) {
            return RGBtoHSV(XYZtoRGB(CIELuvtoXYZ((CIELuv) this)));
        } else if (this instanceof HunterLab) {
            return RGBtoHSV(XYZtoRGB(HunterLabtoXYZ((HunterLab) this)));
        }
        return null;
    }

    public HSL toHSL() {
        if (this instanceof RGB) {
            return RGBtoHSL((RGB) this);
        } else if (this instanceof CMYK) {
            return RGBtoHSL(CMYKtoRGB((CMYK) this));
        } else if (this instanceof HSV) {
            return RGBtoHSL(HSVtoRGB((HSV) this));
        } else if (this instanceof HSL) {
            return (HSL) this;
        } else if (this instanceof XYZ) {
            return RGBtoHSL(XYZtoRGB((XYZ) this));
        } else if (this instanceof Yxy) {
            return RGBtoHSL(XYZtoRGB(YxytoXYZ((Yxy) this)));
        } else if (this instanceof CIELab) {
            return RGBtoHSL(XYZtoRGB(CIELabtoXYZ((CIELab) this)));
        } else if (this instanceof CIELCH) {
            return RGBtoHSL(XYZtoRGB(CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this))));
        } else if (this instanceof CIELuv) {
            return RGBtoHSL(XYZtoRGB(CIELuvtoXYZ((CIELuv) this)));
        } else if (this instanceof HunterLab) {
            return RGBtoHSL(XYZtoRGB(HunterLabtoXYZ((HunterLab) this)));
        }
        return null;
    }

    public RGB toRGB() {
        if (this instanceof RGB) {
            return (RGB) this;
        } else if (this instanceof CMYK) {
            return CMYKtoRGB((CMYK) this);
        } else if (this instanceof HSV) {
            return HSVtoRGB((HSV) this);
        } else if (this instanceof HSL) {
            return HSLtoRGB((HSL) this);
        } else if (this instanceof XYZ) {
            return XYZtoRGB((XYZ) this);
        } else if (this instanceof Yxy) {
            return XYZtoRGB(YxytoXYZ((Yxy) this));
        } else if (this instanceof CIELab) {
            return XYZtoRGB(CIELabtoXYZ((CIELab) this));
        } else if (this instanceof CIELCH) {
            return XYZtoRGB(CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this)));
        } else if (this instanceof CIELuv) {
            return XYZtoRGB(CIELuvtoXYZ((CIELuv) this));
        } else if (this instanceof HunterLab) {
            return XYZtoRGB(HunterLabtoXYZ((HunterLab) this));
        }
        return null;
    }

    public XYZ toXYZ() {
        if (this instanceof RGB) {
            return RGBtoXYZ((RGB) this);
        } else if (this instanceof CMYK) {
            return RGBtoXYZ(CMYKtoRGB((CMYK) this));
        } else if (this instanceof HSV) {
            return RGBtoXYZ(HSVtoRGB((HSV) this));
        } else if (this instanceof HSL) {
            return RGBtoXYZ(HSLtoRGB((HSL) this));
        } else if (this instanceof XYZ) {
            return (XYZ) this;
        } else if (this instanceof Yxy) {
            return YxytoXYZ((Yxy) this);
        } else if (this instanceof CIELab) {
            return CIELabtoXYZ((CIELab) this);
        } else if (this instanceof CIELCH) {
            return CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this));
        } else if (this instanceof CIELuv) {
            return CIELuvtoXYZ((CIELuv) this);
        } else if (this instanceof HunterLab) {
            return HunterLabtoXYZ((HunterLab) this);
        }
        return null;
    }

    public CIELab toCIELab() {
        if (this instanceof RGB) {
            return XYZtoCIELab(RGBtoXYZ((RGB) this));
        } else if (this instanceof CMYK) {
            return XYZtoCIELab(RGBtoXYZ(CMYKtoRGB((CMYK) this)));
        } else if (this instanceof HSV) {
            return XYZtoCIELab(RGBtoXYZ(HSVtoRGB((HSV) this)));
        } else if (this instanceof HSL) {
            return XYZtoCIELab(RGBtoXYZ(HSLtoRGB((HSL) this)));
        } else if (this instanceof XYZ) {
            return XYZtoCIELab((XYZ) this);
        } else if (this instanceof Yxy) {
            return XYZtoCIELab(YxytoXYZ((Yxy) this));
        } else if (this instanceof CIELab) {
            return (CIELab) this;
        } else if (this instanceof CIELCH) {
            return CIELCHtoCIELab((CIELCH) this);
        } else if (this instanceof CIELuv) {
            return XYZtoCIELab(CIELuvtoXYZ((CIELuv) this));
        } else if (this instanceof HunterLab) {
            return XYZtoCIELab(HunterLabtoXYZ((HunterLab) this));
        }
        return null;
    }
    
    public CIELCH toCIELCH() {
        if (this instanceof RGB) {
            return CIELabtoCIELCH(XYZtoCIELab(RGBtoXYZ((RGB) this)));
        } else if (this instanceof CMYK) {
            return CIELabtoCIELCH(XYZtoCIELab(RGBtoXYZ(CMYKtoRGB((CMYK) this))));
        } else if (this instanceof HSV) {
            return CIELabtoCIELCH(XYZtoCIELab(RGBtoXYZ(HSVtoRGB((HSV) this))));
        } else if (this instanceof HSL) {
            return CIELabtoCIELCH(XYZtoCIELab(RGBtoXYZ(HSLtoRGB((HSL) this))));
        } else if (this instanceof XYZ) {
            return CIELabtoCIELCH(XYZtoCIELab((XYZ) this));
        } else if (this instanceof Yxy) {
            return CIELabtoCIELCH(XYZtoCIELab(YxytoXYZ((Yxy) this)));
        } else if (this instanceof CIELab) {
            return CIELabtoCIELCH((CIELab) this);
        } else if (this instanceof CIELCH) {
            return (CIELCH) this;
        } else if (this instanceof CIELuv) {
            return CIELabtoCIELCH(XYZtoCIELab(CIELuvtoXYZ((CIELuv) this)));
        } else if (this instanceof HunterLab) {
            return CIELabtoCIELCH(XYZtoCIELab(HunterLabtoXYZ((HunterLab) this)));
        }
        return null;
    }
    
    public Yxy toYxy() {
        if (this instanceof RGB) {
            return XYZtoYxy(RGBtoXYZ((RGB) this));
        } else if (this instanceof CMYK) {
            return XYZtoYxy(RGBtoXYZ(CMYKtoRGB((CMYK) this)));
        } else if (this instanceof HSV) {
            return XYZtoYxy(RGBtoXYZ(HSVtoRGB((HSV) this)));
        } else if (this instanceof HSL) {
            return XYZtoYxy(RGBtoXYZ(HSLtoRGB((HSL) this)));
        } else if (this instanceof XYZ) {
            return XYZtoYxy((XYZ) this);
        } else if (this instanceof Yxy) {
            return (Yxy) this;
        } else if (this instanceof CIELab) {
            return XYZtoYxy(CIELabtoXYZ((CIELab) this));
        } else if (this instanceof CIELCH) {
            return XYZtoYxy(CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this)));
        } else if (this instanceof CIELuv) {
            return XYZtoYxy(CIELuvtoXYZ((CIELuv) this));
        } else if (this instanceof HunterLab) {
            return XYZtoYxy(HunterLabtoXYZ((HunterLab) this));
        }
        return null;
    }
    
    public CIELuv toCIELuv() {
        if (this instanceof RGB) {
            return XYZtoCIELuv(RGBtoXYZ((RGB) this));
        } else if (this instanceof CMYK) {
            return XYZtoCIELuv(RGBtoXYZ(CMYKtoRGB((CMYK) this)));
        } else if (this instanceof HSV) {
            return XYZtoCIELuv(RGBtoXYZ(HSVtoRGB((HSV) this)));
        } else if (this instanceof HSL) {
            return XYZtoCIELuv(RGBtoXYZ(HSLtoRGB((HSL) this)));
        } else if (this instanceof XYZ) {
            return XYZtoCIELuv((XYZ) this);
        } else if (this instanceof Yxy) {
            return XYZtoCIELuv(YxytoXYZ((Yxy) this));
        } else if (this instanceof CIELab) {
            return XYZtoCIELuv(CIELabtoXYZ((CIELab) this));
        } else if (this instanceof CIELCH) {
            return XYZtoCIELuv(CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this)));
        } else if (this instanceof CIELuv) {
            return (CIELuv) this;
        } else if (this instanceof HunterLab) {
            return XYZtoCIELuv(HunterLabtoXYZ((HunterLab) this));
        }
        return null;
    }
    
    public HunterLab toHunterLab() {
        if (this instanceof RGB) {
            return XYZtoHunterLab(RGBtoXYZ((RGB) this));
        } else if (this instanceof CMYK) {
            return XYZtoHunterLab(RGBtoXYZ(CMYKtoRGB((CMYK) this)));
        } else if (this instanceof HSV) {
            return XYZtoHunterLab(RGBtoXYZ(HSVtoRGB((HSV) this)));
        } else if (this instanceof HSL) {
            return XYZtoHunterLab(RGBtoXYZ(HSLtoRGB((HSL) this)));
        } else if (this instanceof XYZ) {
            return XYZtoHunterLab((XYZ) this);
        } else if (this instanceof Yxy) {
            return XYZtoHunterLab(YxytoXYZ((Yxy) this));
        } else if (this instanceof CIELab) {
            return XYZtoHunterLab(CIELabtoXYZ((CIELab) this));
        } else if (this instanceof CIELCH) {
            return XYZtoHunterLab(CIELabtoXYZ(CIELCHtoCIELab((CIELCH) this)));
        } else if (this instanceof CIELuv) {
            return XYZtoHunterLab(CIELuvtoXYZ((CIELuv) this));
        } else if (this instanceof HunterLab) {
            return (HunterLab) this;
        }
        return null;
    }

    private CMYK RGBtoCMYK(RGB rgb) {

        double r = rgb.R / 255.0;
        double g = rgb.getG() / 255.0;
        double b = rgb.getB() / 255.0;

        double C, M, Y;

        double K = (1 - Math.max(r, Math.max(g, b)));
        if (K == 1) {
            C = 0;
            M = 0;
            Y = 0;
        } else {
            C = ((1 - r - K) / (1 - K));
            M = ((1 - g - K) / (1 - K));
            Y = ((1 - b - K) / (1 - K));
        }

        return new CMYK(C * 100, M * 100, Y * 100, K * 100);
    }

    private RGB CMYKtoRGB(CMYK cmyk) {

        double c = (double) (cmyk.C / 100);
        double m = (double) (cmyk.M / 100);
        double y = (double) (cmyk.Y / 100);
        double k = (double) (cmyk.K / 100);

        double R = 255 * (1 - c) * (1 - k);
        double G = 255 * (1 - m) * (1 - k);
        double B = 255 * (1 - y) * (1 - k);

        return new RGB(R, G, B);
    }

    private HSV RGBtoHSV(RGB rgb) {

        double r = (double) (rgb.R / 255.0);
        double g = (double) (rgb.G / 255.0);
        double b = (double) (rgb.B / 255.0);

        double min = Math.min(r, Math.min(g, b));
        double max = Math.max(r, Math.max(g, b));
        double dmax = max - min;

        double v = max;
        double h = 0;
        double s = 0;

        if (dmax != 0) {
            s = dmax / max;

            double dR = (((max - r) / 6) + (dmax / 2)) / dmax;
            double dG = (((max - g) / 6) + (dmax / 2)) / dmax;
            double dB = (((max - b) / 6) + (dmax / 2)) / dmax;

            if (r == max) {
                h = (dB - dG);
            } else if (g == max) {
                h = ((1 / 3) + dR - dB);
            } else if (b == max) {
                h = ((2 / 3) + dG - dR);
            }

            if (h < 0) {
                h += 1;
            }
            if (h > 1) {
                h -= 1;
            }
        }

        h *= 360;
        s *= 100;
        v *= 100;

        return new HSV(h, s, v);
    }

    private RGB HSVtoRGB(HSV hsv) {
        double R, G, B;
        double H = hsv.H / 360;
        double S = hsv.S / 100;
        double V = hsv.V / 100;

        if (S == 0) {
            R = Math.round(V * 255);
            G = Math.round(V * 255);
            B = Math.round(V * 255);
        } else {
            double var_h = H * 6;
            if (var_h == 6) {
                var_h = 0;
            }
            int var_i = (int) Math.floor(var_h);
            double var_1 = V * (1 - S);
            double var_2 = V * (1 - S * (var_h - var_i));
            double var_3 = V * (1 - S * (1 - (var_h - var_i)));

            switch (var_i) {
                case 0:
                    R = V;
                    G = var_3;
                    B = var_1;
                    break;
                case 1:
                    R = var_2;
                    G = V;
                    B = var_1;
                    break;
                case 2:
                    R = var_1;
                    G = V;
                    B = var_3;
                    break;
                case 3:
                    R = var_1;
                    G = var_2;
                    B = V;
                    break;
                case 4:
                    R = var_3;
                    G = var_1;
                    B = V;
                    break;
                default:
                    R = V;
                    G = var_1;
                    B = var_2;
                    break;
            }

            R = Math.round(R * 255);
            G = Math.round(G * 255);
            B = Math.round(B * 255);
        }

        return new RGB(R, G, B);
    }

    private HSL RGBtoHSL(RGB rgb) {
        double r = (double) (rgb.R / 255.0);
        double g = (double) (rgb.G / 255.0);
        double b = (double) (rgb.B / 255.0);

        double min = Math.min(r, Math.min(g, b));
        double max = Math.max(r, Math.max(g, b));
        double dmax = max - min;

        double l = (min + max) / 2;
        double h = 0;
        double s = 0;

        if (dmax != 0) {

            if (l < 0.5) {
                s = dmax / (max + min);
            } else {
                s = dmax / (2 - max + min);
            }

            double dR = (((max - r) / 6) + (dmax / 2)) / dmax;
            double dG = (((max - g) / 6) + (dmax / 2)) / dmax;
            double dB = (((max - b) / 6) + (dmax / 2)) / dmax;

            if (r == max) {
                h = (dB - dG);
            } else if (g == max) {
                h = ((1 / 3) + dR - dB);
            } else if (b == max) {
                h = ((2 / 3) + dG - dR);
            }

            if (h < 0) {
                h += 1;
            }
            if (h > 1) {
                h -= 1;
            }
        }

        h *= 360;
        s *= 100;
        l *= 100;

        return new HSL(h, s, l);
    }

    private RGB HSLtoRGB(HSL hsl) {
        double R, G, B;
        double H = hsl.H / 360;
        double S = hsl.S / 100;
        double L = hsl.L / 100;

        if (S == 0) {
            R = Math.round(L * 255);
            G = Math.round(L * 255);
            B = Math.round(L * 255);
        } else {
            double var_2;
            if (L < 0.5) {
                var_2 = L * (1 + S);
            } else {
                var_2 = (L + S) - (S * L);
            }
            double var_1 = 2 * L - var_2;

            R = HUEtoRGB(var_1, var_2, H + (1 / 3));
            G = HUEtoRGB(var_1, var_2, H);
            B = HUEtoRGB(var_1, var_2, H - (1 / 3));

            R = Math.round(R * 255);
            G = Math.round(G * 255);
            B = Math.round(B * 255);
        }

        return new RGB(R, G, B);
    }

    private double HUEtoRGB(double v1, double v2, double vH) {

        if (vH < 0) {
            vH += 1;
        }
        if (vH > 1) {
            vH -= 1;
        }
        if ((6 * vH) < 1) {
            return (v1 + (v2 - v1) * 6 * vH);
        }
        if ((2 * vH) < 1) {
            return (v2);
        }
        if ((3 * vH) < 2) {
            return (v1 + (v2 - v1) * ((2 / 3) - vH) * 6);
        }
        return (v1);

    }

    private XYZ RGBtoXYZ(RGB rgb) {

        double r = (double) (rgb.R / 255.0);
        double g = (double) (rgb.G / 255.0);
        double b = (double) (rgb.B / 255.0);

        if (r > 0.04045) {
            r = (double) Math.pow(((r + 0.055) / 1.055), 2.4);
        } else {
            r = (double) (r / 12.92);
        }

        if (g > 0.04045) {
            g = (double) Math.pow(((g + 0.055) / 1.055), 2.4);
        } else {
            g = (double) (g / 12.92);
        }

        if (b > 0.04045) {
            b = (double) Math.pow(((b + 0.055) / 1.055), 2.4);
        } else {
            b = (double) (b / 12.92);
        }

        double X = (double) (r * 0.4124 + g * 0.3576 + b * 0.1805) * 100;
        double Y = (double) (r * 0.2126 + g * 0.7152 + b * 0.0722) * 100;
        double Z = (double) (r * 0.0193 + g * 0.1192 + b * 0.9505) * 100;

        return new XYZ(X, Y, Z);
    }

    private RGB XYZtoRGB(XYZ xyz) {
        double var_X = xyz.X / 100;
        double var_Y = xyz.Y / 100;
        double var_Z = xyz.Z / 100;

        double var_R = var_X * 3.2406 + var_Y * -1.5372 + var_Z * -0.4986;
        double var_G = var_X * -0.9689 + var_Y * 1.8758 + var_Z * 0.0415;
        double var_B = var_X * 0.0557 + var_Y * -0.2040 + var_Z * 1.0570;

        if (var_R > 0.0031308) {
            var_R = 1.055 * Math.pow(var_R, (1 / 2.4)) - 0.055;

        } else {
            var_R = 12.92 * var_R;

        }
        if (var_G > 0.0031308) {
            var_G = 1.055 * Math.pow(var_G, (1 / 2.4)) - 0.055;

        } else {
            var_G = 12.92 * var_G;

        }
        if (var_B > 0.0031308) {
            var_B = 1.055 * Math.pow(var_B, (1 / 2.4)) - 0.055;

        } else {
            var_B = 12.92 * var_B;

        }
        double R = Math.round(var_R * 255);
        double G = Math.round(var_G * 255);
        double B = Math.round(var_B * 255);

        return new RGB(R, G, B);
    }

    private CIELab XYZtoCIELab(XYZ xyz) {

        double x = (xyz.X / ref_x);
        double y = (xyz.Y / ref_y);
        double z = (xyz.Z / ref_z);

        if (x > 0.008856) {
            x = (double) Math.pow(x, (1.0 / 3.0));
        } else {
            x = (double) ((7.787 * x) + (16.0 / 116.0));
        }

        if (y > 0.008856) {
            y = (double) Math.pow(y, (1.0 / 3.0));
        } else {
            y = (double) ((7.787 * y) + (16.0 / 116.0));
        }

        if (z > 0.008856) {
            z = (double) Math.pow(z, (1.0 / 3.0));
        } else {
            z = (double) ((7.787 * z) + (16.0 / 116.0));
        }

        double L = (116 * y) - 16;
        double A = 500 * (x - y);
        double B = 200 * (y - z);

        return new CIELab(L, A, B);
    }

    private XYZ CIELabtoXYZ(CIELab lab) {
        double var_Y = (lab.L + 16) / 116;
        double var_X = lab.a / 500 + var_Y;
        double var_Z = var_Y - lab.b / 200;

        if (Math.pow(var_Y, 3) > 0.008856) {
            var_Y = Math.pow(var_Y, 3);
        } else {
            var_Y = (var_Y - 16 / 116) / 7.787;
        }
        if (Math.pow(var_X, 3) > 0.008856) {
            var_X = Math.pow(var_X, 3);
        } else {
            var_X = (var_X - 16 / 116) / 7.787;
        }
        if (Math.pow(var_Z, 3) > 0.008856) {
            var_Z = Math.pow(var_Z, 3);
        } else {
            var_Z = (var_Z - 16 / 116) / 7.787;
        }
        double X = ref_x * var_X;
        double Y = ref_y * var_Y;
        double Z = ref_z * var_Z;
        return new XYZ(X, Y, Z);
    }

    private CIELCH CIELabtoCIELCH(CIELab lab) {
        double H = Math.atan2(lab.b, lab.a);

        if (H > 0) {
            H = (H / Math.PI) * 180;
        } else {
            H = 360 - (Math.abs(H) / Math.PI) * 180;
        }
        double L = lab.L;
        double C = Math.sqrt(Math.pow(lab.a, 2) + Math.pow(lab.b, 2));

        return new CIELCH(L, C, H);
    }

    private CIELab CIELCHtoCIELab(CIELCH lch) {
        double L = lch.L;
        double a = lch.C * Math.cos(Math.toRadians(lch.H));
        double b = lch.C * Math.sin(Math.toRadians(lch.H));

        return new CIELab(L, a, b);
    }

    private Yxy XYZtoYxy(XYZ xyz) {
        double Y = xyz.Y;
        double x = xyz.X / (xyz.X + xyz.Y + xyz.Z);
        double y = xyz.Y / (xyz.X + xyz.Y + xyz.Z);

        return new Yxy(Y, x, y);
    }

    private XYZ YxytoXYZ(Yxy yxy) {
        double X = yxy.x * (yxy.Y / yxy.y2);
        double Y = yxy.Y;
        double Z = (1 - yxy.x - yxy.y2) * (yxy.Y / yxy.y2);
        return new XYZ(X, Y, Z);
    }

    private CIELuv XYZtoCIELuv(XYZ xyz) {
        double var_U = (4 * xyz.X) / (xyz.X + (15 * xyz.Y) + (3 * xyz.Z));
        double var_V = (9 * xyz.Y) / (xyz.X + (15 * xyz.Y) + (3 * xyz.Z));

        double var_Y = xyz.Y / 100;
        if (var_Y > 0.008856) {
            var_Y = Math.pow(var_Y, (1 / 3));
        } else {
            var_Y = (7.787 * var_Y) + (16 / 116);
        }

        double ref_U = (4 * ref_x) / (ref_x + (15 * ref_y) + (3 * ref_z));
        double ref_V = (9 * ref_y) / (ref_x + (15 * ref_y) + (3 * ref_z));

        double L = (116 * var_Y) - 16;
        double u = 13 * L * (var_U - ref_U);
        double v = 13 * L * (var_V - ref_V);

        return new CIELuv(L, u, v);
    }

    private XYZ CIELuvtoXYZ(CIELuv luv) {
        double var_Y = (luv.L + 16) / 116;
        if (Math.pow(var_Y, 3) > 0.008856) {
            var_Y = Math.pow(var_Y, 3);
        } else {
            var_Y = (var_Y - 16 / 116) / 7.787;
        }

        double ref_U = (4 * ref_x) / (ref_x + (15 * ref_y) + (3 * ref_z));
        double ref_V = (9 * ref_y) / (ref_x + (15 * ref_y) + (3 * ref_z));

        double var_U = luv.u / (13 * luv.L) + ref_U;
        double var_V = luv.v / (13 * luv.L) + ref_V;

        double Y = var_Y * 100;
        double X = -(9 * Y * var_U) / ((var_U - 4) * var_V - var_U * var_V);
        double Z = (9 * Y - (15 * var_V * Y) - (var_V * X)) / (3 * var_V);

        return new XYZ(X, Y, Z);
    }

    private HunterLab XYZtoHunterLab(XYZ xyz) {
        double L = 10 * Math.sqrt(xyz.Y);
        double a = 17.5 * (((1.02 * xyz.X) - xyz.Y) / Math.sqrt(xyz.Y));
        double b = 7 * ((xyz.Y - (0.847 * xyz.Z)) / Math.sqrt(xyz.Y));

        return new HunterLab(L, a, b);
    }

    private XYZ HunterLabtoXYZ(HunterLab lab) {
        double var_Y = lab.L / 10;
        double var_X = lab.a / 17.5 * lab.L / 10;
        double var_Z = lab.b / 7 * lab.L / 10;

        double Y = Math.pow(var_Y, 2);
        double X = (var_X + Y) / 1.02;
        double Z = -(var_Z - Y) / 0.847;

        return new XYZ(X, Y, Z);
    }

    protected double rd(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

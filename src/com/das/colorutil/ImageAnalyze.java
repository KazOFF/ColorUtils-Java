/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.das.colorutil;

import com.das.colorutil.utils.Quantize;
import com.das.colorutil.colorspaces.RGB;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kazov
 */
public class ImageAnalyze {

    public static RGB averageColor(BufferedImage image) {

        int pixelCount = image.getWidth() * image.getHeight();
        int red, green, blue;
        red = green = blue = 0;

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int[] pixels = getRGBArrayFromPixel(image.getRGB(i, j));

                red += pixels[0];
                green += pixels[1];
                blue += pixels[2];
            }
        }

        red /= pixelCount;
        green /= pixelCount;
        blue /= pixelCount;

        return new RGB(red, green, blue);

    }

    public static RGB dominantColor(BufferedImage image) {
        Map histogram = new HashMap();

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int rgb = image.getRGB(i, j);

                int rgbArray[] = getRGBArrayFromPixel(rgb);

                if (!isGray(rgbArray)) {

                    Integer counter = (Integer) histogram.get(rgb);

                    if (counter == null) {
                        counter = 0;
                    }
                    counter++;

                    histogram.put(rgb, counter);
                }
            }
        }

        return getMostCommonColor(histogram);
    }

    public static List<RGB> generatePalette(BufferedImage image, int mNumberOfColors) {
        List<RGB> mColorPallete = new ArrayList<>();

        int[][] pixelsMatrix = getPixelsMatrixFromBitmap(image);
        int[] calculatedPalette = Quantize.quantizeImage(pixelsMatrix, mNumberOfColors);

        for (int x = 0; x < calculatedPalette.length; x++) {
            int[] pixels = getRGBArrayFromPixel(calculatedPalette[x]);
            mColorPallete.add(new RGB(pixels[0], pixels[1], pixels[2]));
        }

        return mColorPallete;
    }

    private static boolean isGray(int[] rgbArr) {

        int rgDiff = rgbArr[0] - rgbArr[1];
        int rbDiff = rgbArr[0] - rgbArr[2];

        int tolerance = 100;

        if (rgDiff > tolerance || rgDiff < -tolerance) {
            if (rbDiff > tolerance || rbDiff < -tolerance) {
                return false;
            }
        }
        return true;
    }

    private static RGB getMostCommonColor(Map histogram) {

        List list = new LinkedList(histogram.entrySet());

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        Map.Entry me = (Map.Entry) list.get(list.size() - 1);
        int[] rgb = getRGBArrayFromPixel((Integer) me.getKey());

        return new RGB(rgb[0], rgb[1], rgb[2]);
    }

    private static int[] getRGBArrayFromPixel(int pixel) {
        int red = (pixel & 0x00ff0000) >> 16;
        int green = (pixel & 0x0000ff00) >> 8;
        int blue = pixel & 0x000000ff;

        return new int[]{red, green, blue};
    }

    private static int[][] getPixelsMatrixFromBitmap(BufferedImage image) {

        int[][] pixelMatrix = new int[image.getWidth()][image.getHeight()];

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                pixelMatrix[i][j] = image.getRGB(i, j);
            }
        }

        return pixelMatrix;
    }
}

package day04.ex00.ImagesToChar.src.java.edu.school21.printer.logic;

import java.awt.image.BufferedImage;

public class PrintImage {

    public static void print(char whiteColor, char blackColor, BufferedImage image) {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int pixel = image.getRGB(j, i);
                if ((pixel & 0x00FFFFFF) == 0) {
                    System.out.print(blackColor);
                } else {
                    System.out.print(whiteColor);
                }
            }
            System.out.println();
        }
    }
}

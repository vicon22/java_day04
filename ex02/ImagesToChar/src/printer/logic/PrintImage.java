package day04.ex02.ImagesToChar.src.printer.logic;

import java.awt.image.BufferedImage;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class PrintImage {

    public static void print(String whiteColor, String blackColor, BufferedImage image) {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int pixel = image.getRGB(j, i);
                if ((pixel & 0x00FFFFFF) == 0) {
                    System.out.print(colorize(" ", ColorSelection.selection(blackColor)));
                } else {
                    System.out.print(colorize(" ", ColorSelection.selection(whiteColor)));;
                }
            }
            System.out.println();
        }
    }
}

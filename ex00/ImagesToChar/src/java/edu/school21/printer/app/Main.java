package day04.ex00.ImagesToChar.src.java.edu.school21.printer.app;

import day04.ex00.ImagesToChar.src.java.edu.school21.printer.logic.PrintImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        if (args.length !=3)
        {
            System.out.println("You have to put three args!");
            System.out.println("1. whiteColor char 2. blackColor char 3.Path to image");
            System.exit(-1);
        }
        char whiteColor = args[0].charAt(0);
        char blackColor = args[1].charAt(0);
        String path = args[2];
        //String path = "C:\\Users\\kosto\\Desktop\\Java проекты\\untitled1\\src\\day04\\ex00\\ImagesToChar\\src\\java\\edu\\school21\\printer\\app\\it.bmp";
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert image != null;
        PrintImage.print(whiteColor, blackColor, image);
        }
}

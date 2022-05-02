package day04.ex02.ImagesToChar.src.printer.app;

import day04.ex02.ImagesToChar.src.printer.logic.PrintImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.MAGENTA_BACK;
import static com.diogonunes.jcolor.Attribute.YELLOW_TEXT;

public class Program {
    public static void main(String[] args){

//        if (args.length !=3)
//        {
//            System.out.println("You have to put three args!");
//            System.out.println("1. whiteColor char 2. blackColor char 3.Path to image");
//            System.exit(-1);
//        }
//        char whiteColor = args[0].charAt(0);
//        char blackColor = args[1].charAt(0);
//        String path = args[2];

        String whiteColor = args[0].split("=")[1].toLowerCase();
        String blackColor = args[1].split("=")[1].toLowerCase();
        Scanner scanner = new Scanner(System.in);
        //System.out.print("-> ");
        //String path = scanner.nextLine();
        //System.out.println(path);
        String path = "C:\\Users\\kosto\\Desktop\\Java проекты\\untitled1\\src\\day04\\ex02\\ImagesToChar\\src\\resources\\it.bmp";
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

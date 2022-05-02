package day04.ex02.ImagesToChar.src.printer.logic;

import com.diogonunes.jcolor.Attribute;

public class ColorSelection {

    public static Attribute selection(String color){
        if (color.equals("green")){
            return Attribute.GREEN_BACK(); }
        else if (color.equals("red")){
            return Attribute.RED_BACK(); }
        else if (color.equals("yellow")){
            return Attribute.YELLOW_BACK(); }
        else if (color.equals("blue")){
            return Attribute.BLUE_BACK(); }
        else if (color.equals("black")){
            return Attribute.BLACK_BACK(); }
        else if (color.equals("white")){
            return Attribute.WHITE_BACK(); }
        else{
            return Attribute.WHITE_BACK(); }
        }
}

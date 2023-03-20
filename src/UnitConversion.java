import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        // mass converting formula
        double kg_to_lb = 2.2046; double kg_to_Gram = 1000; double kg_to_UsTon = 0.00110231;
        double kg_to_Stone = 0.157473; double kg_to_Oz = 35.274;

        double lb_to_kg = .45; double lb_to_Gram = 453.59237; double lb_to_UsTon = 0.0005;
        double lb_to_Stone = 0.0714286; double lb_to_Oz = 16;

        double Gram_to_kg = 0.001; double Gram_to_UsTon = 0.00000220462262; double Gram_to_Stone = 0.000157473;
        double Gram_to_Oz = 0.035274; double Gram_to_lb = 0.00220462;

        double UsTon_to_lb = 2000; double UsTon_to_kg = 907.185; double UsTon_to_Gram = 907185;
        double UsTon_to_Stone = 143.0; double UsTon_to_Oz = 32000;

        double Stone_to_lb = 14; double Stone_to_kg = 6.350293; double Stone_to_Gram = 6350.293;
        double Stone_to_UsTon = 0.007; double Stone_to_Oz = 224;

        double Oz_to_lb = 0.0625; double Oz_to_kg = 0.0283495; double Oz_to_Gram = 28.3495;
        double Oz_to_UsTon = 0.000028; double Oz_to_Stone = 0.0044643;

        // Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Convert from (ex. Gram ,kg ,lb ,Oz ,UsTon ,Stone ) : ");
        String convertFrom = in.nextLine();

        System.out.print("Convert to (ex. Gram ,kg ,lb ,Oz ,UsTon ,Stone ) : ");
        String convertTo = in.nextLine();

        String convertType = convertFrom + "_to_" + convertTo;

        System.out.println("Type the value you want to convert from (" + convertFrom + ") : ");
        int value = in.nextInt();

        double convertedValue = 0;

        // conditional statements
        if (convertType.equals("kg_to_lb")) {
            convertedValue = value * kg_to_lb;
        } else if (convertType.equals("kg_to_Gram")) {
            convertedValue = value * kg_to_Gram;
        }else if (convertType.equals("kg_to_UsTon")) {
            convertedValue = value * kg_to_UsTon;
        }else if (convertType.equals("kg_to_Stone")) {
            convertedValue = value * kg_to_Stone;
        }else if (convertType.equals("kg_to_Oz")) {
            convertedValue = value * kg_to_Oz;
        }else if (convertType.equals("lb_to_kg")) {
            convertedValue = value * lb_to_kg;
        }else if (convertType.equals("lb_to_Gram")) {
            convertedValue = value * lb_to_Gram;
        }else if (convertType.equals("lb_to_UsTon")) {
            convertedValue = value * lb_to_UsTon;
        }else if (convertType.equals("lb_to_Stone")) {
            convertedValue = value * lb_to_Stone;
        }else if (convertType.equals("lb_to_Oz")) {
            convertedValue = value * lb_to_Oz;
        }else if (convertType.equals("Gram_to_kg")) {
            convertedValue = value * Gram_to_kg;
        }else if (convertType.equals("Gram_to_UsTon")) {
            convertedValue = value * Gram_to_UsTon;
        }else if (convertType.equals("Gram_to_Stone")) {
            convertedValue = value * Gram_to_Stone;
        }else if (convertType.equals("Gram_to_Oz")) {
            convertedValue = value * Gram_to_Oz;
        }else if (convertType.equals("Gram_to_lb")) {
            convertedValue = value * Gram_to_lb;
        }else if (convertType.equals("UsTon_to_lb")) {
            convertedValue = value * UsTon_to_lb;
        }else if (convertType.equals("UsTon_to_kg")) {
            convertedValue = value * UsTon_to_kg;
        }else if (convertType.equals("UsTon_to_Gram")) {
            convertedValue = value * UsTon_to_Gram;
        }else if (convertType.equals("UsTon_to_Stone")) {
            convertedValue = value * UsTon_to_Stone;
        }else if (convertType.equals("UsTon_to_Oz")) {
            convertedValue = value * UsTon_to_Oz;
        }else if (convertType.equals("Stone_to_lb")) {
            convertedValue = value * Stone_to_lb;
        }else if (convertType.equals("Stone_to_kg")) {
            convertedValue = value * Stone_to_kg;
        }else if (convertType.equals("Stone_to_Gram")) {
            convertedValue = value * Stone_to_Gram;
        }else if (convertType.equals("Stone_to_UsTon")) {
            convertedValue = value * Stone_to_UsTon;
        }else if (convertType.equals("Stone_to_Oz")) {
            convertedValue = value * Stone_to_Oz;
        }else if (convertType.equals("Oz_to_lb")) {
            convertedValue = value * Oz_to_lb;
        }else if (convertType.equals("Oz_to_kg")) {
            convertedValue = value * Oz_to_kg;
        }else if (convertType.equals("Oz_to_Gram")) {
            convertedValue = value * Oz_to_Gram;
        }else if (convertType.equals("Oz_to_UsTon")) {
            convertedValue = value * Oz_to_UsTon;
        }else if (convertType.equals("Oz_to_Stone")) {
            convertedValue = value * Oz_to_Stone;
        } else {
            // indicates invalid conversion factor
            convertedValue = 0000000;
        }

        // for output the answer
        if (convertedValue > 0) {
            System.out.println("Convert what? " + value + " " + convertType + " = " + String.format("%.2f %s", convertedValue, convertTo));
        }
        else {
            System.out.println("Invalid conversion factor: " + convertType);
        }

    }
}

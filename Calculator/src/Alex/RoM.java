package Alex;

public class RoM {
    int inputAnswer;
    int intPart;
    int remainsPart;
    String outputAnswer;
    String outIntPart;
    String outRemainsPart;
    String a20 = "XX";
    String a30 = "XXX";
    String a40 = "XL";
    String a50 = "L";
    String a60 = "LX";
    String a70 = "LXX";
    String a80 = "LXXX";
    String a90 = "XC";
    String a100 = "C";





        String convert ( int inputAnswer){

        if (inputAnswer == 20) {
            outputAnswer = a20;
            return outputAnswer;
        }

        if (inputAnswer == 30) {
            outputAnswer = a30;
            return outputAnswer;
        }

        if (inputAnswer == 40) {
            outputAnswer = a40;
            return outputAnswer;
        }

        if (inputAnswer == 50) {
            outputAnswer = a50;
            return outputAnswer;
        }

        if (inputAnswer == 60) {
            outputAnswer = a60;
            return outputAnswer;
        }

        if (inputAnswer == 70) {
            outputAnswer = a70;
            return outputAnswer;
        }

        if (inputAnswer == 80) {
            outputAnswer = a80;
            return outputAnswer;
        }

        if (inputAnswer == 90) {
            outputAnswer = a90;
            return outputAnswer;
        }

        if (inputAnswer == 100) {
            outputAnswer = a100;
            return outputAnswer;
        }


        if ((inputAnswer >= -9) && (inputAnswer <= 10)) {

            ConvRome converter = new ConvRome();
            converter.input = inputAnswer;
            outputAnswer = converter.convert(inputAnswer);
            return outputAnswer;

        }

        if ((inputAnswer > 10) && (inputAnswer < 100)) {

            intPart = (inputAnswer / 10) * 10;
            remainsPart = inputAnswer % 10;

            ConvRome converter = new ConvRome();

            converter.input = intPart;
            outIntPart = converter.convert(intPart);

            converter.input = remainsPart;
            outRemainsPart = converter.convert(remainsPart);

            return outputAnswer = outIntPart + outRemainsPart;

        }
        return outputAnswer;
    }

}

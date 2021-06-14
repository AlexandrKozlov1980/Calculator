package Alex;

public class ConvRome {

    int input;
    String output;
    String a1 = "I";
    String a2 = "II";
    String a3 = "III";
    String a4 = "IV";
    String a5 = "V";
    String a6 = "VI";
    String a7 = "VII";
    String a8 = "VIII";
    String a9 = "IX";
    String a10 = "X";
    String a20 = "XX";
    String a30 = "XXX";
    String a40 = "XL";
    String a50 = "L";
    String a60 = "LX";
    String a70 = "LXX";
    String a80 = "LXXX";
    String a90 = "XC";
    String a100 = "C";

    String convert(int input){

        switch (input) {

            case 1:
                output = a1;
                break;
            case -1:
                output = "-"+a1;
                break;
            case 2:
                output = a2;
                break;
            case -2:
                output = "-"+a2;
                break;
            case 3:
                output = a3;
                break;
            case -3:
                output = "-"+a3;
                break;
            case 4:
                output = a4;
                break;
            case -4:
                output = "-"+a4;
                break;
            case 5:
                output = a5;
                break;
            case -5:
                output = "-"+a5;
                break;
            case 6:
                output = a6;
                break;
            case -6:
                output = "-"+a6;
                break;
            case 7:
                output = a7;
                break;
            case -7:
                output = "-"+a7;
                break;
            case 8:
                output = a8;
                break;
            case -8:
                output = "-"+a8;
                break;
            case 9:
                output = a9;
                break;
            case -9:
                output = "-"+a9;
                break;
            case 10:
                output = a10;
                break;
            case 20:
                output = a20;
                break;
            case 30:
                output = a30;
                break;
            case 40:
                output = a40;
                break;
            case 50:
                output = a50;
                break;
            case 60:
                output = a60;
                break;
            case 70:
                output = a70;
                break;
            case 80:
                output = a80;
                break;
            case 90:
                output = a90;
                break;
        }
        return output;
    }
}


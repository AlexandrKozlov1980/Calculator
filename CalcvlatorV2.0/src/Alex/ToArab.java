package Alex;

public class ToArab { //перевод римской цифры в арабскую


    String convToArab(String inputRomeNumber) {



        if ((inputRomeNumber.length() == 1) && (inputRomeNumber.charAt(0) == 'I')) {
            return "1";
        } else if ((inputRomeNumber.length() == 2) && ((inputRomeNumber.charAt(0) == 'I') && ((inputRomeNumber.charAt(1) == 'I')))) {
            return "2";
        } else if ((inputRomeNumber.length() == 3) && ((inputRomeNumber.charAt(0) == 'I') && (inputRomeNumber.charAt(1) == 'I') && (inputRomeNumber.charAt(2) == 'I'))) {
            return "3";
        } else if ((inputRomeNumber.length() == 2) && ((inputRomeNumber.charAt(0) == 'I') && (inputRomeNumber.charAt(1) == 'V'))) {
            return "4";
        } else if ((inputRomeNumber.length() == 1) && (inputRomeNumber.charAt(0) == 'V')) {
            return "5";
        } else if ((inputRomeNumber.length() == 2) && ((inputRomeNumber.charAt(0) == 'V') && (inputRomeNumber.charAt(1) == 'I'))) {
            return "6";
        } else if ((inputRomeNumber.length() == 3) && ((inputRomeNumber.charAt(0) == 'V') && (inputRomeNumber.charAt(1) == 'I') && (inputRomeNumber.charAt(2) == 'I'))) {
            return "7";
        } else if ((inputRomeNumber.length() == 4) && ((inputRomeNumber.charAt(0) == 'V') && (inputRomeNumber.charAt(1) == 'I') && (inputRomeNumber.charAt(2) == 'I') && (inputRomeNumber.charAt(3) == 'I'))) {
            return "8";
        } else if ((inputRomeNumber.length() == 2) && ((inputRomeNumber.charAt(0) == 'I') && (inputRomeNumber.charAt(1) == 'X'))) {
            return "9";
        } else if ((inputRomeNumber.length() == 1) && (inputRomeNumber.charAt(0) == 'X')) {
            return "10";
        } else {
            //System.out.println("ERROR");
            return "0";
        }

    }


}

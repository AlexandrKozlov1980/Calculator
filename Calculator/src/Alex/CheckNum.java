package Alex;

public class CheckNum{ // замена символа на целое число
    char name;

    int checkAnum() {
        if (name == '1') {
            return 1;
        } else if (name == '2') {
            return 2;
        } else if (name == '3') {
            return 3;
        } else if (name == '4') {
            return 4;
        } else if (name == '5') {
            return 5;
        } else if (name == '6') {
            return 6;
        } else if (name == '7') {
            return 7;
        } else if (name == '8') {
            return 8;
        } else if (name == '9') {
            return 9;
        } else {
            //System.out.println("ERROR");
            return 0;

        }
    }
}

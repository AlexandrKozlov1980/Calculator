package Alex;

public class InputOutputBlock {

    char sign; // знак
    String input; //входящая строка
    String output; //результат преобразования
    String numBeforeSign; // строка до знака +,-,*,/
    String numAfterSign; // строка после знака
    String firstRomeNum; // первое римское число преобразованное в арабское
    String secondRomeNum; // второе римское число преобразованное в арабское
    String outIntPart;
    String outRemainsPart;
    int length; // длина строки
    int i;// счетчик;
    int inputAnswer;
    int intPart;
    int remainsPart;
    String[] romeChar = {"I", "V", "X","L","C", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
    public boolean flag;

    String convToArab (String input)
    {
        if ((input.charAt(0) == '1') || (input.charAt(0) == '2') || (input.charAt(0) == '3') || (input.charAt(0) == '4')
        || (input.charAt(0) == '5') || (input.charAt(0) == '6') || (input.charAt(0) == '7') || (input.charAt(0) == '8')
        || (input.charAt(0) == '9'))
        {
            flag = false;
            output = input;
        }
        else
        {
            for (i=0; (input.charAt(i) != ('+')) && (input.charAt(i) != ('-')) && (input.charAt(i) != ('*')) && (input.charAt(i) != ('/')); i++)
            {

            }

                ToArab convert = new ToArab();

                length = input.length();

                numBeforeSign = input.substring(0,i);

                sign = input.charAt(i);

                numAfterSign = input.substring(i+1,length);

                firstRomeNum = convert.convToArab(numBeforeSign);

                secondRomeNum = convert.convToArab(numAfterSign);

                output = firstRomeNum+sign+secondRomeNum;
                flag = true;



        }
        return output;
    }

    String convertToArab ( int inputAnswer){

        switch (inputAnswer)
        {
            case 20:
                output = romeChar[5];
                return output;
            case 30:
                output = romeChar[6];
                return output;
            case 40:
                output = romeChar[7];
                return output;
            case 50:
                output = romeChar[8];
                return output;
            case 60:
                output = romeChar[9];
                return output;
            case 70:
                output = romeChar[10];
                return output;
            case 80:
                output = romeChar[11];
                return output;
            case 90:
                output = romeChar[12];
                //break;
                return output;
            case 100:
                output = romeChar[13];
                //break;
                return output;
        }

        if ((inputAnswer >= -9) && (inputAnswer <= 10)) {

            ConvRome converter = new ConvRome();
            converter.input = inputAnswer;
            output = converter.convert(inputAnswer);
            return output;

        }

        if ((inputAnswer > 10) && (inputAnswer < 100)) {

            intPart = (inputAnswer / 10) * 10;
            remainsPart = inputAnswer % 10;

            ConvRome converter = new ConvRome();

            converter.input = intPart;
            outIntPart = converter.convert(intPart);

            converter.input = remainsPart;
            outRemainsPart = converter.convert(remainsPart);

            output = outIntPart + outRemainsPart;

        }
        return output;
    }



}

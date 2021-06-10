package Alex;

public class WhileRome { // перевод выражения с римскими цифрами в выражение с арабскими

    String rome; //входящая строка
    String numBeforeSign; // строка до знака +,-,*,/
    String numAfterSign; // строка после знака
    char sign; // знак
    String firstRomeNum; // первое римское число преобразованное в арабское
    String secondRomeNum; // второе римское число преобразованное в арабское
    int i; // счетчик цикла
    int length; // длина строки
    String result; // результат преобразования


    String cheCk(String rome) {


           for (i=0; (rome.charAt(i) != ('+')) && (rome.charAt(i) != ('-')) && (rome.charAt(i) != ('*')) && (rome.charAt(i) != ('/')); i++) {
               // System.out.println(i);

       }


       length = rome.length();

        ToArab numRome = new ToArab();

        numBeforeSign = rome.substring(0,i);

        numRome.inputRomeNumber = numBeforeSign;
        firstRomeNum = numRome.convToArab(numBeforeSign);

        sign = rome.charAt(i);


        numAfterSign = rome.substring(i+1,length);

        numRome.inputRomeNumber = numAfterSign;
        secondRomeNum = numRome.convToArab(numAfterSign);

        result =firstRomeNum+sign+secondRomeNum;

        return result;
    }


}

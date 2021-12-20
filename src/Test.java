import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    Scanner answer = new Scanner (System.in);
    Scanner info = new Scanner(System.in);
    private int rating = 0;
    String grade;

    public void infoUser() {
        System.out.print("Ваше имя и фамилия: ");
        String name = info.nextLine();
        Pattern pattern = Pattern.compile("/^[a-z ,.'-]+$/i");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find() == true);
        System.out.println("Проверьте правильность введенного имени и фамилии и повторно введите их!");
        info.nextLine();

    }

    public void launchTest() {
        System.out.println("1. К веществам относится:\n" +
                "1) стакан\n" +
                "2) железо\n" +
                "3) снежинка\n" +
                "4) монета");
        System.out.print("Ваш ответ: ");
        int answer1 = answer.nextInt();
        if (answer1 == 2)
            rating++;


        System.out.println("2. К физическим свойствам веществ не относится\n" +
                "1) температура кипения\n" +
                "2) цвет\n" +
                "3) размер\n" +
                "4) запах");
        System.out.print("Ваш ответ: ");
        int answer2 = answer.nextInt();
        if (answer2 == 3)
            rating++;

        System.out.println("3. К химическим явлениям относится\n" +
                "1) испарение воды\n" +
                "2) горение дров\n" +
                "3) сгибание проволоки\n" +
                "4) диффузия газов");
        System.out.print("Ваш ответ: ");
        int answer3 = answer.nextInt();
        if (answer3 == 2)
            rating++;

        System.out.println("4. К простым веществам относится\n" +
                "1) кислород\n" +
                "2) вода\n" +
                "3) углекислый газ\n" +
                "4) воздух");
        System.out.print("Ваш ответ: ");
        int answer4 = answer.nextInt();
        if (answer4 == 1)
            rating++;

        System.out.println("5. Знак химического элемента натрия\n" +
                "1) N\n" +
                "2) Ni\n" +
                "3) Na\n" +
                "4) Ne");
        System.out.print("Ваш ответ: ");
        int answer5 = answer.nextInt();
        if (answer5 == 3)
            rating++;

        System.out.println("6. Элементами одной группы и подгруппы являются\n" +
                "1) N, О\n" +
                "2) Cl, Mn\n" +
                "3) Al, S\n" +
                "4) Р, N");
        System.out.print("Ваш ответ: ");
        int answer6 = answer.nextInt();
        if (answer6 == 4)
            rating++;

        System.out.println("7. Порядковый номер магния\n" +
                "1) 24\n" +
                "2) 12\n" +
                "3) 2\n" +
                "4) 3");
        System.out.print("Ваш ответ: ");
        int answer7 = answer.nextInt();
        if (answer7 == 2)
            rating++;

        System.out.println("8. Пяти атомам водорода соответствует запись\n" +
                "1) 5Н\n" +
                "2) H5\n" +
                "3) 5H2\n" +
                "4) 5H2O");
        System.out.print("Ваш ответ: ");
        int answer8 = answer.nextInt();
        if (answer8 == 3)
            rating++;

        System.out.println("9. Элементом 4-го периода III группы главной подгруппы является\n" +
                "1) Si\n" +
                "2) Sc\n" +
                "3) Ga\n" +
                "4) Al");
        System.out.print("Ваш ответ: ");
        int answer9 = answer.nextInt();
        if (answer9 == 1)
            rating++;

        System.out.println("10. Относительная молекулярная масса вещества MgCO3 равна:\n" +
                "1) 84 г\n" +
                "2) 84 г\n" +
                "3) 52 г\n" +
                "4) 42 г");
        System.out.print("Ваш ответ: ");
        int answer10 = answer.nextInt();
        if (answer10 == 2)
            rating++;

        if (9<=rating)
            grade = "ОТЛИЧНО";
        else if (rating == 7 ||rating == 8 )
            grade = "ХОРОШО";
        else if (rating == 5 ||rating == 6 )
            grade = "УДОВЛЕТВОРИТЕЛЬНО";
        else
            grade = "НЕУДОВЛЕТВОРИТЕЛЬНО!\nНА ПЕРЕСДАЧУ В ПОНЕДЕЛЬНИК!";

        System.out.println("Ваши ответы: " + answer1 + ", " + answer2 + ", " + answer3  + ", " + answer4 + ", " + answer5 + ", " + answer6 + ", " + answer7 + ", " + answer8 + ", " + answer9 + ", " + answer10 + ".");
        //System.out.println("Правильные ответы: 2, 3, 2, 1, 3, 4, 2, 3, 1, 2.");
        System.out.println("Правильно отвечено на " + rating +"/10 вопросов. ВАША ОЦЕНКА: " + grade);

    }
}
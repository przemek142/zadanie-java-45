import java.lang.Math;
import java.util.Scanner;

public class MathQuiz {

    private boolean q1AnsweredCorectly;
    private boolean q2AnsweredCorectly;
    private boolean q3AnsweredCorectly;

    public String isQ1AnsweredCorectly() {
        if (q1AnsweredCorectly){
            return "prawidłowa";
        }else {
            return "błędna";
        }
    }    public String isQ2AnsweredCorectly() {
        if (q2AnsweredCorectly){
            return "prawidłowa";
        }else {
            return "błędna";
        }
    }    public String isQ3AnsweredCorectly() {
        if (q3AnsweredCorectly){
            return "prawidłowa";
        }else {
            return "błędna";
        }
    }


    private int numberOfCorrectAnswers;
    public int getNumberOfCorrectAnswers(){
        return numberOfCorrectAnswers;
    }


    /**
     * pyta, jaki jest wynik mnożenia 3*5
     *
     * @return
     */
    private boolean question1(double answer) {
        final double correctAnswer = 3 * 5;
        double yourAnswer;

        if (correctAnswer == answer) {
            q1AnsweredCorectly = true;
            yourAnswer = answer;
            numberOfCorrectAnswers+=1;
            return true;
        } else {
            q1AnsweredCorectly = false;
            return false;
        }
    }

    /**
     * pyta jakie jest pole kwadratu o boku 12
     *
     * @return
     */
    private boolean question2(double answer) {
        final double correctAnswer = Math.pow(12, 2);
        double yourAnswer;

        if (correctAnswer == answer) {
            q2AnsweredCorectly = true;
            yourAnswer = answer;
            numberOfCorrectAnswers+=1;
            return true;
        } else {
            q2AnsweredCorectly = false;
            return false;
        }
    }

    /**
     * pyta jaki jest pierwiastek kwadratowy z liczby 15129
     *
     * @return
     */
    private boolean question3(double answer) {
        double yourAnswer;
        final double correctAnswer = Math.sqrt(15129);
        if (correctAnswer == answer) {
            q3AnsweredCorectly = true;
            yourAnswer = answer;
            numberOfCorrectAnswers+=1;
            return true;
        } else {
            q3AnsweredCorectly = false;
            return false;
        }
    }

    public void askQuestion(int questionNumber) {
        double readAnswer;
        Scanner scan = new Scanner(System.in);

        switch (questionNumber) {
            case 1:
                System.out.println("Jaki jest wynik mnożenia 3*5?");
                readAnswer = scan.nextDouble();
                question1(readAnswer);
                break;
            case 2:
                System.out.println("Jakie jest pole kwadratu o boku 12?");
                readAnswer = scan.nextDouble();
                question2(readAnswer);
                break;
            case 3:
                System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
                readAnswer = scan.nextDouble();
                question3(readAnswer);
                break;
            default:
                System.out.println("ERROR");
        }


    }
}

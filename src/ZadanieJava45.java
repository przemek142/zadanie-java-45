public class ZadanieJava45 {
    public static void main(String[] args) {

        MathQuiz q = new MathQuiz();

        q.askQuestion(1);
        q.askQuestion(2);
        q.askQuestion(3);

        System.out.printf("Ilość poprawnych odpowiedzi: %d/3.\n", q.getNumberOfCorrectAnswers());
        System.out.printf("odp1: %s, odp2: %s, odp3: %s", q.isQ1AnsweredCorectly(),q.isQ2AnsweredCorectly(), q.isQ3AnsweredCorectly());
    }
}

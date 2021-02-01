package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Primitive Types Challenge

        byte challengeByteValue = 100;

        short challengeShortValue = 30_000;

        int challengeIntValue = 2_000_000_000;

        long challengeLongValue = 50_000L + 10L * (challengeByteValue + challengeShortValue + challengeIntValue);

        System.out.println("my challengeLongValue = " + challengeLongValue);
    }
}

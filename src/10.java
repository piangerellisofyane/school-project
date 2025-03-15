import java.util.Random;

class RandomNumber {
    public static void main(String[] args) {
        int max = 100;
        Random rand = new Random();
        int randomNum = rand.nextInt((max) + 1);
        System.out.println("Your random number is: " + randomNum);
    }
}
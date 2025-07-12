import java.util.Scanner;//we will be taking inputs

public class SimpleBot {
    Scanner scanner = new Scanner(System.in);// scanner object to take inputs from user

    public static void main(String[] args) {
        greet("kuku",2025);
        yourName();
        yourAge();
    }

    // this method is for greeting the user
    public void greet(String botName, int botBirthdDate) {
        System.out.println("Hello, I am " + botName +" (●'◡'●)."+ "\nI was born on " + botBirthdDate + ".");
        System.out.println("Please let me know your name,hehe!");
    }

    //this method is to take user input about their name
    public void takeName() {
        yourName= scanner.nextLine()
        System.out.println("Omg ╰(*°▽°*)╯, your name is " + yourName + "!!");
        System.out.println("This is such a cool name twin. I am glad we met!");
    }

    //this method is to guess age using a simple trick
    public void yourAge() {
        System.out.println("Let me guess your age now!");
        System.out.println("hmm...");
        System.out.println("Enter remainders after dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105; //got this trick from the internet
        System.out.println("Aha! you're " + age + " years old!");
        System.out.println("Good time to start programming twin. (/≧▽≦)/");
    }

}
//
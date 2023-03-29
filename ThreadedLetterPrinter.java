public class ThreadedLetterPrinter extends Thread
{
    private char letter;

    public LetterPrinter(char letter)
    {
        this.letter = letter;
    }

    @Override
    public void run()
    {
        System.out.println(letter);   
    }

    public static void main(String[] args)
    {
        Thread t1 = new LetterPrinter('A');
        Thread t2 = new LetterPrinter('B');
        Thread t3 = new LetterPrinter('C');
        Thread t4 = new LetterPrinter('D');
        Thread t5 = new LetterPrinter('E');

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
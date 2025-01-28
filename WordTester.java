public class WordTester 
{


    public static void main (String[] args)
    {
        Word word = new Word("word");
        
        System.out.println(word);
        System.out.println("Num of vowels = " + word.getNumVowels());
        System.out.println("Length = " + word.getLength());

        word.setWord("newWord");

        System.out.println(word);
        System.out.println("Num of vowels = " + word.getNumVowels());
        System.out.println("Length = " + word.getLength());

    }


}

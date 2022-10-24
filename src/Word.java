import java.util.Scanner;

public class Word {
    //attribut
    private String value;

    public void getWord() {
        //get a String from the keyboard
        //and store it in the attribute "value"
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrer un mot : ");
        value = sc.next();
    }
    public void show() {
        System.out.println("Le mot = "+value);
    }
    //in theis inverse version, we create a new Word object that contains the inverse value
    public Word inverseV2() {

        Word winversed = new Word();
        winversed.value="";
        for (int i = value.length() - 1; i>=0; i--) {
            // ch=ch+value.charAt(i);
            //or
            winversed.value+=value.charAt(i);
        }
        return winversed;
    }
    //this method inverse the attribute "value" of the  word
    public void inverse() {
        String ch="";
        for (int i = value.length() - 1; i>=0; i--) {
           // ch=ch+value.charAt(i);
            //or
            ch+=value.charAt(i);
        }
        value=ch;
    }

    public boolean isPlaindromV1()
    {
        int i=0;
        boolean plaindrom=true;
        while(i<=value.length()/2 && plaindrom) {
            if(value.charAt(i)!=value.charAt(value.length()-1-i))
                plaindrom=false;
            else
                i++;
        }
        return plaindrom;
    }
    public boolean isPlaindromV2()
    {
        Word inverseWord=inverseV2();//inverse value and returns an object inverseWord
        //if(value.equalsIgnoreCase(inverseWord.value)==true) //or
        //if(value.equalsIgnoreCase(inverseWord.value))
         //   return true;

        //return false;
        //or
        //return value.equalsIgnoreCase(inverseWord.value)?true:false;
        //or
        return value.equalsIgnoreCase(inverseWord.value);

    }


}

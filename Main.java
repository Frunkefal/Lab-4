import java.util.Scanner;

public class Main {

public static void main(String[] args) {

String text = "Oh, I'll never kill myself to save my soul I was gone, but how was I to know?";

System.out.println(text);

String[] strArr= text.split(" ");

Scanner in = new Scanner(System.in);

System.out.print("Input a number: ");

int num = in.nextInt();

for (int i=0;i<strArr.length;i++){

char first = strArr[i].charAt(0); // первая буква каждого слова

if((strArr[i].length() == num) && ((first != 'a')&&(first != 'e')&&(first != 'i')&&(first != 'o')&&(first != 'u')&&(first != 'y'))){

strArr[i]="";

}

System.out.print(strArr[i]+" ");

}

}

}
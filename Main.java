import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int size;
    String[] words;
    Scanner sc = new Scanner(System.in);
    System.out.println("How many words do you want to enter?");
    size = sc.nextInt();
    words = new String[size];

    sc.nextLine();
    System.out.println("Enter " + size + " words");
    for (int i = 0; i < size; i++)
    {
      words[i] = sc.nextLine();
    }

    reverse(words);
    
  }

  public static void reverse(String[] arr)
  {
    for (String word : arr)
    {
      String rev = "";
      for (int i = word.length()-1; i >= 0; i--)
      {
        rev +=word.substring(i, i+1);
      }
      System.out.println(rev);
    }
  }

  public int product(int[] arr)
  {
    return 0;
  }

  public double average(double[] arr)
  {
    return 0.0;
  }
}

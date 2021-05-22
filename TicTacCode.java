import java.util.Scanner;

public class TicTacCode
{
  public static String encode(String phrase) //Only 205 code characters can fit on a single note in NotePad!
  {
    int code = 0;
    String output = "";
    phrase = phrase.toLowerCase();
    if(phrase.equalsIgnoreCase("PSA"))
      return " ___ \n| O  \n|    ";
    for(int x = 0; x < phrase.length(); x++) //TOP
    {
      if(phrase.length() - x >= 5 && phrase.substring(x, x + 5).equalsIgnoreCase(" PSA "))
      {
        output += "      ___      ";
        x += 5 - 1;
      }
      else if(phrase.length() - x >= 4 && phrase.substring(x, x + 4).equalsIgnoreCase("PSA "))
      {
        output += " ___      ";
        x += 4 - 1;
      }
      else if(phrase.length() - x >= 4 && phrase.substring(x, x + 4).equalsIgnoreCase(" PSA"))
      {
        output += "      ___ ";
        x += 4 - 1;
      }
      else
      {
        switch(phrase.charAt(x))
        {
          case 'a': case 'b': case 'c': case 'j': case 'k': case 'l': case 's': case 't': case 'u':
            output += "     ";
            break;
          case 'd': case 'e': case 'f': case 'g': case 'h': case 'i': case 'm': case 'n': case 'o': case 'p': case 'q': case 'r': case 'v': case 'w': case 'x': case 'y': case 'z':
            output += " ___ ";
            break;
          case ' ':
            output += "     ";
            break;
        }
      }
    }
    output += "\n";
    for(int x = 0; x < phrase.length(); x++) //MIDDLE
    {
      if(phrase.length() - x >= 5 && phrase.substring(x, x + 5).equalsIgnoreCase(" PSA "))
      {
        output += "     | O       ";
        x += 5 - 1;
      }
      else if(phrase.length() - x >= 4 && phrase.substring(x, x + 4).equalsIgnoreCase("PSA "))
      {
        output += "| O       ";
        x += 4 - 1;
      }
      else if(phrase.length() - x >= 4 && phrase.substring(x, x + 4).equalsIgnoreCase(" PSA"))
      {
        output += "     | O  ";
        x += 4 - 1;
      }
      else
      {
        switch(phrase.charAt(x))
        {
          case 'a': case 'd': case 'g':
            output += "    |";
            break;
          case 'b': case 'e': case 'h':
            output += "|   |";
            break;
          case 'c': case 'f': case 'i':
            output += "|    ";
            break;
          case 'j': case 'm': case 'p':
            output += "  X |";
            break;
          case 'k': case 'n': case 'q':
            output += "| X |";
            break;
          case 'l': case 'o': case 'r':
            output += "| X  ";
            break;
          case 's': case 'v': case 'y':
            output += "  O |";
            break;
          case 't': case 'w': case 'z':
            output += "| O |";
            break;
          case 'u': case 'x':
            output += "| O  ";
            break;
          case ' ':
            output += "     ";
            break;
        }
      }
    }
    output += "\n";
    for(int x = 0; x < phrase.length(); x++) //BOTTOM
    {
      if(phrase.length() - x >= 5 && phrase.substring(x, x + 5).equalsIgnoreCase(" PSA "))
      {
        output += "     |         ";
        x += 5 - 1;
      }
      else if(phrase.length() - x >= 4 && phrase.substring(x, x + 4).equalsIgnoreCase("PSA "))
      {
        output += "|         ";
        x += 4 - 1;
      }
      else if(phrase.length() - x >= 4 && phrase.substring(x, x + 4).equalsIgnoreCase(" PSA"))
      {
        output += "     |    ";
        x += 4 - 1;
      }
      else
      {
        switch(phrase.charAt(x))
        {
          case 'a': case 'd': case 'j': case 'm': case 's': case 'v':
            output += " ___|";
            break;
          case 'b': case 'e': case 'k': case 'n': case 't': case 'w':
            output += "|___|";
            break;
          case 'c': case 'f': case 'l': case 'o': case 'u': case 'x':
            output += "|___ ";
            break;
          case 'g': case 'p': case 'y':
            output += "    |";
            break;
          case 'h': case 'q': case 'z':
            output += "|   |";
            break;
          case 'i': case 'r':
            output += "|    ";
            break;
          case ' ':
            output += "     ";
            break;
        }
      }
    }
    return output;
  }
  
  public static String decode(String code)
  {
    String decoded = "";
    for(int x = 0; x < code.length(); x++)
    {
      switch(code.charAt(x))
      {
        case 'w':
          decoded += 'a';
          break;
        case 'e':
          decoded += 'b';
          break;
        case 'r':
          decoded += 'c';
          break;
        case 's':
          decoded += 'd';
          break;
        case 'd':
          decoded += 'e';
          break;
        case 'f':
          decoded += 'f';
          break;
        case 'x':
          decoded += 'g';
          break;
        case 'c':
          decoded += 'h';
          break;
        case 'v':
          decoded += 'i';
          break;
        case 'u':
          decoded += 'j';
          break;
        case 'i':
          decoded += 'k';
          break;
        case 'o':
          decoded += 'l';
          break;
        case 'j':
          decoded += 'm';
          break;
        case 'k':
          decoded += 'n';
          break;
        case 'l':
          decoded += 'o';
          break;
        case 'm':
          decoded += 'p';
          break;
        case ',':
          decoded += 'q';
          break;
        case '.':
          decoded += 'r';
          break;
        case 'U':
          decoded += 's';
          break;
        case 'I':
          decoded += 't';
          break;
        case 'O':
          decoded += 'u';
          break;
        case 'J':
          decoded += 'v';
          break;
        case 'K':
          decoded += 'w';
          break;
        case 'L':
          decoded += 'x';
          break;
        case 'M':
          decoded += 'y';
          break;
        case '<':
          decoded += 'z';
          break;
        case '>':
          decoded += "PSA";
          break;
        case ' ':
          decoded += ' ';
          break;
        default:
          decoded += "\n";
          break;
      }
    }
    return decoded;
  }
  
  public static void main(String[] args)
  {
    String choice, string;
    Scanner keyboard = new Scanner(System.in);
    do
    {
      System.out.println("Tic-Tac-Code Menu\n");
      System.out.println("(1) Encode Method");
//      System.out.println("(2) Decode Method");
      System.out.println("(Q) Quit\n");
      System.out.print("Choice --->");
      choice = keyboard.next();
      System.out.println();
      switch(choice.charAt(0))
      {
        case '1':
          System.out.print("What message would you like to encode?");
          string = keyboard.nextLine();
          System.out.println(encode(keyboard.nextLine()));
          break;
        case '2':
          break;
      }
      //System.out.println(((code));
    }
    while(choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
  }
}
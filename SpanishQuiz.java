/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 17, 2018
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SpanishQuiz implements Quizaroo
{
  public ArrayList inputAnswers()
  {
    ArrayList<String> answers = new ArrayList<String>();
    String choice;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Please enter your answers for the 10 questions:");
    while(true)
    {
      choice = keyboard.nextLine();
      answers.add(choice);
      if (answers.size() == 10) //there are only 10 questions
      break;
    }
    /*for (String element : answers)
      System.out.println(element);*/
      for (int i = 0; i <= 10; i++)
        System.out.println(answers.get(i));

    return answers;
  }




  /*public int score();
  {
    return null;
  }

  public ArrayList answerSheet();
  {
    return null;
  }

  public ArrayList corrections();
  {
    return null;
  }

  public ArrayList retakeQuiz();
  {
    return null;
  } */









}

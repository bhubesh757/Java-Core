package com.company;

public class Game {

    Question[] questions = new Question[3];
    Player player = new Player();

    public void initGame(){

        for(int i=0 ; i<3;i++){
            questions[i] = new Question();
        }
        questions[0].question = "Which of the following is not a Java features?";
        questions[0].opt1="Dynamic";
        questions[0].opt2 = "Architecture Neutral";
        questions[0].opt3 = "Use of pointers";
        questions[0].opt4 = "Object-oriented";

        questions[0].correctAns = 3;


        questions[1].question = "_____ is used to find and fix bugs in the Java programs";
        questions[1].opt1="JVM";
        questions[1].opt2 = "JRE";
        questions[1].opt3 = "JDK";
        questions[1].opt4 = "JDB";
        questions[1].correctAns = 4;

        questions[2].question = "What is the return type of the hashCode() method in the Object class?";
        questions[2].opt1="Object";
        questions[2].opt2 = "int";
        questions[2].opt3 = "long";
        questions[2].opt4 = "void";
        questions[2].correctAns = 2;




    }
    public void play(){

        player.getDetails();

        for (int i = 0; i < 3; i++) {

            boolean status = questions[i].askQuestion();
            if (status==true){
                System.out.println("----Woohoo!! Correct Answer---");
                player.score++;
            }
            else {
                System.out.println("Wochoo!! Try Again Later-----");
            }
        }
        System.out.println(player.name + " Your Score is " + player.score);


    }


}



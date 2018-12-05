package Final;

import java.util.Arrays;

public class AlphabetGame {
    int min = 0;
    int max = 25;
    int[] answers=new int[4];
    String[] questions = new String[4];
    String[][] key = new String[max+1][max+1];
    String[] dictionary = new String[]{"pple","anana","at","og","raser","rog",
      "ame","ouse","gloo","oker","angaroo","emon","onster","ose","x","urple",
      "uiet","abbit","tar","urtle","mbrella","acation","atch","ylophone","ellow",
      "oo"};
    public AlphabetGame(){
      buildKey();
      buildQuestion();

    }
    public void buildKey(){
      for(int x=min;x<max+1;x++){
        for(int y=0;y<2;y++){
          if (y==0){key[x][y]=Integer.toString(x);}
          else{key[x][y] = Character.toString((char)(x+65));}
         }
       }
    }
    public void buildQuestion(){
        for(int r=min;r<4;r++){
            int temp=(int)(Math.random()*max+min);
            while(checkRandNum(answers,temp)){
                temp=(int)(Math.random()*max);
            }
            answers[r]=temp;
            questions[r]=((String)(r+1 + "  "+ key[answers[r]][1] + dictionary[answers[r]]));
        }
    }

    public boolean checkAnswer(int[] arr){ return Arrays.equals(answers, arr); }
    public void newQuestions(){
        buildQuestion();
    }

    public boolean checkRandNum(int[] arr, int value){
      for(Integer s: arr){
		      if(s.equals(value))
			       return true;
  	  }
	    return false;
    }
}


package learnJava;

import java.io.*; 

import java.util.*; 
import java.lang.*;




class PlayerPlayer{
        PlayerPlayer(){
          Integer close= new Integer(0);
      while(close.intValue()==0){
        int[] grid =new int [10];
          for(int i=0;i<10;i++){
          grid[i]=0;
         
         }
         // human and human
         int chanceforplayer1=1;
         int chanceforplayer2=0;
         Scanner s = new Scanner(System.in);
         for(int i=0;i<9;i++){
              if(chanceforplayer1==1){
                System.out.println("enter your location player--1");
                int location = s.nextInt();
                grid[location]=1;
                chanceforplayer1=0;
              }
              else{
                System.out.println("enter your location player--2");
                int location = s.nextInt();
                grid[location]=-1;
                chanceforplayer1=1;
              }
              if(i==4||i==6||i==8){
                close =  new Integer(1);
                Checking ch = new Checking (grid,1,close); 
                
                if(ch.x==1){
                  System.out.println("Winner is player--1");
                  System.exit(0); 
                }
              }
              if(i==5||i==7){
                close =  new Integer(1);
                Checking ch = new Checking (grid,-1,close); 
                
                if(ch.x==1){
                  System.out.println("Winner is player--2");
                  System.exit(0); 
                }
              }
         }
         
          System.out.println("Draw");
          System.exit(0); 
         
           
        }
    }

}








public class TicTacToe{
	public static void main(String args[]){
		int botgame ;
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 if for one player game");
		botgame=s.nextInt();
		if(botgame==1){
          PlayerBot b = new PlayerBot();
		}
		else{
          PlayerPlayer p = new PlayerPlayer();
          
		}
	}
} 



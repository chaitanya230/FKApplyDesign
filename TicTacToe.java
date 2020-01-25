package learnJava;

import java.io.*; 

import java.util.*; 
import java.lang.*;


 class Checking{
  int x=0;
  Checking(int [] grid,int x,Integer close){
            
            if(grid[0]+grid[1]+grid[2]==3*x){
                  //System.out.println("winner is player--1");
                }else if(grid[3]+grid[4]+grid[5]==3*x){
                  //System.out.println("winner is player--1");
                }else if(grid[6]+grid[7]+grid[8]==3*x){
                  //System.out.println("winner is player--1");
                }else if(grid[0]+grid[3]+grid[6]==3*x){
                  //System.out.println("winner is player--1");
                }else if(grid[1]+grid[4]+grid[7]==3*x){
                  //System.out.println("winner is player--1");
                }else if(grid[2]+grid[5]+grid[8]==3*x){
                  //System.out.println("winner is player--1");
                }else if(grid[2]+grid[4]+grid[6]==3*x){
                  //System.out.println("winner is player--1");
                }else if(grid[0]+grid[4]+grid[8]==3*x){
                  //System.out.println("winner is player--1");
                }
                else{
                  x=1;

                }
  }
}




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

class PlayerBot{
  PlayerBot(){
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
                int location=0;
                //System.out.println("enter your location player--2");
                for(int j=0;j<9;j++){
                  if(grid[j]==0){
                    location=j;
                  }
                }
                //int location = s.nextInt();
                //System.out.println(location);
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
                  System.out.println("Winner is Bot");
                  System.exit(0); 
                }
              }
         }
         //if(close.intValue()==0){
          System.out.println("Draw");
          System.exit(0); 
         //}
           
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



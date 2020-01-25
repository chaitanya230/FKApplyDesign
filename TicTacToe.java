package learnJava;

import java.io.*; 

import java.util.*; 
import java.lang.*;









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



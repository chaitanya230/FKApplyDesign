import java.io.*;
import java.util.*;
 
interface TicTacToe{
	 void game(int x);
	 int [][] board();
	 int checking(int [][] arr,int pl,int x1,int y1);
}


class Hexagon implements TicTacToe{
	int board_size;
	
	public int checking(int [][] arr,int pl,int x1,int y1){
		Scanner sc = new Scanner(System.in);
        int p,q;
        p=0;
        q=0;
        int count=0;
        int count1=0;
        
        while(x1+count<=2*board_size-2){
        	if(x1+count<board_size-1){
               if(arr[x1+count][y1+count1]==pl){
               	p++;
               	count1++;
               	count++;
               }
               else
               	 break;
        	}
        	else{
               if(arr[x1+count][y1+count1]==pl){
               	p++;
               	count++;
               }
               else
               	 break;
        	}
        }
        count=0;
        count1=0;
        while(x1-count>=0){
        	if(x1-count>board_size-1){
              if(arr[x1-count][y1-count1]==pl){
              	q++;
              	count++;
              	//count1++;
              }
              else
              	break;
        	}
        	else{
        		if(arr[x1-count][y1-count1]==pl){
              	 q++;
              	 count++;
              	 count1++;
               }
               else
              	break;

        	}
        }
        if(p+q>=board_size+1){
        	//System.out.println(p+"  "+q);
        	return 1;
        }
        p=0;
        q=0;
        count=0;
        count1=0;
        while(x1+count<=2*board_size-2){
        	if(x1+count<board_size-1){
               if(arr[x1+count][y1-count1]==pl){
               	p++;
               	//count1++;
               	count++;
               }
               else
               	 break;
        	}
        	else{
               if(arr[x1+count][y1-count1]==pl){
               	p++;
               	count++;
               	count1++;
               }
               else
               	 break;
        	}
        }
        count=0;
        count1=0;
        while(x1-count>=0){
        	if(x1-count>board_size-1){
              if(arr[x1-count][y1+count1]==pl){
              	q++;
              	count++;
              	count1++;
              }
              else
              	break;
        	}
        	else{
        		if(arr[x1-count][y1+count1]==pl){
              	 q++;
              	 count++;
              	 //count1++;
               }
               else
              	break;

        	}
        }
        if(p+q>=board_size+1){
        	return 1;
        }


        p=0;
        q=0;
        count=0;
        count1=0;
        while(x1+count<=2*board_size-2){
        	if(x1+count<board_size-1){
               if(arr[x1+count][y1+count1]==pl){
               	p++;
               	count1++;
               	if(x1+count==board_size-2){
               		count1--;
               	}
               	count+=2;
               }
               else
               	 break;
        	}
        	else{
               if(arr[x1+count][y1+count1]==pl){
               	p++;
               	count+=2;
               	count1--;
               }
               else
               	 break;
        	}
        }

        count=0;
        count1=0;
        while(x1-count>=0){
        	if(x1-count>board_size-1){
              if(arr[x1-count][y1+count1]==pl){
              	q++;
              	count=count+2;
              	count1++;
              	if(x1+count==board_size){
               		count1--;
               	}
              }
              else
              	break;
        	}
        	else{
        		if(arr[x1-count][y1+count1]==pl){
              	 q++;
              	 count=count+2;
              	 count1--;
               }
               else
              	break;

        	}
        }
        if(p+q>=board_size+1){
        	return 1;
        }


     return 0;
	}
	public int [][] board(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of board");
		int sizeof_board = sc.nextInt();
		board_size=sizeof_board;
		int [][] array = new int[2*sizeof_board-1][2*sizeof_board-1];
		for(int i=0;i<2*sizeof_board-1;i++){
			for(int j=0;j<2*sizeof_board-1;j++){
				array[i][j]=0;
			}
		}
		return array;
	}
	public void game(int is_machine){
		Scanner sc = new Scanner(System.in);
        int [][] arr =this.board();
        int n = board_size;
        int count = n*(3*n-1);
        while(count>0){
        System.out.println("Enter the input by player 1");
        int x1,y1;
        x1=sc.nextInt();
        y1=sc.nextInt();
        arr[x1][y1]=1;
        if(this.checking(arr,1,x1,y1)==1){
        	System.out.println("A is the Winner");
        	System.exit(1);
        }
        count--;
        if(count==0){
        	System.out.println("Draw");
        	System.exit(1);
        }
        System.out.println("Enter the input by player 2");
        
        x1=sc.nextInt();
        y1=sc.nextInt();
        arr[x1][y1]=-1;
        if(this.checking(arr,-1,x1,y1)==1){
        	System.out.println("B is the Winner");
        	System.exit(1);
        }count--;
        }




	}
     	 
}

public class phase3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of Board: ");
		String type = sc.nextLine();
		if(type.equals("Hexagon")){
           //System.out.println("Enter the no of players:");
           int no_of_players=2;
           int is_machine=0;
           Hexagon h=new Hexagon();
           h.game(is_machine);
		}
		
	}
}

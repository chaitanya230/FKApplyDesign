import java.io.*; 

import java.util.*; 
import java.lang.*;


class checking{
  int x1=0;
  checking(int [] grid,int x){
                if((x>0&&(grid[0]>=3*x||grid[1]>=3*x||grid[2]>=3*x||grid[3]>=3*x||grid[4]>=3*x||grid[5]>=3*x||grid[6]>=3*x||grid[7]>=3*x||grid[8]>=3*x))||(x<0&&(grid[0]<=3*x||grid[1]<=3*x||grid[2]<=3*x||grid[3]<=3*x||grid[4]<=3*x||grid[5]<=3*x||grid[6]<=3*x||grid[7]<=3*x||grid[8]<=3*x))){
                   
                }
                else if(grid[0]+grid[1]+grid[2]==3*x){
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
                  x1=1;

                }
  }

}


class playerplayer{

    int startgame(int[][] arr,int size,int type,int is_machine){
      Scanner sc = new Scanner(System.in);
      int t=(size*size-1)/2;
      int x1,y1,x2,y2,x11,y11;
      int depth1;
      int type1=type;
      int undo=0;
      int mul;
      //int depth = math.log(size)/math.log(type);
      int count=0;
      int p,q;
      p=0;
      q=0;
      while(t-->0){
              
            type1=type;
            while(true){
            System.out.println("enter the imput pl1:");
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            System.out.println("if want to undo type--1 ");
            undo=sc.nextInt();
            if(undo==0){
             break;
            }}
            if(arr[x1][y1]==0)
            arr[x1][y1]=1;
            x11=x1;
            y11=y1;
            count=0;
            mul = 1;
            while(type1<=size){

               x11=(x11/type1)*type1;
               y11=(y11/type1)*type1;
               x11=x11+count;
               y11=y11+count;
               int [] brr =new int [9];
               for(int i=0;i<type;i++){
                for(int j=0;j<type;j++){
                   brr[i*type+j]=arr[x11+i*mul][y11+j*mul];
                   //System.out.print(brr[i*type+j]+"-");
                   if(i==1&&j==1){
                    p=x11+i*mul;
                    q=y11+i*mul;
                   }
                }
               }
               System.out.println();
                   System.out.println();
               checking ch = new checking(brr,1*mul);
               //System.out.println(ch.x+"??????");
               if(ch.x1==1){
                break;
               }
               arr[p][q]=mul*3;
               count+=mul;
               mul=mul*3;
               type1=type1*3;
            }
            for(int i=0;i<size;i++){
          for(int j=0;j<size;j++){
              System.out.print(arr[i][j]+" ");
           }
           System.out.println();
            }
             if(size<type1){
              //System.out.println(size+"------"+type1);
              return 1;
            }

            type1=type;
        System.out.println("enter the imput pl2:");
        if(is_machine==1){
          int flag=0;
            for(int i=0;i<size;i++){
              for(int j=0;j<size;j++){
                if(arr[i][j]==0){
                  flag=1;
                  x1=i;
                  y1=j;
                  break;
                }
              }
              if(flag==1)
                 break;
            }
        }
        else{
             while(true){
            System.out.println("enter the imput pl1:");
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            System.out.println("if want to undo type--1 ");
            undo=sc.nextInt();
            if(undo==0){
             break;
            }}
            }
            arr[x1][y1]=-1;
            x11=x1;
            y11=y1;
            count=0;
            mul =1;

            while(type1<=size){

               x11=(x11/type1)*type1;
               y11=(y11/type1)*type1;
               x11=x11+count;
               y11=y11+count;
               int [] brr =new int [9];
               
               for(int i=0;i<type;i++){
                for(int j=0;j<type;j++){

                   brr[i*type+j]=arr[x11+i*mul][y11+j*mul];
                   if(i==1&&j==1){
                    p=x11+i*mul;
                    q=y11+i*mul;
                   }
                }
               }
               checking ch = new checking(brr,-1*mul);
               if(ch.x1==1){
                break;
               }
               arr[p][q]=mul*-3;
               count+=mul;
               mul=mul*3;
               type1=type1*3;
            }
            for(int i=0;i<size;i++){
          for(int j=0;j<size;j++){
              System.out.print(arr[i][j]+" ");
           }
           System.out.println();
            }
            if(size<type1){
              return -1;
            }

      }

      type1=type;
         while(true){
            System.out.println("enter the imput pl1:");
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            System.out.println("if want to undo type--1 ");
            undo=sc.nextInt();
            if(undo==0){
             break;
            }}
            arr[x1][y1]=1;
            while(type1<=size){
              x11=x1;
              y11=y1;
               mul=1;
               x11=(x11/type1)*type1;
               y11=(y11/type1)*type1;
               x11=x11+count;
               y11=y11+count;
               int [] brr =new int [9];
               for(int i=0;i<type;i++){
                for(int j=0;j<type;j++){
                   brr[i*type+j]=arr[x11+i*mul][y11+j*mul];
                   if(i==1&&j==1){
                    p=x11+i*mul;
                    q=y11+i*mul;
                   }
                }
               }
               checking ch = new checking(brr,1*mul);
               if(ch.x1==1){
                break;
               }
               arr[p][q]=mul*3;
               count+=mul;
               mul=mul*3;
               type1=type1*3;

            }
            for(int i=0;i<size;i++){
          for(int j=0;j<size;j++){
              System.out.print(arr[i][j]+" ");
           }
           System.out.println();
            }
            if(size<type1){
              return 1;
            }
            else
             return 0;


    }
}

public class TicTacToe{
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Board size ::");
        int size = sc.nextInt();
        int [][] arr = new int [size][size];
        System.out.println("enter the basic size like 3 or 4");
        int type=sc.nextInt();
        for(int i=0;i<size;i++){
          for(int j=0;j<size;j++){
              arr[i][j]=0;
          }
        }
        System.out.println("enter no of players:");
        int no_of_players=sc.nextInt();
        int is_machine=0;
        if(no_of_players==2){
           is_machine=0;
        }
        else{
           is_machine=1;
        }
          playerplayer pp=new playerplayer();
           if(pp.startgame(arr,size,type,is_machine)==1){
            System.out.println();
            System.out.println("Player1 is Winner. ");
           }
           else if(pp.startgame(arr,size,type,is_machine)==-1) {
            System.out.println();
            System.out.println("Player2 is Winner. ");
           }
           else{
            System.out.println();
            System.out.println("Draw");
           }
        
  }
}
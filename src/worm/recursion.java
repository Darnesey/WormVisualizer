import java.util.Arrays;
import java.util.Math;
import java.util.Scanner;
/**
 * Created by retsu on 2/20/2016.
 */
public class main {
    public String worm = "U have been infected";
    public int crashNumber; //setup number of worms needed to crash
    public int[][] wormArray=new int[1000][1000];//setup initial array
    public Scanner ln = new Scanner(System.ln); //creating scanner for user input
    public static void main(String[] args){
        if(args == null)
            System.out.print("Hello this is the worm tracker array, please enter your value for width, hit enter for height, input 0 for default");
            int input1 = ln.nextInt();
            int input2 = ln.nextInt();
            if(input1 != 0 && input2 != 0){
                wormsArray[input1][input2];
            }
            else if(input1 != 0)
                wormsArray[input1][1000];
            else if(input2 != 0)
                wormsArray[1000][input2];
            else
                wormsArray[1000][1000];

            System.out.print("Please enter your crash number for number of infections before crash or 0 for default");
            int input3 = ln.nextInt();
            if(input3 != 0){
                crashNumber = input3;
            }
        else {
                if(arg[2] == null)
                    crashNumber = 100;
                else
                    crashNumber = arg[2];
                wormArray[arg[0]][arg[1]];
            }
        fillZero();
        infect(x=0,y=0);
    }
    public static void infect(int x, int y){
        if(wormArray[x][y]==0) {//check if tile already infected
            setinfect(green);//turn tile over to infected
            wormArray[x][y] += 1;
        }
        else if((wormsArray[x][y] <= 1 || Math.random()*100 < 1/7*100)&& wormsArray[x][y] != -1)
        {
            wormsArray[x][y] += 1;
            if(wormsArray[x][y] > crashNumber){
                setInfect(black); //computer crashed to many worms
                wormsArray[x][y] = -1;
            }
        }
        else{
            infect(x+1,y);
            infect(x, y+1);
            infect(x+1,y+1);
        }
    }
    public static void fillZero() {//file array with zeros
        for (i = 0; i <= wormArray.length; i++) {
            for (j = 0; j <= wormArray.length; j++) {
                wormArray[i][j]= 0;
            }
        }
    }
}

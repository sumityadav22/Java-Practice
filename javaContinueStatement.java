/* The continue statement is used in loop control structure when you need to jump to the next iteration of
 the loop immediately. It can be used with for loop or while loop. */

/*Syntax:
jump-statement;    
continue; */

class javaContinueStatement{
	public static void main(String[] args) {
	for(int i=1;i<=10;i++){  
	        if(i==5){  
	            //using continue statement  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);  
	    }
	}
}





/*
Output:

1
2
3
4
6
7
8
9
10
*/
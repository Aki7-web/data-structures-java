package backtracking;

//place N queens on a N x N chessboards where no two queens can attack each other
//tc= O(n!)

public class Nqueens {
    public static boolean isSafe(char board[][], int row, int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal up left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal up right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    

    public static void NQueens(char board[][], int row){
        //base case
        if(row==board.length){
            //printBoard(board);
            count++;
            return;
        }

        //keeps q then move to next row until reaches last then prints a case,
        //  comes back changes the position then prints then backtracks etc
        for(int j=0; j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q'; //places a Q
                NQueens(board, row+1); //go to next row after filling the current row
                board[row][j]='x';//backtract to remove the Q placed
            }
        }
    }

    //one variation where u check whether solution is possible or not
    //if possible just print one check borad

    public static boolean NNQueens(char board[][], int row){
        //base case
        if(row==board.length){
            //printBoard(board);
            count++;
            return true;
        }

        //keeps q then move to next row until reaches last then prints a case,
        //  comes back changes the position then prints then backtracks etc
        for(int j=0; j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q'; //places a Q
                if(NNQueens(board, row+1)){
                    return true;
                } //go to next row after filling the current row
                board[row][j]='x';//backtract to remove the Q placed
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("---------------");
        for(int i=0; i<board.length;i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count=0;//as inside recursive fxtn if u put this it would change

    public static void main(String[] args) {
        int n=2;
        //initialised
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                board[i][j]='x';
            }
        }

        // NQueens(board, 0);
        // System.out.println(count);

        //2nd variant
        if(NNQueens(board, 0)){
            System.out.println("yes");
            printBoard(board);
        }else{
            System.out.println("no");
        }
        

    }
}

class Solution {
    boolean validRow(char[][]board,int row){

        Set<Character> arr = new HashSet<>();

        for(int i=0;i<board[0].length;i++){
            if(board[row][i]!='.' && !arr.contains(board[row][i])){
                arr.add(board[row][i]);
            }else if(board[row][i]!='.' && arr.contains(board[row][i])){
                
                return false;
            }
        }
        return true;
    }

    boolean validCol(char[][]board,int col){

        Set<Character> arr = new HashSet<>();

        for(int i=0;i<board.length;i++){
            if(board[i][col]!='.' && !arr.contains(board[i][col])){
                arr.add(board[i][col]);
            }else if(board[i][col]!='.' && arr.contains(board[i][col])){
               
                return false;
            }
        }
        return true;
    }


    boolean validSubBox(char[][]board,int row,int col){
        Set<Character> arr = new HashSet<>();

        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){

                if(board[i][j]!='.' && !arr.contains(board[i][j])){
                    
                    arr.add(board[i][j]);
                }else if(board[i][j]!='.' && arr.contains(board[i][j])){
                    
                    return false;
                }

            }
            
        }
        return true;
    }





    public boolean isValidSudoku(char[][] board) {

         for(int i=0;i<board.length;i++){
            if(!validRow(board,i) ) return false;
        }
         
        for(int j=0;j<board[0].length;j++){

            if(!validCol(board,j)){
                return false;
            }


        }
        


        for(int i=0;i<board.length;i+=3){
     
            for(int j=0;j<board[0].length;j+=3){

                if( i+j%3==0 && !validSubBox(board,i,j)){
                    return false;
                }


            }
        }

        return true;



        
    }
}

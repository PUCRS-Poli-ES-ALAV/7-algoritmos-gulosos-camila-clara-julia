//NRainhas
public class Exercicio3 {
    public static void main(String args[]) {
        Exercicio3 Queen = new Exercicio3();
        Queen.solveNQueen();
    }

    final int N = 7;

    boolean checkIfIsSafe(int board[][], int row, int col) {
        int i, j;

        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    boolean back(int board[][], int col) {
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {

            if (checkIfIsSafe(board, i, col)) {
                board[i][col] = 1;

                if (back(board, col + 1) == true)
                    return true;
                board[i][col] = 0; // backtrack
            }
        }

        return false;
    }

    void print(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }

    boolean solveNQueen() {

        int board[][] = new int[N][N];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }

        }

        if (back(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        print(board);
        return true;
    }

    
}

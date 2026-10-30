class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> row;
        Set<Character> col;
        Set<Character> box;

        for (int i = 0; i < 9; i++) {
            row = new HashSet<>();

            for (int r = 0; r < 9; r++) {
                if (row.contains(board[r][i])) return false;
                if (board[r][i] == '.') continue;
                row.add(board[r][i]);
            }

            col = new HashSet<>();

            for (int c = 0; c < 9; c++) {
                if (col.contains(board[i][c])) return false;
                if (board[i][c] == '.') continue;
                col.add(board[i][c]);
            }

            box = new HashSet<>();

            int rowNum = (i / 3) * 3;
            int colNum = (i % 3) * 3;

            for (int r = rowNum; r < rowNum + 3; r++) {
                for (int c = colNum; c < colNum + 3; c++) {
                    if (box.contains(board[r][c])) return false;
                    if (board[r][c] == '.') continue;
                    box.add(board[r][c]);
                }
            }
        }


        return true;
    }
}

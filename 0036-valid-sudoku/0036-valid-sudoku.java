class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[0].length; j++) {
        char cur = board[i][j];

        if (cur != '.') {
            String rowKey = "row" + i + cur;
            String colKey = "col" + j + cur;
            String gridKey = "grid" + i / 3 + j / 3 + cur;

            if (!set.add(rowKey) || !set.add(colKey) || !set.add(gridKey)) {
                return false;
            }
        }
    }
}

return true;

        
    }
}
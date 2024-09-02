/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: SIERRA SHAW
 *
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        // try to jump by 12 - avoid snakes - check if anything under 12 leads to a ladder
        // if there's a ladder that gets you higher than
        int board_side = (int) Math.sqrt(boardsize);
        int i = 1;
        int moves = 0;
        boolean cont = true;
        while (i < boardsize + 1) {
            cont = true;
            if (boardsize - i > 2 && boardsize - i < 12) {
                return moves + 1;
            }
            // ?: EDGE CASE - 1 SPACE LEFT --> add 2 moves (can we automatically assume that though)
            // Check if there's a ladder btwn i and i + 12 (including i + 12)
            // ?: could be mult ladders
            if (ladders[i][0] > i && ladders[i][0] <= i + 12) {
                // ?: what if there's a ladder at i + 1 but we can't roll to it?
                // If yes, check if the # at the end of the ladder (how to find that ?) is > i + 24
                if (ladders[i][1] > i + 24) {
                    // If yes, set i = end of ladder #, moves += 1, break out of if-statement loops to continue to while loop by setting
                    // cont to false
                    i = ladders[i][1];
                    moves += 1;
                    cont = false;
                }
            }
            // If cont is true, check if there's a snake at i + 12
            // If snake, check i + 11 & continue down until no snake
            if (cont) {
                int place = i + 12;
                while (snakes[i][0] == place) {
                    place -= 1;
                }
                // Set i = i + highest value w/o snake
                i = place;
                moves += 1;
            }
        }
        // Does this use recursion??
        // base case: being one roll away from board_size
        // what's easiest / shortest to get between board_size and board_size-12 - for each value
        //
        return 0;
    }
}

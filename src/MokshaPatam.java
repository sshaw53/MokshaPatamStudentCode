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
        while (i < boardsize + 1) {
            // check if there's a ladder btwn i and i + 12 (including i + 12)
                // if yes, check if the # at the end of the ladder (how to find that ?) is > i + 24
                    // if yes, set i = end of ladder #, moves += 1, break out of if-statement loops to continue to while loop

            // if hasn't exited the loop, check if there's a snake at i + 12
                // if snake, check i + 11 & continue down until no snake
                    // set i = i + highest value w/o snake
        }


        // does this use recursion??
        return 0;
    }
}

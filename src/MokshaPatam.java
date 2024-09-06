import java.util.LinkedList;
import java.util.Queue;

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
        // Create an array of the snakes / ladders outputs for each input (index)
        int[] snake_ladder = new int[boardsize + 1];
        for (int i = 0; i < ladders.length; i++) {
            snake_ladder[ladders[i][0]] = ladders[i][1];
        }
        for (int i = 0; i < snakes.length; i++) {
            snake_ladder[snakes[i][0]] = snakes[i][1];
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        int current;
        int[] rolls = new int[boardsize + 1];
        int node;
        boolean[] visited = new boolean[boardsize + 1];

        // Add the first node to the queue
        queue.add(1);
        // While there are still nodes left in the queue
        while (!queue.isEmpty()) {
            // Remove it from the current queue and add it to the visited array
            current = queue.remove();
            // If we've reached the end of the board, return the number of rolls
            if (current == boardsize) { return rolls[current]; }
            if (current >= boardsize - 6) { return rolls[current] + 1; }
            // Finding the possible future moves
            for (int i = 1; i < 7; i++) {
                node = current + i;
                // Check to see if there's a snake or ladder to alter the possible nodes to visit
                if (snake_ladder[node] != 0) {
                    node = snake_ladder[node];
                }
                // If the node hasn't been visited, add it to the back of the queue and save roll #
                if (!visited[node]) {
                    rolls[node] = rolls[current] + 1;
                    queue.add(node);
                    visited[node] = true;
                }
            }
        }
        return -1;
    }
}

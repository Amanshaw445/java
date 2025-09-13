public class frogJump {

    static int best(int[] h, int n, int idx){

        if(idx == n-1)  // Base case: if frog is already at the last stone, cost is 0
            return 0;

                // Option 1: Jump to the next stone (idx + 1)
                // Cost = absolute height difference + recursive cost from next stone

        int op1 = Math.abs(h[idx] - h[idx+1]) + best(h, n, idx+1);
            if(idx == n-2)   // If frog is at the second last stone, it can't jump two steps ahead (idx + 2 is out of bounds)
                return op1;
                // Option 2: Jump to the stone after next (idx + 2)
        int op2 = Math.abs(h[idx] - h[idx+2]) + best(h, n, idx+2);
                // Return the minimum cost between the two options
        return Math.min(op1, op2);
    }



    public static void main(String[] args) {
        int[] h = {10, 30, 40, 20};

        int mincost = best(h,h.length,0);
        System.out.println("The min cost to reach the end is : " + mincost);
    }
}

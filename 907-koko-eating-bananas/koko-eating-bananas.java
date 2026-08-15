class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // Find the maximum pile.
        // This is the highest possible eating speed.
        int maxPile = 0;

        for (int i = 0; i < piles.length; i++) {
            maxPile = Math.max(maxPile, piles[i]);
        }

        // Possible speeds are from 1 to maxPile.
        int left = 1;
        int right = maxPile;

        // Binary search for the minimum valid speed.
        while (left < right) {

            // Find middle speed.
            int k = left + (right - left) / 2;

            // Calculate total hours needed at speed k.
            long hours = 0;

            for (int i = 0; i < piles.length; i++) {

                // Ceiling(pile / k)
                //
                // Example:
                // pile = 11, k = 4
                // (11 + 4 - 1) / 4
                // = 14 / 4
                // = 3 hours
                hours += (piles[i] + k - 1) / k;
            }

            // If Koko can finish within h hours,
            // k might be the answer.
            // Try a smaller speed.
            if (hours <= h) {
                right = k;
            }

            // If she needs more than h hours,
            // k is too slow.
            // We need a faster speed.
            else {
                left = k + 1;
            }
        }

        // left == right.
        // This is the minimum speed that works.
        return left;
    }
}
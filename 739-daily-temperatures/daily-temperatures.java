class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // make stack which stores integers
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length; // define length in shorter way

        int result[] = new int[n]; // result array which stores differenc between stack peek - tem[current]

        for(int idx=n-1; idx >= 0; idx--){ // start from last element

        //As long as the stack is not empty, and 
        // the temperature at the top of the stack is less than or equal to the current day's temperature, remove it because it can never be the next warmer day."
            while( !stack.isEmpty()   &&  temperatures[stack.peek()] <= temperatures[idx] ){
                stack.pop();
            }

            // if stack is not empty and didnt follow while 
            if( !stack.isEmpty()){
                result[idx] = stack.peek() - idx;
            }
            stack.push(idx);
        }

        return result;
    }
}
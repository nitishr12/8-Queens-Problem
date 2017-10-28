# N-Queens-Problem
Solution to the N-Queens Problem using Hill Climbing technique with a Random Restart when it gets stuck.

Requirements:
1. To run this program, you'll need to enter the value of N when it prompts you to. 
2. N can be any value until the sizeOf(int) 2D array.

Example:
java HillClimbing

Enter the size of the Chess Board
>>10
 
The heuristic value for this state is 7
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ Q _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ Q _ _ _ _ Q _ _ _ 
_ _ _ Q _ _ _ _ Q _ 
_ _ _ _ _ _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
There is a better state since 5 < 2147483647

The heuristic value for this state is 5
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ Q _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
There is a better state since 2 < 5
 
The heuristic value for this state is 2
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
There is a better state since 1 < 2

The heuristic value for this state is 1
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 9
_ Q _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ Q Q _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ Q 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
There is a better state since 3 < 9

The heuristic value for this state is 3
_ _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ Q Q _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ Q 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
There is a better state since 2 < 3

The heuristic value for this state is 2
_ _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ Q Q _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ Q 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 11
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
There is a better state since 2 < 11

The heuristic value for this state is 2
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 7
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
There is a better state since 1 < 7

The heuristic value for this state is 1
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 11
_ _ _ _ _ _ _ _ _ Q 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q Q _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
There is a better state since 2 < 11

The heuristic value for this state is 2
_ _ _ _ _ _ _ _ _ Q 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q Q _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
There is a better state since 1 < 2

The heuristic value for this state is 1
_ _ _ _ _ _ _ _ _ Q 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q Q _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 11
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ _ _ _ Q _ _ 
There is a better state since 1 < 11

The heuristic value for this state is 1
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ _ _ _ Q _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 13
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ Q Q _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ Q _ _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
There is a better state since 2 < 13

The heuristic value for this state is 2
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ Q Q _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ Q _ _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 8
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ _ _ _ 
There is a better state since 1 < 8

The heuristic value for this state is 1
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 8
_ _ _ Q _ _ _ Q _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
There is a better state since 2 < 8

The heuristic value for this state is 2
_ _ _ _ _ _ _ Q _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
There is a better state since 1 < 2

The heuristic value for this state is 1
_ _ _ _ _ _ _ Q _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ Q _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 10
Q _ _ _ Q _ _ _ _ _ 
_ _ Q _ _ _ _ _ Q _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
There is a better state since 3 < 10

The heuristic value for this state is 3
_ _ _ _ Q _ _ _ _ _ 
_ _ Q _ _ _ _ _ Q _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
There is a better state since 2 < 3

The heuristic value for this state is 2
_ _ _ _ Q _ _ _ _ _ 
_ _ Q _ _ _ _ _ Q _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 10
_ _ _ _ Q _ _ _ _ _ 
_ Q _ _ _ _ _ Q _ _ 
_ _ _ _ _ Q _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ _ _ _ _ _ _ 
There is a better state since 2 < 10

The heuristic value for this state is 2
_ _ _ _ Q _ _ _ _ _ 
_ Q _ _ _ _ _ Q _ _ 
_ _ _ _ _ Q _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ _ _ _ _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 12
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ Q Q _ 
_ _ _ _ _ _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ Q 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
There is a better state since 3 < 12

The heuristic value for this state is 3
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ Q Q _ 
_ _ _ _ _ _ _ _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ Q _ _ Q 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 10
Q _ _ _ _ _ Q _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ Q _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
There is a better state since 2 < 10

The heuristic value for this state is 2
Q _ _ _ _ _ Q _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ Q _ _ _ _ _ _ 
_ Q _ _ _ _ _ _ _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 10
_ _ _ _ Q _ Q _ _ _ 
Q Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
There is a better state since 3 < 10

The heuristic value for this state is 3
_ _ _ _ Q _ Q _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
There is a better state since 2 < 3

The heuristic value for this state is 2
_ _ _ _ Q _ Q _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ Q _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
There are no better states. We are stuck in a local maxima. Hence its time to do a random restart

The heuristic value for this state is 14
_ _ _ Q _ _ Q _ _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ _ _ _ 
There is a better state since 2 < 14

The heuristic value for this state is 2
_ _ _ _ _ _ Q _ _ _ 
Q _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
_ _ _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ _ _ _ 
There is a better state since 1 < 2

The heuristic value for this state is 1
_ _ _ _ _ _ Q _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ _ _ _ 
There is a better state since 0 < 1

The heuristic value for this state is 0
_ _ _ _ _ _ Q _ _ _ 
_ _ _ Q _ _ _ _ _ _ 
_ _ _ _ _ _ _ Q _ _ 
Q _ _ _ _ _ _ _ _ _ 
_ _ _ _ Q _ _ _ _ _ 
_ _ _ _ _ _ _ _ Q _ 
_ Q _ _ _ _ _ _ _ _ 
_ _ _ _ _ Q _ _ _ _ 
_ _ _ _ _ _ _ _ _ Q 
_ _ Q _ _ _ _ _ _ _ 
Global Maxima reached with 3 changes after 14 random restarts

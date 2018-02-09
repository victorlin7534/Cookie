# Cookie
Members: Kevin Lin, Victor Lin, Kayli Matsuyoshi 	Rooster: Team 00

## Hypothesis
If we increase the size of the matrix used in our search method, then the run time for matrix search will increase linearly.

## Background
Since we have already wrote code indended to search through a matrix in linear runtime, the next logical step as we proceed would be to test if the code runs in linear time through experimentation. 

## Experiment Methodology
The computer performs 100 trials for every 100 increment of matrix size, starting at size 1000. For each trial, the computer adds the run time to a variable which will be averaged out( sum / 100 ) at the end. This number is the recorded datum.  Every trial searches for the bottom left corner of the matrix.
The experiment was run with one gigabyte of RAM allocated for it, and it runs the search method 10000 times on a 1000x1000 matrix before recording data, because it was noticed that the first few matrix sizes had abnormally long runtimes.

## Results
![dataGraph](chart.png)

## Conclusion
Based on the data, the method first starts with non linear time for small matrixes. The data tends to pivot around a line as the size of the matrices increase. Therefore, we can conclude that the method's runtime becomes linear.

# WiproPractise

Q1. This program will find Weight of a hill pattern.The total levels in a hill pattern is the input 1, the weight of the head level is input2, and the weight increments of each subsequent level is input3. You are expected to find the total weight of the hill pattern. 

Total level, represents the number of rows in the pattern. 

'Head level represents the first row. 

Weight of a level represents the value of each star (asterisk) in that row.

The hill patterns will always be of the below format, starting with 1 star at head level and Increasing 1 star at each level till level N. 

Example l - Given the total levels in the hill pattern = 5 (i.e. with 5 rows) the weight of the head level (first row) 10 the weight increments of each subsequent level = 2 Then, The total weight of the hill pattern will be calculated as = 10 + (12+12) + (14+14+14) + (16+16+16+16) + (18+18+18+18+18) - 10 +24 + 42 + 64 + 90 = 230 

Example 2 - the total levels in the hill pattern = 4 the weight of the head level = 1 the weight increments of each subsequent level = 5 Then, Total weight of the hill pattern will be = 1 + (6+6) + (11+11+11) + (16+16+16+16) = 1 + 12 + 33 + 64 = 110

Solution: WeightHill.java

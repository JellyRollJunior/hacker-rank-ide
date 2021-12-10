# hacker-rank-ide
Tracking my progress on HackerRank :)

## Process:
 - Produce my own solution
 - Find optimal solution
 - Understand optimal solution 

## Reflection

#### Basic
 - SparseArrays: focus on data structures available rather than only using lists.
   - Tip: when doing Q queries on an input, try to use preprocessing
 - LonelyInteger: focus more on mathematical theory rather than relying on prebuilt list functions
 - DiagonalDifference: need to ask myself how I can use mathematical principles (such as the commutative property of +/- to shorten code)
 - Pangrams: pay attention to conditionals as they can make the question easier!
 - SubArrayDivision1: Think about how work from previous iterations can be reused!
 - ZigZagSequence: I need to practice dealing with indices. This easy debug problem took me longer than it should have.
 - PageCount: work through examples carefully. Don't lose focus because "this is an easy question ill just rush through it".
 - TowerBreakers: I need to step back and see the bigger picture. Don't get caught up in a single detail. 
 - CaesarCipher: USE THE SIMPLEST SOLUTION. Need to think outside of the obvious naive way to do a problem. Ask "How can I write less code?", "How can I reduce operations".
 - GridChallenge: I still need to improve my indexing visualization!
 - SherlockAndArray: be aware that you can manipulate forloop indexing to reduce code! Iteration i doesn't have to mean we're checking the solution for index i!
 - RecursiveDigitSum: Carefully check the number ranges, may need to use Long instead of int! Don't get fooled! int range in Java is (2^-31 - 2^31) or -2147483647 - 2147483647
 - CounterGame: an extremely hard question to do optimally. The naive solution is easy and slow but the optimal solution involves bit level manipulation. Always keep if statements to a minimum as they're slow. 
 - **PalindromeIndex**: It's "basic" yet it has 67% pass rate... I only completed this question after using up two "look at test cases" hacks and then I had to go to discussions to get the final part on what I was missing. This is the longest I've ever spent on a "basic" quetion and in the end I didn't even complete it with my own solution. **This question is saying I need to create more comprehensive test cases if I want to solve problems this difficult.**

#### Medium
 - FlippingTheMatrix: 
   - I won't say completed myself because I was stuck for a long time and looked at a hint that said there are only four values possible for each M[row][col] using row/col flipping. I feel slightly discouraged as previously I was at least able to hack a naive solution before looking to the discussions for help. I won't let this stop my learning though as this is what learning is all about :) if they were all easy then they wouldn't be problems. At least I can say I've successfully coded my first medium solution!
   - Tips: Have some scratch paper nearby for those tricky questions. Working this out on paper first would really have helped a lot in my opinion.

#### not much to say section (basics)
 - FlippingBits: my first time solving a solution using bitwise operators! feels very rewarding :)
 - CountingSort: kind of a boring problem. 
   - Possible improvements: use int array to index then convert to list may be slightly faster (?)
 - TwoArrays: learned how to use comparators. First question I solved myself that I really had to think about algorithmically!. Proud! :)
 - XorStrings2: debugging code, a bit too easy tbh
 - FindTheMedian: careful not to get tripped up by forgetting basics of indexing :)
 - SalesByMatchin: my first problem solved using a hashmap! Feels good using what I've learned! :)))))))
 - MaxMin: this is the first non-trivial problem which I solved quickly (15 mins) and with the optimal solution! I'm super proud of myself!!!
 - DynamicArrays: Honestly a really dumb question. I can see this being less trivial in C where arrays aren't dynamic but in Java it doesn't test understanding of anything. 
 - PrimeDates: debugging the mainloop was straightforward but making us debug leap year logic is an utter waste of time. A horrible problem for testing coding knowledge. 
 - SumVsXor: I'm so proud I figured this problem out myself! It's only at 73% clear rate!!! 


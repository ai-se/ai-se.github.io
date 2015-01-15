---
layout: post
title: Wei Fu's report
excerpt: 
---

======
 Seive
======

1. Tried sdiv() -> extracted ranges for all the decisions and use these ranges randomly to create initial points. - No helpful. Results were almost the same.
2. Only use the range which has the highest mean score - Works for both Seive3 and Seive2. - Not helpful. There is a improved in the score
3. Added GALE mutation and fastmap to point 2 - Does well.
4. Stopped filling cells using extrapolation (while running seive) this reduces the number of evaluation of Seive2_initial by ~33% but I don't see any major effect in the scores.

[Results](https://github.com/vivekaxl/Courses/blob/master/Misc/new_Seive/solution3.txt)  


RandomForestTuning
==================
Seive3. Doesn't really help. [Result](https://github.com/vivekaxl/sbse-icse2014/blob/master/final3.pdf)

TODO
====
1. Test Seive by tuning Wei's prediction.




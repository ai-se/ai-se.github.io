---
title: Tuning for Software Analytics: is it Really Necessary?
layout: page

excerpt: Tune your learner before using it.
---

with _Wei Fu,_ NC State

<img align=left width=150
     src="{{site.url}}/img/tunelearner.png">     
One of the “black arts” of data mining is setting the tuning parameters that control the miner. We offer a simple, automatic, and very effective method for finding those tunings.

Contrary to our prior expectations, finding these tunings was re-markably simple: it only required tens, not thousands, of attempts to obtain very good results. For example, when learning softwaredefect predictors, this method can quickly find tunings that alterdetection precision from 2% to 98%.

Given that (1) the improvements are so large, and (2) the tuningis so simple, these results prompt for a change to standard meth-ods in software analytics.  At least for defect prediction, it is no longer enough to just run a data miner and present the result without conducting a tuning optimization study. The implication for other kinds of analytics is now an open and pressing issue.
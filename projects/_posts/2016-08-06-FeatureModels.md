---
title:  Faster Discovery of Faster System Configurations
layout: page

excerpt: Sampling to generate better performance prediction models
---

with _Vivek Nair,_ NC State
     
     
Despite the huge spread and economical importance of configurable soft-ware systems, there is unsatisfactory support in utilizing the full potential of thesesystems with respect to finding performance-optimal configurations. Prior work onpredicting the performance of software configurations suffered from either (a) requir-ing far too many sample configurations or (b) large variances in their predictions.Both these problems can be avoided using theWHATspectral learner.WHAT’s in-novation is the use of the spectrum (eigenvalues) of the distance matrix between theconfigurations of a configurable software system, to perform dimensionality reduc-tion. Within that reduced configuration space, many closely associated configurationscan be studied by executing only a few sample configurations. For the subject systemsstudied here, a few dozen samples yield accurate and stable predictors—less than10 % prediction error, with a standard deviation of less than 2 %. When comparedto the state of the art,WHAT(a) requires 2 to 10 times fewer samples to achievesimilar prediction accuracies, and (b) its predictions are more stable (i.e., have lowerstandard deviation). Furthermore, we demonstrate that predictive models generatedbyWHATcan be used by optimizers to discover system configurations that closelyapproach the optimal performance.


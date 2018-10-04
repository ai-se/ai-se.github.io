---
title: Can You Explain That, Better? Comprehensible Text Analytics for SE Applications
layout: page

excerpt: Comprehensibility, Actionable, Interpretability of models is equally important
---

with _[Amritanshu Agrawal](/people/2014/05/17/Amritanshu-Agrawal/),_ NC State
     
<img align="left" width="300"
 src="/img/comprehensibility.png"> 
     
Text mining methods are used for a wide range of
Software Engineering (SE) tasks. The biggest challenge of text
mining is high dimensional data, i.e., a corpus of documents can
contain 10^4
to 10^6
unique words. To address this complexity,
some very convoluted text mining methods have been applied.
Is that complexity necessary? Are there simpler ways to quickly
generate models that perform as well as the more convoluted
methods and also be human-readable?

To answer these questions, we explore a combination of
LDA (Latent Dirichlet Allocation) and FFTs (Fast and Frugal
Trees) to classify NASA software bug reports from six different
projects. Designed using principles from psychological science,
FFTs return very small models that are human-comprehensible.
When compared to the commonly used text mining method
and a recent state-of-the-art-system (search-based SE method
that automatically tune the control parameters of LDA), these
FFT models are very small (a binary tree of depth d = 4 that
references only 4 topics) and hence easy to understand. They were
also faster to generate and produced similar or better severity
predictions.

Hence we can conclude that, at least for datasets explored
here, convoluted text mining models can be deprecated in favor
of simpler method such as LDA+FFTs. At the very least,
we recommend LDA+FFTs (a) when humans need to read,
understand, and audit a model or (b) as an initial baseline method
for the SE researchers exploring text artifacts from software
projects. _[Read More](https://arxiv.org/abs/1804.10657)_

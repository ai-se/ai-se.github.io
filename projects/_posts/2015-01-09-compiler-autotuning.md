---
title:  Smarter Software Autotuning for Data Analytics
layout: page

excerpt: When reasoning, we have to think smarter, not faster.
---

_With [Xipeng Shen](http://people.engr.ncsu.edu/xshen5/)_

<img align=left width=500
src="{{site.url}}/img/levels_.png">

Increasingly, our society and research is making
more use of computational methods. For example, in
2013 a Nobel Prize was awarded to chemists using
computer models to explore very fast chemical
reactions during photosynthesis. In the press
release of the award, the Nobel Prize committee
wrote _Today the computer is just as important
a tool for chemists as the test tube_.

As with general science, so too with data analytics in software engineering
where it is now
routine to rely on CPU-intensive data analytics.
Paradoxically, at the same time as needing more CPU, it now becomes
harder to build faster ones (or power existing ones).  To address this
problem, much current research has explored _software
  autotuners_---tools for adjusting software such that they make
better use of existing computational resources. For example, when
autotuning a MapReduce algorithm, such tuners might decide how many
nodes should be allocated to "map" and how many to "reduce".

The space of possible options for autotuning is very large: all
possible settings for algorithms, compilers, and execution time
options.  To complicate matters, there are many competing goals that
could be used to guide that tuning; e.g. reducing usage of CPU 
_  and_ memory _and_ power while ensuring good output from our
algorithms.  Hence, current research explores very
_narrow autotuners_ that explore just a few options while trying to improve
on just one or two goals.

This research proposes very _broad autotuning_ that takes
advantage of the _synergies_ between all those options and goals by
exploiting _relevancy filtering_ (to quickly dispose of unhelpful
options), _locality of inference_ (that enables faster updates to
out-dated tunings) and _redundancy reduction_ (that reduces the
search space for better tunings).

This new autotuner will be a faster method for
finding better tunings that satisfy more goals.  To
test this claim, this research will assess if this
new tool can reduce the total computational
resources required for effective SE data analytics
by orders of magnitude. 

For case studies, this proposal will use samples
of complex SE data analytics tasks from the PIs' work
and from their industrial partners from Microsoft and LexisNexis.


### Broader Impacts:
Apart from its specific application to SE data analytics this research will enable more
computational-based science by reducing the resources required to perform that research. This
would be a highly significant results.
Data centers now consume 1.5% of globally electrical output and this value
is predicted to grow dramatically in the very near future.
Engineers at Google report that a 1%
reduction in CPU requirements saves them millions of
dollars in electricity costs (as well as
reducing the pollution associated with that power production). 


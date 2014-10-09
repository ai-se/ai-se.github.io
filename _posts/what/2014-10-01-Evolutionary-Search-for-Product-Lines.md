---
title: Evolutionary Search with Strong Heuristics for Software Product Line Configuration
layout: page
category: projects

excerpt: Faster reasoning about software product lines
---

with _Abdel Salam Sayyad,_ WVU

<img align=left width=150 src="{{site.url}}/img/spl.png">
Software design is a process of trading off
competing objectives. In this study, we configure
software product lines (expressed as feature
models). As we increase the number of objectives,
standard optimizers in widespread use (e.g. NSGA-II,
SPEA2) perform much worse than IBEA (Indicator-Based
Evolutionary Algorithm) since IBEA makes most use of
user preferences. Also, IBEA generates far more
products with no violations of domain
constraints. This research presents two methods for
scaling IBEA to very large feature models with many
objectives.  Our “PUSH” technique forces the
evolutionary search to respect certain rules and
dependencies defined by the feature models. Also,
our “PULL” technique gives higher weight to
constraint satisfaction as an optimization objective
and thus achieves a higher percentage of
fully-compliant configurations within short
runtimes. Using IBEA+PUSH+PULL, we can extract valid
products in a matter of minutes, even from very
large feature models of Linux kernels. Our
conclusion is that the methods we apply in
search-based software engineering need to be
carefully chosen, particularly when studying complex
decision spaces with many optimization objectives.
As shown here, better and faster optimizers can be
built when designers take full advantage of
naturally occurring domain constraints.

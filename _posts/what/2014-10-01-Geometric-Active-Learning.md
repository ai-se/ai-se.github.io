---
title: GALE- Geometric Active Learning for Search-Based Software Engineering
layout: page
category: projects

excerpt: Faster multi-objective optimization
---

with _Joseph Krall,_, WVU

<img align=left width=300 
src="{{site.url}}/img/gale.png">
Multi-objective evolutionary algorithms
(MOEAs) help software engineers find novel solutions
to complex problems. When MOEAs explore too many
options, they are slow to use and hard to
comprehend. GALE is a near-linear time MOEA that
builds a piecewise approximation to the surface of
best solutions along the Pareto frontier. For each
piece, GALE mutates solutions towards the better
end. In numerous case studies, GALE finds comparable
solutions to standard methods (NSGA-II, SPEA2) using
far fewer evaluations (e.g. 20 evaluations, not
1000). GALE is recommended when a model is expensive
to evaluate, or when some audience needs to browse
and understand how an MOEA has made its conclusions.

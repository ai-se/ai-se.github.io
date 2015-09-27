---
layout: page
title: Rahul submits his paper to ICSE'16
author: Admin
excerpt: How to Learn Useful Changes to Software Projects
---
Rahul Krishna submits his paper titled "How to Learn Useful Changes to Software Projects (to Reduce Runtimes and Software Defects)" to ICSE 2016. This is a joint work with [Dr. Xipeng Shen](http://people.engr.ncsu.edu/xshen5/), [Andrian Marcus](http://www.utdallas.edu/~amarcus/), [Naveen Lekkalapudi](https://www.linkedin.com/in/nave91) and [Lucas Layman](http://www.fc-md.umd.edu/People/LucasLayman). For more see [notes](http://ai4se.net/projects/2014/10/01/40-Cross-Trees/).

**Title:** How to Learn Useful Changes to Software Projects (to Reduce Runtimes and Software Defects)

**Abstract:** Business users now demand more insightful analytics; specifically,
tools that generate “plans”– specific suggestions on what to change
in order to improve the predicted values.
This paper proposes XTREE, a planner for software projects.
XTREE receives tables of data with independent features and a
corresponding weighted class which indicates the quality (“bad” or
“better”) of each row in the table. Plans are edits to the rows which
ensures the changed row is more likely to be of a “better” quality.
XTREE learns those plans by building a decision tree across
the data, then reporting the differences in the branches from some
current branch to another desired branch. Using data from 11 software
projects, XTREE can find better plans compared to three alternate
methods. Those plans have lead to improvements with a
median size of (56%, 28%) and largest size of (60%, 77%) in (defect
counts, runtimes), respectively.
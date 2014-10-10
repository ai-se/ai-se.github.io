---
title: LACE2- Better Privacy-Preserving Data Sharing for Cross Project Defect Prediction
layout: page
category: projects

excerpt: Sharing data, without revealing private data
---


with _Fayola Peters_, Lero, Irish SE Research Centre

<img align=left width=150 src="{{site.baseurl}}/img/lace.png">
Before a community can learn general principles, it
must share individual experiences. A wide range of
privacy con- siderations complicates sharing of data
in software engineering. Prior work on secure data
sharing allowed data owners to share their data on a
single-party basis.

LACE2 extends that work by considering multi-party
data sharing where data owners incrementally add
data to a cache passed between them. Only a portion
of local data is added to this cache: the
“interesting” data that are not similar to the
current contents of the cache. Also, before data
owner i passes the cache to data owner j, privacy is
preserved by applying obfuscation algorithms to hide
project details.

The experiments of this research show that (a) LACE2 is
comparatively less expensive than the single-party
approach and (b) the multi-party approach of LACE2
yields higher privacy than the prior approach
without damaging predictive power (indeed, in some
cases, LACE2 lead to better defect predictors).

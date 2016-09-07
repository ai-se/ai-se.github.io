---
title:  Is Crowdsourcing Powerful Enough for Analyzing Open Source Development?
layout: page

excerpt: For SE data that text mining doesn't work, try crowdsourcing.
---

with _[Di (Jack) Chen](http://ai4se.net/people/2014/05/16/Di-Chen/),_ NC State
     
<img align=right width=300
 src="https://raw.githubusercontent.com/ai-se/ai-se.github.io/master/img/crowdsourcing_cloud.jpg"/>     
Among all the work for analyzing the development of open source projcts in SE field, we find interview and text mining are the two ruling methods used by researches. Interviews give researchers directly feedback form people, while at a cost of time and even money in some situations. Text mining enable researchers to process massive dataset in a much faster way, but has the probelm of understanding natural languages. With crowdsourcing, we can analyze many big datasets that are hard for computer to understand, at quite a low cost in term of time and money. 

Our experiments on Amazon Mechanical Turk have proved the feasibility of turk workers to analyze comments on Github. Now, we are leveraging the advantages of crowdsourcing and machine learning to analyze thousands of pull request discussions from GitHub, which contains tens of thousands comments. The final target is to find out:

- What's the cause for intense discussion around pull requests? 
- Are they disapproving the solusions being proposed or the problems being solved? 
- Do core members always agree with each other? What happens when disagreements happen? 
- How audience pressure affect pull requests' results? 
- What role does alert/mention system play? Does that have influence the final results?

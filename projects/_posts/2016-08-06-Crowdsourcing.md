---
title:  Is Crowdsourcing Powerful Enough for Analyzing Open Source Development?
layout: page

excerpt: For SE data that text mining doesn't work, try crowdsourcing.
---

with _[Di (Jack) Chen](http://ai4se.net/people/2014/05/16/Di-Chen/),_ NC State
     
<img align=right width=300
 src="https://raw.githubusercontent.com/ai-se/ai-se.github.io/master/img/crowdsourcing_cloud.jpg"/>     
Among all the work for analyzing development of open source projcts in SE field, we found interview and text mining are the two ruling methods that researches take. Interviews give researchers directly feedback form interviewees, while at a cost of time, quantity and money in some situations. Textmining enable researchers to process massive dataset in a pretty fast way, but has the probelm of understanding natural language well. With crowdsourcing, we can deal with big dataset that are hard for computer to understan, at quite a low cost of both time and money. 

Our experiments on Amazon Mechanical Turk have proved the feasibility to analyze comments on Github. We are leveraging the advantages of crowdsourcing and machine learning to analyze thousands of pull requests from GitHub, which contains tens of thousands comments. The final target is to find out:

- What's the cause for intense discussion around pull requests? 
- Are they disapproving the solusions being proposed or the problems being solved? 
- Do core members always agree with each other? What happens when disagreements happen? 
- How audience pressure affect pull requests' results? 
- What role does alert/mention system play? Does that have influence the final results?

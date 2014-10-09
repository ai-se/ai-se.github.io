---
title: Projects
layout: page
---

 
         {% for post in site.posts do  %}
           {% if post.category == "projects" %}
            <h2> {{post.date | date: "%b%-d '%y"}}:
		 {{post.title}}:
	       </h2>
                  <p> <em>{{post.excerpt}}</em>
                  <p>{{post.content}}</p> 
            </p>
           {% endif %}
        {% endfor %}

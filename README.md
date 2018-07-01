ai-se.github.io
===============

ai-se ncstate website

Update the talks: talks/index.html

Add news: create file `yyyy-mm-dd-eventxxx.md` on /news/\_posts

Add new people: 1. create file `yyyy-mm-dd-namexxx.md` on /people/\_posts ,then 2. register at index.md

Update the cover Carousel images: \_includes/landingCarousel.html

Update the landing images in sections: \_includes/landimg.html

All landing images/carousel images should be in ratio width:height=2:1

Debug and build at local machine `jekyll serve`

Avoid using `{{site.url}}`, use relative path is sufficient  e.g. `<img src="/img/reading.jpg" alt="xxx">`

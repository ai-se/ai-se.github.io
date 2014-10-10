
commit: ready
	- git status
	- git commit -am "stuff"
	- git push origin master

ready:
	@echo 'readying...'

update:
	- git pull origin master

status:
	- git status

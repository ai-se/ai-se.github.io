typo:
	- git status
	- git commit -am "typo"
	- git push origin master

commit:
	- git status
	- git commit -a
	- git push origin master

update:
	- git pull origin master

status:
	- git status

upload:
	- git pull origin master
	- git add --all
	- git commit -m "auto update"
	- git push origin master

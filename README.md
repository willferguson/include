## Tests including external resources

Start NGINX on port 8081 with the nginx_run.sh file (docker)

Start Included app (starts on 8080)

Start Including app (starts on 8082)

Requests:

http://localhost:8082/test/{anything} - will pause for 2.5 secs and then return "hello {anything}"

http://localhost:8080/jstl - shows jstl imports happen consecutively (4 x 2.5 sec pause)

http://localhost:8081/ - SSI with Nginx. Nginx proxies request to localhost:8080 which serves page with 4 x includes to /test page. 
Page returns in ~2.5 seconds showing concurrent execution of SSI


Note - nginx.conf is written for mac

#!/bin/bash

docker run -p8081:80  -v $PWD/nginx.conf:/etc/nginx/nginx.conf:ro nginx

#!/bin/sh

echo "********************************************************"
echo "Waiting for the configuration server to start on port $CONFIGSERVER_PORT"
echo "********************************************************"
while ! `nc -z $CONFIGSERVER_HOST $CONFIGSERVER_PORT`; do sleep 3; done
echo "*******  Configuration Server has started"


echo "********************************************************"
echo "Starting  Service                           "
echo "********************************************************"
java  $MEM_ARGS -Dspring.profiles.active=$PROFILE -jar app.jar
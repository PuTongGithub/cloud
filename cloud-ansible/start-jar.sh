#!/bin/bash 
PID=$(ps -ef | grep $2 | grep -v grep | grep -v start-jar.sh | awk '{print $2}') 
if [ "$PID" != "" ]
then
    kill $PID
    sleep 5
fi
nohup java -jar $1$2 >$1nohup.log 2>&1 &
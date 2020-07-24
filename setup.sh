#!/bin/bash
DIR="$( cd "$(dirname "$0")" ; pwd -P )"
UPDATE_JAR=$HOME/.codenameone/UpdateCodenameOne.jar
if [ ! -f $UPDATE_JAR ]
then
	curl https://www.codenameone.com/files/updates/UpdateCodenameOne.jar > $UPDATE_JAR
fi
rm Versions.properties
java -jar $UPDATE_JAR $DIR force
mkdir webrtc/lib
cp lib/CodenameOne_SRC.zip webrtc/lib/
cp lib/CodenameOne.jar webrtc/lib/
cp lib/CLDC11.jar webrtc/lib/



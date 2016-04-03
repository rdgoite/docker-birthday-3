#!/bin/bash

cd /usr/local/src/java

source ~/.sdkman/bin/sdkman-init.sh && gradle build
java -jar -Djava.security.egd=file:/dev/urandom build/libs/worker-1.0-SNAPSHOT.jar
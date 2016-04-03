FROM java:openjdk-8-jdk-alpine

#RUN apt-get update -qq && apt-get install -y maven && apt-get clean
VOLUME /usr/local/src/java

WORKDIR /usr/local/src/java

RUN apk update \
 && apk add bash \
 && bash

RUN rm /bin/sh && ln -s /bin/bash /bin/sh

RUN apk add curl \
 && curl -s get.sdkman.io | bash \
 && source ~/.sdkman/bin/sdkman-init.sh \
 && apk add unzip \
 && sdk install gradle

COPY worker-entrypoint.sh /
RUN chmod +x /worker-entrypoint.sh
ENTRYPOINT ["/worker-entrypoint.sh"]

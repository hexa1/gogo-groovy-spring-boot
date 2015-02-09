#!/bin/bash

# Join arguments in a string. But not quite like you'd expect... see next line.
printf -v var "%s " "$@"

# Optionally:
# export JAVA_OPTS=-Xmx1024m -XX:MaxPermSize=128M -Djava.security.egd=file:/dev/./urandom

./gradlew bootRun -Pargs="$var"

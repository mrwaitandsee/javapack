#!/bin/bash

rootApplicationDirectory="$(dirname "${BASH_SOURCE[0]}")/../"

application="${rootApplicationDirectory}javapack.jar";

if [[ -z "$1" ]];
  then
    java -jar $application $rootApplicationDirectory -before
  else
    echo "Have argument"
fi

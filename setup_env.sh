#!/bin/sh
printf "start setup dev env ...\n"

if [ ! -d releases ]; then
    mkdir  releases
fi

export RELEASES_PATH=`pwd`/releases

printf "setup env successfully ...\n"

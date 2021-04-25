#!/usr/bin/env bash
mkdir -p out/ && javac $1 -d out/
fileName=$(echo $1 | rev | cut -d"/" -f1 | rev)
filePath=$(echo $1 | rev | cut -d"." -f2- | rev)
classFileName=$(echo $fileName | rev | cut -d"." -f2- | rev)
cd out/
java $(tr '/' '.' <<<"$filePath")
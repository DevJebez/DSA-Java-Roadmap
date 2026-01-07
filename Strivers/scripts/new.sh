#!/bin/bash

NAME=$1

BASE_DIR="$(cd "$(dirname "$0")/.." && pwd)"
OUT_DIR="$(pwd)"
TPL="$BASE_DIR/templates/java_dsa.tpl"

if [ -z "$NAME" ]; then
  echo "Usage: ./new.sh ProblemName"
  exit 1
fi

FILE="$OUT_DIR/$NAME.java"

if [ -f "$FILE" ]; then
  echo "File already exists: $FILE"
  exit 1
fi

cp "$TPL" "$FILE"

# Replace class name placeholder with filename
sed -i "s/__FILENAME__/$NAME/g" "$FILE"

code "$FILE"
echo "Created $FILE"

#!/usr/bin/env bash

set -o errexit
set -o nounset

COMMIT="b5604da0fc49ba9369b409f75c4e0eb755c423b9"

if [ ! -f platform_cli.py ]
then
  curl "https://raw.githubusercontent.com/wellcometrust/platform/$COMMIT/builds/platform_cli.py" > platform_cli.py
end

python platform_cli.py "$@"

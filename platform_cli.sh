#!/usr/bin/env bash

set -o errexit
set -o nounset

if [ ! -f platform_cli.py ]
then
  curl "https://raw.githubusercontent.com/wellcometrust/platform/master/builds/platform_cli.py" > platform_cli.py
end

python platform_cli.py "$@"

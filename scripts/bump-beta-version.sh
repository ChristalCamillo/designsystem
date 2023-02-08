#!/usr/bin/env bash

branchName=${1#"refs/heads/"}

echo "Add git configs $branchName"

git config --global user.email "localiza@localiza.com"
git config --global user.name "Azure Pipelines"
git config --global credential.helper

echo "Checkout to branch $branchName"

git checkout $branchName
git reset --hard origin/$branchName
git pull origin $branchName

echo "Release with arguments: $2"
bundle exec fastlane android beta

git push
git push --tags
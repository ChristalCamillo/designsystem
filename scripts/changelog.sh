#!/usr/bin/env bash
prefix_tag=""
folder=""
while getopts p:f: flag
do
    case "${flag}" in
        p) prefix_tag=${OPTARG};;
        f) folder=${OPTARG};;
    esac
done

previous_tag=0
for current_tag in $(git tag --sort=-creatordate | grep "$prefix_tag")
do

if [ "$previous_tag" != 0 ];then
    tag_date=$(git log -1 --pretty=format:'%ad' --date=short ${previous_tag}  )
    printf "## ${previous_tag} (${tag_date})\n\n"
    git log --oneline  ${current_tag}...${previous_tag} --pretty=format:'*  %s [View](https://localiza.visualstudio.com/Arquitetura%20-%20Bibliotecas%20Open%20Source%20Localiza/_git/mob-design-system-android/commit/%H)' -- ${folder} --reverse | grep -v Merge
    printf "\n\n"
fi

previous_tag=${current_tag}
done
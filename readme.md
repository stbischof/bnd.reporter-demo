# Bnd Documentation Generation Demo

## Overview

This repository illustrates the use of the `-exportreport` bnd instruction to generate `README` documentation. 

To review [PR #3287](https://github.com/bndtools/bnd/pull/3287) you can look at the Bnd Workspace Model readme files (maven projects' readme files are out of date).

## Generate Documentation

Bnd CLI and `bnd-reporter-maven-plugin` version 4.3.0-SNAPSHOT are required.

### For Bnd Workspace Model Projects

* Run `cd bnd-workspace/max-workspace` or `cd bnd-workspace/min-workspace`
* Run `./gradlew clean build`
* Run `java -jar ../../bnd-cli/biz.aQute.bnd.jar exportreport export`

### For Maven Projects

* Run `cd bnd-maven/max-workspace` or `cd bnd-maven/min-workspace`
* Run `mvn clean install`
* Run `mvn bnd-reporter:export`


# Bnd Documentation Generation Demo

## Overview

This repository illustrates the documentation generation tool of Bnd. 

Main documentation page is [here](https://bnd.bndtools.org/chapters/395-generating-documentation.html)

## Generate Documentation

### For Bnd Workspace Model Projects

* Run `cd bnd-workspace/max-workspace` or `cd bnd-workspace/min-workspace`
* Run `./gradlew clean build`
* Run `java -jar ../../bnd-cli/biz.aQute.bnd.jar exportreport readme`

> Note you can use the command on any workspace or bundles to see how it works (no configuration needed).

### For Maven Projects

* Run `cd bnd-maven/max-workspace` or `cd bnd-maven/min-workspace`
* Run `mvn clean install`
* Run `mvn bnd-reporter:readme`


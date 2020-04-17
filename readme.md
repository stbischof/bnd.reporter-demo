# Bnd Documentation Generation Demo

## Overview

This repository illustrates the documentation generation tool of Bnd. 

Main documentation page is [here](https://bnd.bndtools.org/chapters/395-generating-documentation.html)

## Generate Documentation

### For Bnd Workspace Model Projects

[Install bnd on the command line](https://github.com/bndtools/bnd/wiki/Install-bnd-on-the-command-line)

* Run `cd bnd-workspace`
* Run `./gradlew clean build`
* Run `java -jar $BND_PATH/biz.aQute.bnd.jar exportreport readme`

> Note you can use the command on any workspace or bundles to see how it works (no configuration needed).

### For Maven Projects

* Run `cd mvn-workspace`
* Run `mvn clean install`

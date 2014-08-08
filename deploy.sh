#!/bin/sh

mkdir -p $CATALINA_HOME/webapps/petulant-batman/

cp -r src/main/webapp/* $CATALINA_HOME/webapps/petulant-batman/
cp -r target/classes $CATALINA_HOME/webapps/petulant-batman/WEB-INF/

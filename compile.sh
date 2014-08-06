#!/bin/sh

javac -d target/classes/ src/main/java/com/baldurtech/*.java
javac -d target/test-classes/ -classpath "lib-test/reflections-0.9.9-RC2.jar;target/classes" src/test/java/com/baldurtech/*.java src/test/java/com/baldurtech/unit/*.java


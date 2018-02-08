@echo off

rem Licensed Materials - Property of IBM
rem IBM Cognos Products: DOCS
rem (C) Copyright IBM Corp. 2013
rem US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with
rem IBM Corp.

rem Run genericAuthenticationPrompt.class

set JAVA_HOME=../../../../bin64/jre/7.0/bin/java.exe
set CRN_HOME=../../../../

set JAR_HOME=%CRN_HOME%sdk/java/lib

rem Build the CLASSPATH required to run genericAuthenticationPrompt.class

set CLASSPATH=.
set CLASSPATH=%CLASSPATH%;%JAR_HOME%/axis.jar
set CLASSPATH=%CLASSPATH%;%JAR_HOME%/commons-discovery-0.2.jar
set CLASSPATH=%CLASSPATH%;%JAR_HOME%/commons-logging-1.1.jar
set CLASSPATH=%CLASSPATH%;%JAR_HOME%/log4j-1.2.8.jar
set CLASSPATH=%CLASSPATH%;%JAR_HOME%/jaxrpc.jar
set CLASSPATH=%CLASSPATH%;%JAR_HOME%/saaj.jar
set CLASSPATH=%CLASSPATH%;%JAR_HOME%/wsdl4j-1.5.1.jar
set CLASSPATH=%CLASSPATH%;../common_class

rem Run genericAuthenticationPrompt.class

"%JAVA_HOME%" -classpath %CLASSPATH% genericAuthenticationPrompt %1 %2 %3 %4
goto end

:end
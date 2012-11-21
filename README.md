Analyse a Java/JavaScript-Project with Sonar
============================================

HowTo
-----

* you need a running sonar server http://www.sonarsource.org/

* and the sonar javascript plugin http://docs.codehaus.org/display/SONAR/JavaScript+Plugin

* download jstestdriver.jar http://code.google.com/p/js-test-driver/downloads/list and install it to your local maven repository

<pre>  mvn install:install-file -Dfile=<path-to-file> -DgroupId=com.google.jstestdriver -DartifactId=jstestdriver -Dversion=<version> -Dpackaging=jar</pre>

* start the jstd server on your local or on a remote computer

<pre>  java -jar JsTestDriver-1.3.5.jar --port 9876</pre>

* capture some browsers

<pre>  http://localhost:9876/capture</pre>

* clone this example project

<pre>  git clone https://github.com/synyx/javaJsAnalysis.git</pre>

* adjust the ip of the jstd server in  *src/test/resources/jsTestDriver.conf*

* start the sonar goal to analyse the java sources

<pre>  mvn sonar:sonar</pre>

* and then start the analysis of the javascript sources

<pre> mvn sonar:sonar -P sonarJsEnabled</pre>

# qualinsight-mojo-cobertura-example
Example project that uses [``qualinsight-mojo-cobertura``](https://github.com/QualInsight/qualinsight-mojo-cobertura) plugin to generate UT, IT and overall coverage reports. 

## About the examples

Examples of UTs, ITs coverage and Overall coverage can be run using the project's root reactor. If you want to run examples of ITs with Jetty server, you need to run them separately as they require a different JDK to be run. 

Here are corresponding constraints:

| module name        | JDK version | Maven version | Servlet API | Jetty version    |
|--------------------|-------------|---------------|-------------|------------------|
| uttests            | 1.7         | 3.3.3         | none        | none             |
| ittests            | 1.7         | 3.3.3         | none        | none             |
| alltests           | 1.7         | 3.3.3         | none        | none             |
| wartest-jetty7.6.x | 1.5         | 3.0.5         | 2.5         | 7.6.17.v20150415 |
| wartest-jetty8.1.x | 1.6         | 3.3.3         | 3.0.1       | 8.1.17.v20150415 |
| wartest-jetty9.2.x | 1.7         | 3.3.3         | 3.1.0       | 9.2.13.v20150730 |
| wartest-jetty9.3.x | 1.8         | 3.3.3         | 3.1.0       | 9.3.3.v20150827  |

**Note**: Cobertura data file dump while running IT tests for servlets deployed on a Jetty server is done thanks to a shutdown hook provided by the [``qualinsight-plugins-jetty``](https://github.com/QualInsight/qualinsight-plugins-jetty) project.

## Build status
[![Build Status](https://travis-ci.org/pawlakm/qualinsight-mojo-cobertura-example.svg?branch=master)](https://travis-ci.org/pawlakm/qualinsight-mojo-cobertura-example)

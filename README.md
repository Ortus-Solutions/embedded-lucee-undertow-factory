# Embedded Lucee Undertow Server

[![Build Status](https://travis-ci.org/DominicWatson/embedded-lucee-undertow-factory.svg?branch=master)](https://travis-ci.org/DominicWatson/embedded-lucee-undertow-factory)

Java library to provide an easy interface to building an embedded Undertow servlet container with a deployed Lucee application. Usage:

```
import org.lucee

// ...

LuceeUndertowServer server = new LuceeUndertowServer(
	  4040                                // port
	, 'localhost'                         // host
	, '/path/to/lucee/lib,/extra/lib/dir' // libDirs
	, '/path/to/app/www'                  // webroot
	, '/path/to/web.xml'                  // webXmlPath
	, '/path/to/app/www/WEB-INF'          // webInfPath
);

server.start();
// ...
server.restart();
// ...
server.shutdown();
```

## Download

Built artifacts are available from [http://downloads.domwatson.codes](http://downloads.domwatson.codes/#!/embedded-lucee-undertow-factory%2F).

## Building from source

Build with Maven: `mvn package`
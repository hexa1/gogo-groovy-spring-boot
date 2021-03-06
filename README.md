## GoGo Groovy Spring Boot [![Build Status](https://travis-ci.org/hexa1/gogo-groovy-spring-boot.svg)](https://travis-ci.org/hexa1/gogo-groovy-spring-boot)

A skeleton framework of a Groovy+Gradle Spring Boot 4 application.

- Gradle 2.9
- Groovy 2.4.5

Demonstrates several concepts in boostrapping a Spring app:

- Using SpringBoot starter
- Using a whole lot of other spring boot starters
- Building (fat) distributable and executable war using `./gradlew dist` or `./build.sh`
- Running a dev-time instance of the app and passing parameters using `./app --param`
- Passing git properties to Spring boot (for diagnostics)
- Standard directory structure and project layout
- Using application.properties (many config options shown)
- Customizing the logger and the banner
- Logging in the app using Slf4j
- Setting a configuration class that takes params from config files and command line
- App lifecycle functions
- Basic usage of annotations: @SpringBootApplication, @Autowired, @Component, @Value, @Bean, etc...
- Many useful resource/info links
- A typical project structure: `.editorconfig`, `.gitattributes`, `.gitignore`, `.travis.yml`, gradle wrapper, LICENSE, utility shell scripts, etc...
- Gradle daemon
- S3 maven and ivy repos

## Useful Commands

- `./gradlew dist` create a stand-alone distributable jar file in the `dist` folder
- `./gradlew test` test everything
- `./gradlew codenarcMain` codenarc only main source files
- `./gradlew codenarcTest` codenarc only test source files
- `./gradlew groovydoc` generate documentation using Groovydoc 2 (pretty!)
- `./gradlew build` build the whole project
- `gradle wrapper` Re-generate wrapper (graldew, gradlew.bat)
- `./app` Run the application in development as standalone (emulates distribution)

## Spring Live-reload

1. Start a normal gradle instance with the `bootRun` target
1. Start another gradle instance to watch class changes: `$ ./gradlew -t classes`

## Must-read Resources

- https://spring.io/guides/gs/spring-boot/
- http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/

## TODO

- Improve travis.yml with test targets
- TODO: Pack200: http://docs.oracle.com/javase/7/docs/technotes/tools/share/pack200.html

package app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import org.springframework.boot.CommandLineRunner
import org.springframework.beans.factory.annotation.Autowired

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Main Application class
 */
// http://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-structuring-your-code.html
// Sample applications: https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
// ... or simply @SpringBootApplication
@SpringBootApplication
class Application implements CommandLineRunner {
  final static Logger log = LoggerFactory.getLogger(Application.class);

  @Autowired
  private Config config

  /**
   * Main method
   */
  static void main(String[] args) {
    //If you don’t want command line properties to be added to the Environment you can disable them using
    //SpringApplication.setAddCommandLineProperties(false)
    SpringApplication app = new SpringApplication(Application.class)
    //app.setShowBanner(false);
    app.run(args)
  } // main

  /**
   * Application entry-point
   */
  @Override
  public void run(String... args) {
    log.debug "Saying hello to: " + config.name
    log.debug "Arguments are: " + args
    // do something...
  } // run

  /**
   *
   */
  @PostConstruct
  def appConstruct() {
    log.info "Initializing app..."
  } // appInit

  /**
   *
   */
  @PreDestroy
  def appDestroy() {
    log.debug "Will clean up and shut down..."
  } // appCleanup
} // Application

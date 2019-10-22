# Serenity-Selenium-Cucumber-Junit-Maven-Java Sample Test Automation Solution

- Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured. 
- Design patterns like Lean Page Objects, Action & Question Classes approach are used in this solution to make the tests very readable and easily maintainable.
- Tests are written in BDD Gherkin format and it is represented as a living documentation in the test report. 
- Application under test: http://automationpractice.com/

### The project directory structure

```Gherkin
src
  + main
    +java
      + utils                       Utililty classes to read test data and generate DTO's
  + test
    + java                          Test runners and supporting code
      + account                     Domain model directory
          AccountPage               Lean Page Object containing only locating strategy
          AccountPageActions        Action class containing only user actions on the page
          AccountPageQuestions      Question class containing only verifications & validations
    + resources
      + features                    Feature files directory
        + checkout                  Feature file subdirectories (Epics in test report)
          checkout_item.feature     Features containing BDD scenarios (Features in test report)
      + testdata                    Test data files 
      + webdriver                   Bundled webdriver binaries
        + linux
        + mac
        + windows
          chromedriver.exe          OS-specific Webdriver binaries
          geckodriver.exe
      Serenity.conf                 Configurations file

```
## Executing the tests
Run `mvn clean verify` from the command line.

All tests will by default run in parallel mode with each feature running in seperate browsers.

Note: 
For Mac users: Latest versions of chromedriver and geckodriver are included in the package and your system will need chrome version 78 or firefox version 69.03 to run the tests.

For Windows users: Latest versions of chromedriver and geckodriver are included in the package and your system will need chrome version 77 or firefox version 69.03 to run the tests.

For Linux users: This solution is not tested in Linux. Please update the driver/your browser if you end up having issues while executing the test. You can also run the tests in Zalenium docker grid which will handle all these dependencies automatically inside the docker container.


By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$  mvn verify -Dwebdriver.driver=firefox
```
The test results will be recorded here `target/site/serenity/index.html`.
Please run the below command from root directory to open the result after execution.
```bash
open target/site/serenity/index.html 
```
A sample completed test report is attached in the ```serenity-results/index.html``` directory
![Sample Result](https://user-images.githubusercontent.com/22020329/66681565-9aea4180-ec90-11e9-8a35-72b3f1a0b992.png)

Additional command line parameters can be passed for switching the application environment
```json
$ mvn clean verify -Denvironment=prod
```
To enable screenshots for each step during the tests, the following command line parameter can be passed. Screenshots are by default enabled only for test failures to improve execution speed
```json
$ mvn clean verify -Dserenity.take.screenshots=FOR_EACH_ACTION
```  
## Container based Zalenium grid parallel run
Parallel runs have been implemented with docker container using the Zalenium (https://opensource.zalando.com/zalenium/#try-it) which provides video recording,live preview and a dashboard for monitoring the tests.

This setup can be used when running tests in a CI system for distributed execution or even in local machine for painless execution without worrying about the latest browser drivers.
The container will take care of pulling the latest drivers for both selenium and firefox for test execution.

![Zalenium Dashboard](https://user-images.githubusercontent.com/22020329/66681390-4646c680-ec90-11e9-9dd9-8263a0621868.png)
 
 Your machine needs docker to be installed to run the tests with Zalenium. Once docker is installed. Please follow the below steps.
 
 - Pull Zelenium from dockerhub 
 ``` 
 docker pull dosel/zalenium
 ```
 - Run it 
 ```json
docker run --rm -ti --name zalenium -p 4444:4444 \
       -e PULL_SELENIUM_IMAGE=true \
       -v /var/run/docker.sock:/var/run/docker.sock \
       -v /tmp/videos:/home/seluser/videos \
       --privileged dosel/zalenium start
```
 - Once the Zalenium grid is up and running, run the test 
 ```
mvn verify -Dwebdriver.driver=remote -Dwebdriver.remote.url=http://localhost:4444/wd/hub
 ```    
 - Go to http://localhost:4444/grid/admin/live to see live stream of the tests running in chrome and firefox
 - Go to the Zalenium dashboard http://localhost:4444/dashboard/ to view the test video, logs and results
 - To stop the grid 
 ```
 docker stop zalenium
 ```
 
## Other Configurations configuration

All of the below mentioned test run configurations are configured in the `test/resources/serenity.conf` file.

### Webdriver configuration 
Configuration for running tests in local and other browser properties are defined here.

The project also bundles some of the WebDriver binaries that you need to run Selenium tests in the `src/test/resources/webdriver` directories.  

This configuration means that development machines and build servers do not need to have a particular version of the WebDriver drivers installed for the tests to run correctly.
```
drivers {
  windows {
    webdriver.chrome.driver = "src/test/resources/webdriver/windows/chromedriver.exe"
    webdriver.gecko.driver = "src/test/resources/webdriver/windows/geckodriver.exe"
  }
  mac {
    webdriver.chrome.driver = "src/test/resources/webdriver/mac/chromedriver"
    webdriver.gecko.driver = "src/test/resources/webdriver/mac/geckodriver"
  }
  linux {
    webdriver.chrome.driver = "src/test/resources/webdriver/linux/chromedriver"
    webdriver.gecko.driver = "src/test/resources/webdriver/linux/geckodriver"
  }
}
```
### Environment-specific configurations
Application's invidual environments are configured here, so that the tests can be run in different environments. 
Individual page path is also externalised for easier management of direct page navigations
```
environments {
  default {
    webdriver.base.url = "http://automationpractice.com/"
  }
  dev {
    webdriver.base.url = "http://dev.automationpractice.comm/"
  }
  staging {
    webdriver.base.url = "http://stg.automationpractice.com/"
  }
  prod {
    webdriver.base.url = "http://automationpractice.com/"
  }
  all {
    home.page = "#{webdriver.base.url}"
    signin.page = "#{webdriver.base.url}/index.php?controller=authentication&back=my-account"
  }
}
````
### Other Libraries 
- Java Faker - This library is used in the tests to generate random data to be passed to the application like user details
- Jackson - To read test data from yaml file and load it to DTO class
- Lombok - To reduce boilerplate code in DTO classes and increase readabilty
- Assertj - To assert the tests. Soft assertions are used where multiple assertions are present so that user can see all passing assertions along with the failed ones

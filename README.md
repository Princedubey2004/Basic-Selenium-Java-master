# Basic Selenium Java

This project is configured to run Selenium tests seamlessly using the latest Selenium Bindings. Created and maintained by **Prince Dubey**.

## Setup

Run these commands depending on your base OS.

### On Mac OS

Copy this bootstrap script and run it in a Terminal shell window:

```bash
sh -c "$(curl -fsSL https://raw.githubusercontent.com/PrinceDubey2004/Basic-Selenium-Java/master/mac-bootstrap.sh)"
```

It installs the following if it is not already installed:

1. Install Homebrew 
2. Install Caskroom 
3. If you dont have the Java Development Kit (JDK) it installs Java
4. Install Maven
5. Run `./mac_install_browsers.sh`

The script also runs the test.

### On Windows

1. Download the zip file or clone this repository.
2. Navigate to the unzipped folder within the file browser.
3. Right-Click on `windows_install.bat` and select `Run as Administrator`
4. Test the installation by running the following from a command window in the directory of this project

   `mvn test  -Dsurefire.suiteXmlFiles=windows-only.xml`

## Running Tests

To run the local browser tests (like Chrome):

```bash
mvn clean test
```

### From Intellij IDEA

There is a shared run configuration that has the maven target setup.

#### Safari Test (Mac)

Safari requires the following steps to enable Selenium Webdriver tests to run:

1. Open Safari Preferences
2. Go to the Advanced Tab
3. Check the box at the bottom "Show Develop menu in menu bar"
4. Click on the Develop menu 
5. Click on "Allow Remote Execution"

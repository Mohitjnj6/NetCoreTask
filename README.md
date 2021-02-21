# NetCoreTask
NetCoreTask is a Maven Project.  It is a Hybrid framework. I used  Page Object Model design pattern ,  java language  & TestNg tool for developing this framework. 
Here, all the dependencies are added through pom.xml.

Files: src/main/java folder have two packages:

package 1: com.netcore.commonUtilities have 
1.BaseClass: for choosing the browser, url etc., before running the script. 
2.FileUtils: utilities methods for accessing  properties file.
3.JavaUtils: utilities methods of java.
4.WebdriverUtils: utilities methods of webdriver.

package 2: com.netcore.objectRepository 1.FlipkartHomePage : It is a POM class and containing all the webelements and their getters methods.

src/test/java folder have one package:
package 1: com.netcore.testScripts have only one test Script named IphoneSearchTest.java in the form of java file. After running this script, it will create a csv file in test-output folder and writes a list of all iPhones with three columns named Device Details, Price & Ratings whose prices were lass then 40,000 during the search in the search page.

In testDate Folder: i have put common Data in properties file which contains "url" and "browser" values in the form of key-value format.  Apart from that, I also put "search" keyword which is required during the iPhone search, "priceLimit" that is 40000, and the path of csv file where it is going to store after running the script successfully. To avoid hard coding in my script,  I put these value here.

Apart from this, my project  have resources like chromedriver, geckodriver so that this script can be run on different browsers.

HTML Reports: after every execution, in test-output folder, there is html report which shows the status of the script is passed, failed or skipped.

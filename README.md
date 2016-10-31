# festselenium

This project developed on 2012, see https://code.google.com/archive/p/festselenium/ 

fest + selenium for applet automation testing

# Overview

In-browser applet testing can now be accomplished using festselenium in conjunction with Selenium RC. The purpose of this project is provide a java driver to commnuicate with Selenium then drive the fest-swing to do applet automation acceptance testing.

This project relies heavily on the GetEval provided by selenium.

Sample Code:

    // selenium setup 
    selenium = new DefaultJavaSelenium("localhost",4444, browserString , url); 
    selenium.start(); 
    selenium.open(url);
    
    //get the appletfixure to control fest JAppletFixture AppletFixture dialog = selenium.applet(LIST_APPLET_ID)
    
    //fest similar API for autmation testing dialog.comboBox("domain").select("Users"); dialog.textBox("username").enterText("alex.ruiz"); dialog.button("ok").click();

# History

There is a exsting .net test framework FEST-Selenium. But it: 

1. It's a .net framework and doesn't support java 
2. We still want the following syntax: dialog.comboBox("domain").select("Users"); dialog.textBox("username").enterText("alex.ruiz"); dialog.button("ok").click();

Notice:
------------
The component matcher in FEST-Swing relies on each control to have a name property specified (using the setName() method). We can't customize your own Component Matchers unless do you special work on applet server side.

Dependency
---------------

Selenium Server (formerly the Selenium RC Server) and Selenium Client Drivers
fest project

Trouble shooting reference
------------
the fest/Selenium project
Selenium RC
API doc

fest API
festselenium-1.0-javadoc

Compile and run
-----------------------

 1. download the source code from "Downloads" page "Source" page
Prepare the test resources. Download testapplet.zip, then unzip it and put it into web container. We hardcoded the test link is http://localhost:8080/applet.html. Please make sure it works fine
 2. Download Selenium Server (formerly the Selenium RC Server) and Selenium Client Drivers. then launch selenium server. java -jar selenium-server-standalone-2.25.0.jar
 3. use mvn compile/mvn test to compile and run the test If you use use eclipse, you need add selenium-server-standalone-xx.jar and /selenium-java-xx.jar into your CLASSPATH
 4. Use festselenium to do Applet test demo

1, The demo applet we want to verify:


    package com.nemo.festselenium.demo;
    
    import java.awt.event.AdjustmentEvent; import java.awt.event.AdjustmentListener;
    
    import javax.swing.*; import javax.swing.text.JTextComponent;
    
    public class DemoApplet extends JApplet implements AdjustmentListener{
    
    private static final long serialVersionUID = 1L;
    JScrollBar slider;      
    JTextComponent text;        
    JPanel panel;
    
    public void adjustmentValueChanged(AdjustmentEvent e) {
        text.setText(new Integer(slider.getValue()).toString());
    } 
    
    public DemoApplet(){
        slider = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 100);
        text = new JTextArea("0");
        panel = new JPanel();
        panel.add(text);
        panel.add(slider);
        add(panel);
        slider.addAdjustmentListener(this);
    }
    }



2, create a test fixture for this applet

    package com.nemo.festselenium.demo;
    
    import org.fest.swing.fixture.JAppletFixture;
    
    public class JTestFixture extends DemoApplet { JAppletFixture fixture;
    
    public JTestFixture() {
        super();
    
        setName("demo_applet");
        fixture=new JAppletFixture(this);
    }
      public JAppletFixture getTestFixture() {
          return fixture;
      }
    }

We need create a public function getTestFixture and call setName("demo_applet") in order festselenium can communicate with it.

3 create a test html with applet ID=demo_applet Test

Notes: this applet depends on fest-swing-1.2a3.jar,fest-assert-1.1.jar,fest-util-1.1.jar,fest-reflect-1.2-SNAPSHOT.jar, you can download it from fest project

4, create the unit test cases

    package com.nemo.festselenium.demo;
    
    import static org.junit.Assert.*;
    
    import org.junit.; import com.nemo.festselenium.fixture.; import com.nemo.festselenium.selenium.*;
    
    public class DemoTest { DefaultJavaSelenium selenium;
    
    @Before
    public void setUp() {
        selenium = new DefaultJavaSelenium("localhost",4444, "*iexplore" , "http://localhost:8080");        
    }
    
    @After
    public void tearDown() {
        selenium.stop();
    }
    @Test
    public void test() {
    
        selenium.start();
        selenium.open("demo_applet.html");
        selenium.windowMaximize();
        AppletFixture fixture = selenium.applet("demo_applet");
        ScrollBarFixture scrollbar = fixture.scrollBar();
        TextComponentFixture text = fixture.textBox();
        scrollbar.scrollUnitUp();
        assertEquals(text.text(), "1");     
    }   
    } 

Note: The unit test depends on festselenium-1.0.jar, selenium-server-standalone-2.25.0.jar and selenium-java-2.25.0.jar . the last two jar can be download from selenium offical site

5, selenium request when run this test case

``` 15:19:56.179 INFO - Command request: getNewBrowserSession[*iexplore, http://loca 15:20:04.659 INFO - Command request: open[demo_applet.html, ] on session a84fc32 15:20:08.223 INFO - Command request: windowMaximize[, ] on session a84fc3216d6c4 1f1865ab7a710189814 15:20:08.847 INFO - Command request: getEval[navigator.userAgent, ] on session a 84fc3216d6c41f1865ab7a710189814 15:20:09.378 INFO - Command request: getEval[window.document.getElementById("dem o_applet").getTestFixture().scrollBar().scrollUnitUp(), ] on session a84fc3216d6 c41f1865ab7a710189814 15:20:10.205 INFO - Command request: getEval[window.document.getElementById("dem o_applet").getTestFixture().textBox().text(), ] on session a84fc3216d6c41f1865ab 7a710189814

```

Project Information

The project was created on Dec 30, 2012.


package org.example;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TestNG testNG = new TestNG();
        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setSuiteFiles(asList("src/main/resources/testNg.xml"));

        List<XmlSuite> suiteList = new ArrayList<>();

        suiteList.add(xmlSuite);
        testNG.setXmlSuites(suiteList);
        System.out.println("Запустились из Runner1");
        testNG.run();
        System.out.println("Запустились из Runner2");
    }
}
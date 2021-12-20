package TestSuites;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import CentaJava.Core.Datasources;
import CentaJava.Core.DriverManager;
import CentaJava.Core.Reports;

import org.junit.jupiter.api.Tag;

import TestCases.TestCasasco1;
import TestCases.TestCasasco2;
import TestCases.TestCasasco3;
import TestCases.TestCasasco4;
import TestCases.TestCasasco5;
import TestCases.TestCasasco6;

public class Example_TestTypeFullTest 
{
	static 
	
	//Init
	DriverManager DM;
	static Datasources data;
	static Reports report;
	
	@BeforeAll
    static void initAll() {
    	//DriverManager
    	DM = new DriverManager();
    	//DataSource
    	data = new Datasources();
		//Reports
		report = new Reports();
    }
 
    @BeforeEach
    void init() {
    }

    
    
    @Test
    @Tag("Smoke")
    @Tag("TestCasasco1")
    @Tag("TestSuite1")
    void TC1() {
    	//DEFINITIONS
    	TestCasasco1 tc1 = new TestCasasco1();
    	boolean result;

    	//SET INDIVIDUAL DATASOURCE
		data.setDataSourceType(data.CsvType);
		data.setDataSourceFile("testcase1.csv");
		String name = "PRUEBA1";
		
		for(int x=0;x<data.getTotalIterations();x++) {
			//SET THE EXECUTION PLAN
			result = tc1.Test(data,report,DM,x,name+"_Iteracion_"+x);
			report.addTestCaseToGeneralReport(result, name+"_Iteracion_"+x, "");
			report.saveTestCaseReport(name+"_Iteracion_"+x);
		}
    }
 

    @Test
    @Tag("Smoke")
    @Tag("TestCasasco2")
    @Tag("TestSuite1")
    void TC2() {
    	//DEFINITIONS
    	TestCasasco2 tc2 = new TestCasasco2();
    	boolean result;

    	//SET INDIVIDUAL DATASOURCE
		data.setDataSourceType(data.CsvType);
		data.setDataSourceFile("testcase1.csv");
		String name = "PRUEBA2";
		
		for(int x=0;x<data.getTotalIterations();x++) {
			//SET THE EXECUTION PLAN
			result = tc2.Test(data,report,DM,x,name+"_Iteracion_"+x);
			report.addTestCaseToGeneralReport(result, name+"_Iteracion_"+x, "");
			report.saveTestCaseReport(name+"_Iteracion_"+x);
		}
    }
    
    @Test
    @Tag("Smoke")
    @Tag("TestCasasco3")
    @Tag("TestSuite1")
    void TC3() {
    	//DEFINITIONS
    	TestCasasco3 tc3 = new TestCasasco3();
    	boolean result;

    	//SET INDIVIDUAL DATASOURCE
		data.setDataSourceType(data.CsvType);
		data.setDataSourceFile("testcase1.csv");
		String name = "PRUEBA3";
		
		for(int x=0;x<data.getTotalIterations();x++) {
			//SET THE EXECUTION PLAN
			result = tc3.Test(data,report,DM,x,name+"_Iteracion_"+x);
			report.addTestCaseToGeneralReport(result, name+"_Iteracion_"+x, "");
			report.saveTestCaseReport(name+"_Iteracion_"+x);
		}
    }
    
    @Test
    @Tag("Smoke")
    @Tag("TestCasasco4")
    @Tag("TestSuite1")
    void TC4() {
    	//DEFINITIONS
    	TestCasasco4 tc4 = new TestCasasco4();
    	boolean result;

    	//SET INDIVIDUAL DATASOURCE
		data.setDataSourceType(data.CsvType);
		data.setDataSourceFile("testcase1.csv");
		String name = "PRUEBA4";
		String ocasion = "";
		for(int x=0;x<data.getTotalIterations();x++) {
			//SET THE EXECUTION PLAN
			result = tc4.Test(data,report,DM,x,name+"_Iteracion_"+x,ocasion);
			report.addTestCaseToGeneralReport(result, name+"_Iteracion_"+x, "");
			report.saveTestCaseReport(name+"_Iteracion_"+x);
		}
    }
    
    @Test
    @Tag("Smoke")
    @Tag("TestCasasco5")
    @Tag("TestSuite1")
    void TC5() {
    	//DEFINITIONS
    	TestCasasco5 tc5 = new TestCasasco5();
    	boolean result;

    	//SET INDIVIDUAL DATASOURCE
		data.setDataSourceType(data.CsvType);
		data.setDataSourceFile("testcase1.csv");
		String name = "PRUEBA5";
		String ocasion = "";
		for(int x=0;x<data.getTotalIterations();x++) {
			//SET THE EXECUTION PLAN
			result = tc5.Test(data,report,DM,x,name+"_Iteracion_"+x,ocasion);
			report.addTestCaseToGeneralReport(result, name+"_Iteracion_"+x, "");
			report.saveTestCaseReport(name+"_Iteracion_"+x);
		}
    }
    
    @Test
    @Tag("Smoke")
    @Tag("TestCasasco6")
    @Tag("TestSuite1")
    void TC6() {
    	//DEFINITIONS
    	TestCasasco6 tc6 = new TestCasasco6();
    	boolean result;

    	//SET INDIVIDUAL DATASOURCE
		data.setDataSourceType(data.CsvType);
		data.setDataSourceFile("testcase1.csv");
		String name = "PRUEBA6";
		
		for(int x=0;x<data.getTotalIterations();x++) {
			//SET THE EXECUTION PLAN
			result = tc6.Test(data,report,DM,x,name+"_Iteracion_"+x);
			report.addTestCaseToGeneralReport(result, name+"_Iteracion_"+x, "");
			report.saveTestCaseReport(name+"_Iteracion_"+x);
		}
    }
    
    
    @AfterEach
    void tearDown() {
    	
    }
 
    @AfterAll
    static void tearDownAll() {
    	System.out.println("Execution finished");
        report.saveGeneralReport();   
    }

}


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
 
    
    
    @AfterEach
    void tearDown() {
    	
    }
 
    @AfterAll
    static void tearDownAll() {
    	System.out.println("Execution finished");
        report.saveGeneralReport();   
    }

}


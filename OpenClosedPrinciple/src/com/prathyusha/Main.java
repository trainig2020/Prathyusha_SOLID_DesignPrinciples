package com.prathyusha;

public class Main {
	
	public static void main(String[] args) {
		
		ReportingService rs=new ReportingService();
 
		//Generate PDF report
		ReportingStrategy pdf=new PDFReportingStrategy();
		rs.generateReportBasedOnStrategy(pdf);
 
		//Generate XML report
		ReportingStrategy xml=new XMLReportingStrategy();
		rs.generateReportBasedOnStrategy(xml);
		
		//Generate Excel report
		ReportingStrategy excel=new ExcelReportingStrategy();
	    rs.generateReportBasedOnStrategy(excel);
		 
		
	}

}

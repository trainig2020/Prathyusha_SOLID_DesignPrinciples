package com.prathyusha;

public  class ReportingService {
	
	public void generateReportBasedOnStrategy(ReportingStrategy reportingStrategy)
	{
		
		System.out.println("Generating report based on Strategy");
		System.out.println("===================================");
		
		reportingStrategy.generateReport();
		System.out.println();
	}

}

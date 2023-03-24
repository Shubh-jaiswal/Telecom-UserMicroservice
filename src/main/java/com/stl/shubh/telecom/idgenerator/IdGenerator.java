package com.stl.shubh.telecom.idgenerator;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class IdGenerator {
	
	public String companyCode(){
		return "mrx";
	}
	
	public String companyBroadbandCode(){
		return companyCode()+"bb";
	}
	
	public String companyPlanCode(){
		return companyCode()+"rp";
	}
	
	public String broadbandId() {
		Random random= new Random();
		String b = "";
		for(int i=0;i<10;i++) {
			b=b+random.nextInt(10);
		}
		String bb= companyBroadbandCode()+b;
		return bb;
		
	}
	
	public String broadbandKeyGenerator() {
		Random random= new Random();
		String bk = "";
		for(int i=0;i<5;i++) {
			bk=bk+random.nextInt(10);
		}
		String bkg= companyBroadbandCode()+bk;
		return bkg;
		
	}
		
	public String planId() {
		Random random= new Random();
		String p = "";
		for(int i=0;i<10;i++) {
			p=p+random.nextInt(10);
		}
		String rp= companyPlanCode()+p;
		return rp;
		
		
	}
	
	public String planKeyGenerator() {
		Random random= new Random();
		String pk = "";
		for(int i=0;i<5;i++) {
			pk=pk+random.nextInt(10);
		}
		String rpkg= companyPlanCode()+pk;
		return rpkg;
		
		
	}

	


}

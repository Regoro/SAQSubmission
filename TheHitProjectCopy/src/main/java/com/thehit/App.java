package com.thehit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thehit.domain.AudienceImpl;
import com.thehit.domain.CollectionsExample;
import com.thehit.domain.Song;
import com.thehit.domain.SongWriterImpl;
import com.thehit.domain.Stage;
import com.thehit.domain.Ticket;
import com.thehit.interfaces.Currency;
import com.thehit.interfaces.Songwriter;

public class App {
	
	private static ApplicationContext autoWirecontext;
	private static ApplicationContext context;	
	public static void main (String args[]){
		
	context=new ClassPathXmlApplicationContext
                ("configuration.xml"); 
	
	   autoWirecontext=new ClassPathXmlApplicationContext
               ("autoWireConfiguration.xml");
	   
	AudienceImpl AudienceImplAutoWire=(AudienceImpl)autoWirecontext.getBean("autoWireTicketByTypes");
    System.out.println("Song writer firstname is: "+ AudienceImplAutoWire.getFirstname());
    System.out.println("Song writer lastname is: "+ AudienceImplAutoWire.getLastname());
    System.out.println("Song writer Ticket is: "+ AudienceImplAutoWire.getTicket());
    
//    AudienceImpl AudienceImplAutoWireCon=(AudienceImpl)autoWirecontext.getBean("autoWireTicketByName");
//    System.out.println("Song writer firstname is: "+ AudienceImplAutoWireCon.getFirstname());
//    System.out.println("Song writer lastname is: "+ AudienceImplAutoWireCon.getLastname());
//    System.out.println("Song writer Ticket is: "+ AudienceImplAutoWire.getTicket());
	}
  } 
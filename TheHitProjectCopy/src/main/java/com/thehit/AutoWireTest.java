package com.thehit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thehit.domain.SingerImpl;
import com.thehit.domain.SongWriterImpl;

public class AutoWireTest {

	
	
	private static ApplicationContext autoWirecontext;
    public static void main( String[] args )
    {
    	
            
    autoWirecontext=new ClassPathXmlApplicationContext
                ("autoWireConfiguration.xml");
                
    SongWriterImpl songWriterAutoWire=(SongWriterImpl)autoWirecontext.getBean("autoWireExampleBean");
    System.out.println("Song writer firstname is: "+ songWriterAutoWire.getFirstname());
    System.out.println("Song writer lastname is: "+ songWriterAutoWire.getLastname());
    System.out.println("Song writer age is: "+ songWriterAutoWire.getAge());
   System.out.println("Song writer song name is: "+ songWriterAutoWire.getSong().getName()+ 
   " lyrics: "+songWriterAutoWire.getSong().getLyrics());  
   SongWriterImpl autoWirebyConstructor=(SongWriterImpl)autoWirecontext.getBean("autoWireExampleConstructorBean");
   System.out.println("Song writer firstname is: "+ autoWirebyConstructor.getFirstname());
   System.out.println("Song writer lastname is: "+ autoWirebyConstructor.getLastname());
   System.out.println("Song writer age is: "+ autoWirebyConstructor.getAge());
   System.out.println("Song writer song name is: "+ autoWirebyConstructor.getSong().getName()+ " lyrics: "+autoWirebyConstructor.getSong().getLyrics());      
                                                               
   
}
}

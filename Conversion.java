
public class Conversion {
	
	
	
	// Methode contient le nombre a convertir et chaine de deppart chaine de fin.... 
	
	
	
	public Double masse(double dep ,String de,String arriver) {
		if(de.equals("G")) {
			switch(arriver) 
	        { 
	            case "G": 
	                return dep; 
	                 
	            case "Kg": 
	                return dep/1000;
	            case "Mg": 
	                 return dep*1000;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		if(de.equals("Kg")) {
			switch(arriver) 
	        { 
	            case "G": 
	                return dep*1000; 
	                 
	            case "Kg": 
	                return dep;
	            case "Mg": 
	                 return dep*1000000;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		if(de.equals("Mg")) {
			switch(arriver) 
	        { 
	            case "G": 
	                return dep/1000; 
	                 
	            case "Kg": 
	                return dep/1000000;
	            case "Mg": 
	                 return dep;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		
		
		
		return (double) 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	public Double Longeur(double dep ,String de,String arriver) {
		if(de.equals("M")) {
			switch(arriver) 
	        { 
	            case "M": 
	                return dep; 
	                 
	            case "Km": 
	                return dep/1000;
	            case "Cm": 
	                 return dep*1000;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		if(de.equals("Km")) {
			switch(arriver) 
	        { 
	            case "M": 
	                return dep*1000; 
	                 
	            case "Km": 
	                return dep;
	            case "Cm": 
	                 return dep*1000000;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		if(de.equals("Cm")) {
			switch(arriver) 
	        { 
	            case "M": 
	                return dep/1000; 
	                 
	            case "Km": 
	                return dep/1000000;
	            case "Cm": 
	                 return dep;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		
		
		
		return (double) 0;
		
	}
	
	
	
	
	
	
	
	
	public Double tmp(double dep ,String de,String arriver) {
		if(de.equals("Celisius")) {
			switch(arriver) 
	        { 
	            case "Fahrenheit": 
	                return (9/5)*dep+32; 
	                 
	            case "Kelvin": 
	                return dep+273.15;
	            case "Celisius": 
	                 return dep;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		if(de.equals("Kelvin")) {
			switch(arriver) 
	        { 
	            case "Fahrenheit": 
	                return 1.8*(dep-274.15)+273.15; 
	                 
	            case "Kelvin": 
	                return dep;
	            case "Celisius": 
	                 return dep-273.15;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
	 
		if(de.equals("Fahrenheit")) {
			switch(arriver) 
	        { 
	            case "Fahrenheit": 
	             return dep;
	                 
	            case "Kelvin": 
	            	   return ((dep-32)/18)*273.15; 
	            case "Celisius": 
	                 return (dep-32)/1.8;
	            default: 
	                System.out.println("erreur 404"); 
	        } 
			 
		}
		
		
		
		
		return (double) 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package fam;

import java.util.Scanner; 



public class Main
{
    
	public static void main(String[] args) {
	
		String nome;
		 int idade,resposta,porcetagem2,contato,resultado,zero;
		 int porcetagem,porcetagem3,porcetagem4,porcetagem5,porcetagem6,porcetagem7,porcetagem8,porcetagem9,porcetagem10;
		 
		 
		porcetagem=10;
		porcetagem2=10;
		porcetagem3=10;
		porcetagem4=10;
		porcetagem5=10;
		porcetagem6=10;
		porcetagem7=10;
		porcetagem8=10;
		porcetagem9=10;
		porcetagem10=10;
		resultado=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome ?");
		nome=entrada.nextLine();
		
		System.out.println("Qual sua idade "+nome+":");
		idade=entrada.nextInt();
		
		if(idade>=60){
	    System.out.println(nome+" Voc� pertence ao grupo de risco");
	    System.out.println("");
	    System.out.println("ter cuidados como lavar bem as m�os podem salvar a sua vida e a do proximo");
	    
		}
        System.out.print("");
	    System.out.println(nome+" A seguintes perguntas devem ser respondidas com 1-para sim e 2-para n�o");
	    System.out.println("");
	    System.out.println(nome+" Deseja iniciar o teste 1-para sim 2-para n�o");
	    resposta=entrada.nextInt();
	    if(resposta<1 || resposta>2){
	       System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	       while(resposta<1 || resposta>2){
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	       }
	        
	    }
	    if(resposta==1){ //inicio do teste
	    System.out.println("              Teste iniciado ");
	    System.out.println("");
	    System.out.println("Lembre-se: Este teste n�o subtitui o teste realizados por profissionais da �rea da sa�de.");
	    System.out.println("");
	       
	       
	       //primeira pergunta
	        System.out.println(nome+" Voc� teve contato com alguma pessoa que testou positivo para covid?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){//inicio do if
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	               
	       while(resposta<1 || resposta>2){//inicio do while
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	            if(resposta==1){//if2 inicio
	             porcetagem2=+10;    
	                contato=1;     
	                }//fim do if 2
	                
	           
	       }//fim do while
	       }//fim do if
	       if(resposta==2){//if se a respota for 2
	           porcetagem2=+0;
	   }//fim do if 2
	    
	       
	            
	            
	            
	            
	            
	            
	            
	    //pergunta 2
	   System.out.println(nome+" Voc� esta com tosse?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){//inicio if 
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	       while(resposta<1 || resposta>2){//inicio while
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	                if(resposta==1){//if2
	               
	                porcetagem3=+10;
	               contato=1; 
	               
	                }//fim do if2
	       }//fim do while
	           }//fim do if
	       if(resposta==2){
	           porcetagem3=+0;
	               
	   }
	    
	    
	    
	
	
	
	
	
	
	//pergunta 3
	System.out.println(nome+" esta sentido falta de ar?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	       while(resposta<1 || resposta>2){
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	                if(resposta==1){
	                porcetagem4=+10;    
	               contato=1;     
	                }
	                
	       }
	       
	           }
	       if(resposta==2){
	           porcetagem4=+0;
	               
	   }
	
	


//pergunta 4
	System.out.println(nome+" esta com alguma dor muscular?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	       while(resposta<1 || resposta>2){
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	                if(resposta==1){
	                porcetagem5=+10;    
	               contato=1;     
	                }
	                
	       }
	       
	           }
	       if(resposta==2){
	           porcetagem5=+0;
	               
	   }
	   
	   
	   
	   
	   
	   //pergunta 5
	   	System.out.println(nome+" esta com dor de cabe�a?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	       while(resposta<1 || resposta>2){
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	                if(resposta==1){
	                porcetagem6=+10;    
	               contato=1;     
	                }
	                
	       }
	       
	           }
	       if(resposta==2){
	           porcetagem6=+0;
	               
	   }

	
	
	System.out.println("ATEN��O: Use alcool gel e higienize objetos pessoais sempre que sair.");
    System.out.println("");
    //pergunta 6
	System.out.println(nome+" teve nauseas ou vomito ?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	       while(resposta<1 || resposta>2){
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	                if(resposta==1){
	                porcetagem7=+10;    
	               contato=1;     
	                
	    
	                    
	                    
	                }
	                
	       }
	       
	           }
	       if(resposta==2){
	           porcetagem7=+0;
	               
	   }
	  
	   	       //ergunta 8
	        System.out.println(nome+" Voc� com dor de garganta ?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){//inicio do if
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	               
	       while(resposta<1 || resposta>2){//inicio do while
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	            if(resposta==1){//if2 inicio
	             porcetagem8=+10;    
	                contato=1;     
	                }//fim do if 2
	                
	           
	       }//fim do while
	       }//fim do if
	       if(resposta==2){//if se a respota for 2
	           porcetagem8=+0;
	   }//fim do if 2
	   
	   	       // pergunta 9
	        System.out.println(nome+" Voc� esta com dor no peito?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){//inicio do if
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	               
	       while(resposta<1 || resposta>2){//inicio do while
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	            if(resposta==1){//if2 inicio
	             porcetagem9=+10;    
	                contato=1;     
	                }//fim do if 2
	                
	           
	       }//fim do while
	       }//fim do if
	       if(resposta==2){//if se a respota for 2
	           porcetagem9=+0;
	   }//fim do if 2
	   
	   
	   
	   	       // pergunta 10
	        System.out.println(nome+" Voc� teve diarreia ?");
	        resposta=entrada.nextInt();
	           if(resposta<1 || resposta>2){//inicio do if
	               System.out.println(nome+" voc� digitou uma respota invalida !!!"); 
	               
	       while(resposta<1 || resposta>2){//inicio do while
	           System.out.println(nome+" voc� digitou uma respota invalida !!!");
	           System.out.println(nome+" responda 1-para sim 2-para n�o");
	           resposta=entrada.nextInt();
	            if(resposta==1){//if2 inicio
	             porcetagem10=+10;    
	                contato=1;     
	                }//fim do if 2
	                
	           
	       }//fim do while
	       }//fim do if
	       if(resposta==2){//if se a respota for 2
	           porcetagem10=+0;
	   }//fim do if 2
	   
	   
	   
	   
	   
	    System.out.println("");
        System.out.println("ATEN��O: Pessoas assintom�ticas podem SIM transmitir o v�rus");
        System.out.println("");
        System.out.println("ATEN��O: Se h� suspeitas de cont�gio, procure um m�dico imediatamente");
	   
	   System.out.print(nome+" seu diagnostico "+(porcetagem+porcetagem2+porcetagem3+porcetagem4+porcetagem5+porcetagem6+porcetagem7+porcetagem8+porcetagem9+porcetagem10)+"% dos sintomas ");
	   
	   System.out.println("");
       System.out.println("Se deseja ver a lista de sintomas aperte 0");	   
	   zero=entrada.nextInt();
	    if(zero==0){
	        System.out.println("Febre (83%)");
	        System.out.println("Tosse (82%)");
	        System.out.println("Falta de ar (31%)");
	       System.out.println("Dor muscular (11%)"); 
	       System.out.println("Confus�o (9%)"); 
	        System.out.println("Dor de cabe�a (8%)");
	        System.out.println("Dor de garganta (5%)"); 
	         System.out.println("Dor no peito (2%)");
	         System.out.println("Diarreia (2%)");
	         System.out.println("N�usea e v�mito (1%)");
	     
	      System.out.println("sintomas graves:");
	     System.out.println("Dificuldade respirat�ria ou falta de ar");
	       System.out.println("Press�o ou dor no peito");
	       System.out.println("perda de fala ou capacidade motora ");
	    }
	    }
	    
	    
	    
	    }
}



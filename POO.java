package Atividades;

public class POO {

	public  static  void  principal ( String [] args ) {
		public  class  Funcionário {

			private  String  funcionarioContratar ;
		    private  String  setorAtuacao ;
		    privado  int  horasMensais ;
		    private  String  salario ;
		    
		    // método construtor

			public  Funcionario ( String  funcionarioContratar , String  setorAtuacao , int  horasMensais , String  salario ) {
				isso . funcionarioContratar = funcionarioContratar ;
				isso . setorAtuacao = setorAtuacao ;
				isso . horasMensais = horasMensais ;
				isso . salario = salario ;
			}


			public  String  getFuncionarioContratar () {
				return  funcionarioContratar ;
			}


			public  void  setFuncionarioContratar ( String  funcionarioContratar ) {
				isso . funcionarioContratar = funcionarioContratar ;
			}


			public  String  getSetorAtuacao () {
				voltar  setorAtuacao ;
			}


			public  void  setSetorAtuacao ( String  setorAtuacao ) {
				isso . setorAtuacao = setorAtuacao ;
			}


			public  int  getHorasMensais () {
				voltar  horasMensais ;
			}


			public  void  setHorasMensais ( int  horasMensais ) {
				isso . horasMensais = horasMensais ;
			}


			public  String  getSalário () {
				devolver  salario ;
			}


			public  void  setSalário ( String  salario ) {
				isso . salario = salario ;
			}
		    
			public  void  imprimirInfo () {
			
				  Sistema . fora . println ( "\nNome: " + funcionarioContratar + " Profissão: " + setorAtuacao + " Horas trabahadas: " + horasMensais +   " horas Salário: " + salario + "" );
			}
		}
		
			Funcionário  contratado = novo  Funcionário ( "Kathllyn Leticia Santos" , "Desenvolvedora Full Stack Java Jr" , 42 , "6900" );
			contratado . imprimirInfo ();
			
			Sistema . fora . println ( "\nFuncionaria Promovida" );
			
			
			Sistema . fora . println ( "\nVaga da promoção" );
			contratado . setSetorAtuacao ( "Desenvolvedora Full Stack Pleno" );
			//contratado.imprimirInfo();
			Sistema . fora . println ( contratado . getSetorAtuacao ());
					
			Sistema . fora . println ( "\nAlteração Salario " );
			Sistema . fora . println ();
			contratado . setSalario ( "10.000" );
			//contratado.imprimirInfo();
			Sistema . fora . println ( "Para:R$ " + contratado . getSalario ());
			
			contratado . imprimirInfo ();
		}
	
}
	 jogos de classe  pública {
	
	Private  String  Manutencao ;
	 Console de String  privado ;
	 jogo de cordas  privado ;
	 controle de string  privado ;
	Private  String  Vendedor ;
	 String  privada Cliente ;
	



	Public  Games ( String  manutencao , String  console , String  jogo , String  controle , String  vendedor ) {
		super ();
		Manutencao = manutencao ;
		Consola = consola ;
		Jogo = jogo ;
		Controle = controle ;
		Vendedor = vendedor ;
		
	}




	public  String  getManutencao () {
		voltar  Manutencao ;
	}




	public  void  setManutencao ( String  manutencao ) {
		Manutencao = manutencao ;
	}




	public  String  getConsole () {
		retornar  Console ;
	}




	public  void  setConsole ( String  console ) {
		Consola = consola ;
	}




	public  String  getJogo () {
		voltar  Jogo ;
	}




	public  void  setJogo ( String  jogo ) {
		Jogo = jogo ;
	}




	public  String  getControle () {
		retornar  Controle ;
	}




	public  void  setControle ( String  controle ) {
		Controle = controle ;
	}




	public  String  getVendedor () {
		devolver  Vendedor ;
	}




	public  void  setVendedor ( String  vendedor ) {
		Vendedor = vendedor ;
	}




	public  String  getCliente () {
		retornar  Cliente ;
	}






	public  void  imprimirInfo () {
		
		  Sistema . fora . println ( "\n\t\t\t\t Comprando um " + Console + " você ganha um " + Controle + " e fazendo\n\t " + Manutencao + " mensal você ganha um jogo" + Jogo + ". Venha conferir mais informações com a nossa vendedora " + Vendedor + "." );
		  
	}
	


	{
		Games  loja = new  Games ( "matutenção " , "Xbox S " , " Assassins Creed" , "controle" , "Mariana" );
		loja . imprimirInfo ();
			
		
		
		Sistema . fora . println ( "\nPromoções!!!" );
		
		Sistema . fora . println ( "\nConsoles:" );
		loja . setConsole ( "Xbox S e Ps5" );
		Sistema . fora . println ( loja.getConsole ( ) ) ;
		
		Sistema . fora . println ( "\nControles:" );
		loja . setControle ( "Original e Paralelo" );
		Sistema . fora . println ( loja.getControle ( )) ;
		
		Sistema . fora . println ( "\nJogos:" );
		loja . setJogo ( "Minecraft, Mortal Kombat 11, The King of Fighters e The Last of us." );
		Sistema . fora . println ( loja.getJogo ( ) ) ;
		
		Sistema . fora . println ( "\nFale com a melhor vendedora" );
		loja . setVendedor ( "\tMariana" );
		Sistema . fora . println ( loja.getVendedor ( ) ) ;
}

}
-------------------------------------------------------------------------------------------------------
private  String  funcionarioContratar ;
private  String  setorAtuacao ;
privado  int  horasMensais ;
private  String  salario ;

// método construtor

public  Funcionario ( String  funcionarioContratar , String  setorAtuacao , int  horasMensais , String  salario ) {
	isso . funcionarioContratar = funcionarioContratar ;
	isso . setorAtuacao = setorAtuacao ;
	isso . horasMensais = horasMensais ;
	isso . salario = salario ;
}


public  String  getFuncionarioContratar () {
	return  funcionarioContratar ;
}


public  void  setFuncionarioContratar ( String  funcionarioContratar ) {
	isso . funcionarioContratar = funcionarioContratar ;
}


public  String  getSetorAtuacao () {
	voltar  setorAtuacao ;
}


public  void  setSetorAtuacao ( String  setorAtuacao ) {
	isso . setorAtuacao = setorAtuacao ;
}


public  int  getHorasMensais () {
	voltar  horasMensais ;
}


public  void  setHorasMensais ( int  horasMensais ) {
	isso . horasMensais = horasMensais ;
}


public  String  getSalário () {
	devolver  salario ;
}


public  void  setSalário ( String  salario ) {
	isso . salario = salario ;
}

public  void  imprimirInfo () {

	  Sistema . fora . println ( "\nNome: " + funcionarioContratar + " Profissão: " + setorAtuacao + " Horas trabahadas: " + horasMensais +   " horas Salário: " + salario + "" );
}

}
}
}
---------------------------------------------------------------------------------------------------

public  static  void  principal ( String [] args ) {
	
					
	Funcionário  contratado = novo  Funcionário ( "Kathllyn Leticia Santos" , "Desenvolvedora Full Stack Java Jr" , 42 , "6900" );
	contratado . imprimirInfo ();
	
	Sistema . fora . println ( "\nFuncionaria Promovida" );
	
	
	Sistema . fora . println ( "\nVaga da promoção" );
	contratado . setSetorAtuacao ( "Desenvolvedora Full Stack Pleno" );
	//contratado.imprimirInfo();
	Sistema . fora . println ( contratado . getSetorAtuacao ());
			
	Sistema . fora . println ( "\nAlteração Salario " );
	Sistema . fora . println ();
	contratado . setSalario ( "10.000" );
	//contratado.imprimirInfo();
	Sistema . fora . println ( "Para:R$ " + contratado . getSalario ());
	
	contratado . imprimirInfo ();

}

}
-------------------------------------------------------------------------------------------------


Private  String  Manutencao ;
 Console de String  privado ;
 jogo de cordas  privado ;
 controle de string  privado ;
Private  String  Vendedor ;
 String  privada Cliente ;




Public  Games ( String  manutencao , String  console , String  jogo , String  controle , String  vendedor ) {
	super ();
	Manutencao = manutencao ;
	Consola = consola ;
	Jogo = jogo ;
	Controle = controle ;
	Vendedor = vendedor ;
	
}




public  String  getManutencao () {
	voltar  Manutencao ;
}




public  void  setManutencao ( String  manutencao ) {
	Manutencao = manutencao ;
}




public  String  getConsole () {
	retornar  Console ;
}




public  void  setConsole ( String  console ) {
	Consola = consola ;
}




public  String  getJogo () {
	voltar  Jogo ;
}




public  void  setJogo ( String  jogo ) {
	Jogo = jogo ;
}




public  String  getControle () {
	retornar  Controle ;
}




public  void  setControle ( String  controle ) {
	Controle = controle ;
}




public  String  getVendedor () {
	devolver  Vendedor ;
}




public  void  setVendedor ( String  vendedor ) {
	Vendedor = vendedor ;
}




public  String  getCliente () {
	retornar  Cliente ;
}






public  void  imprimirInfo () {
	
	  Sistema . fora . println ( "\n\t\t\t\t Comprando um " + Console + " você ganha um " + Controle + " e fazendo\n\t " + Manutencao + " mensal você ganha um jogo" + Jogo + ". Venha conferir mais informações com a nossa vendedora " + Vendedor + "." );
	  
	

}
}

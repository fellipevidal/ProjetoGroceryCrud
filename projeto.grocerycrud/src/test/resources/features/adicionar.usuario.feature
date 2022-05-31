#language:pt

@AdicionarUsuario
Funcionalidade: Adicionar usuario
	Como usuario quero adicinar um novo usuario para ter acesso ao sistema
	
	@testePositivo
	Cenario: Adicionar um novo usuario
		Dado que esteja com bootstrap v4 
		E acione add customer
		Quando salvar o formulario
		Entao validamos mensagem de sucesso
	
	
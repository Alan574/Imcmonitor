class testeSimples{

public void executar() {
  
  Atleta atleta = new Atleta();
  atleta.setNome("Alan vitoriano");
  atleta.setIdade(24);

  System.out.println("Nome =" + atleta.getNome());
  System.out.println("Idade = " + atleta.getIdade()); 
}
}
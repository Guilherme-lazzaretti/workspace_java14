/* o que � uma interface?
 * uma interface � uma "especifica��o" de servi�os
 * ou seja, um conjunto de cl�usulas contratuais, nas quais uma classe 
 * se compromete a implementar l�gica?
 * Ok, qual a diferen�a para Classes Abstratas?
 * 	em interfaces, n�o temos atributos, portanto, o uso de interfaces est�
 * mais relacionado a classes de servi�os (classes que s� tem m�todos/funcionalidades),
 * e n�o s�o associadas a tipos de dados).
 * 
 */
public interface InterfaceBD {
	public void conectar(String banco, String user, String senha);
	public void executar(String comando);
	public void desconectar(String banco);
}

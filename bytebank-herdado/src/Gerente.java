// Gerente herda da class Funcionario, pois ele e um funcionario
public class Gerente extends Funcionario {
	
	
	private int senha = 0;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

}

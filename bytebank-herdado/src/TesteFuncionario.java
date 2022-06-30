
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario vinicius = new Funcionario();
		vinicius.setNome("Vinicius Gomes");
		vinicius.setCpf("463646948-88");
		vinicius.setSalario(3000);

		System.out.println(vinicius.getNome());
		System.out.println(vinicius.getBonificacao());
		
		
	}

}

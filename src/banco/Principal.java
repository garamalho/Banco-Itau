
package banco;


public class Principal {

    public static void main(String[] args) {
        Banco bradesco = new Banco();
        Funcionario Ale = new Funcionario();
        Cliente Boi = new Cliente();
        bradesco.setNome("Bradesco");
        bradesco.setCodBanco(1209);
        bradesco.setCliente(Boi);
        bradesco.setFuncionario(Ale);
        Ale.setNome("Ale");
        Ale.setIdade(21);
        Ale.setCpf("190123987");
        Ale.setSetor("Caixa");
        Ale.setCodFuncionario(12323);
        Ale.setBanco(bradesco);
        Boi.setNome("Jorge");
        Boi.setCpf("22198712987");
        Boi.setIdade(16);
        Boi.setCredito(200.0);
        Boi.setCodCliente(23214);
        Boi.setBanco(bradesco);
        
        System.out.println(Boi.getNome());
        System.out.println(Boi.getIdade());
        System.out.println(Boi.getCpf());
        System.out.println(Boi.getCredito());
        System.out.println(Boi.getCodCliente());
        System.out.println(Boi.getBanco().getNome());
        System.out.println("------------------------");
        
         System.out.println(Ale.getNome());
        System.out.println(Ale.getIdade());
        System.out.println(Ale.getCpf());
        System.out.println(Ale.getSetor());
        System.out.println(Ale.getCodFuncionario());
        System.out.println(Ale.getBanco().getNome());
        System.out.println("------------------------");
        
        System.out.println(bradesco.getNome());
        System.out.println(bradesco.getCodBanco());
        System.out.println(bradesco.getCliente().getNome());
        System.out.println(bradesco.getCliente().getCpf());
        System.out.println(bradesco.getFuncionario().getNome());
        System.out.println(bradesco.getFuncionario().getCpf());
    }
    
}

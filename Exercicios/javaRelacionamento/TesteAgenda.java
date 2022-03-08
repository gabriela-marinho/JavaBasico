package gabriela.aprendizado.javaRelacionamento;

public class TesteAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.setNome("gabi");
        //agenda.setEndereco("rua das flores");
        //agenda.setTelefone("888888888");

        //CRIANDO O OBJETO DO TIPO TELEFONE
        Telefone telefone = new Telefone();
        telefone.setNumero("8887999");
        telefone.setDdd("85");
        telefone.setLocalidade("fortaleza");

        //setando o telefone na agenda
        //agenda.setTelefone(telefone);

        //CRIANDO O OBJETO DO TIPO TELEFONE
        Telefone telefone2 = new Telefone();
        telefone2.setNumero("8887999");
        telefone2.setDdd("85");
        telefone2.setLocalidade("fortaleza");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone;

        agenda.setTelefone(telefones);

        //CRIANDO O OBJETO DO TIPO ENDEREÇO
        Endereco endereco = new Endereco();
        endereco.setRua("rua das flores");
        endereco.setNumero("4456");
        endereco.setBairro("pipoca");
        endereco.setEstado("ceara");

        agenda.setEndereco(endereco);

        System.out.println(agenda.getNome());
        System.out.println(agenda.getTelefone());
        // relacionamento 1 - 1
        if (agenda != null && agenda.getEndereco() != null) {
            System.out.println(agenda.getEndereco().getEstado());
        }
//        if (agenda != null && agenda.getTelefone() != null) {
//            System.out.println(agenda.getTelefone().getNumero() + "" + telefone.getDdd());
//
//        }
       if (agenda != null && agenda.getTelefone() != null) {
           for(Telefone t : agenda.getTelefone()){
               System.out.println(t.getNumero() + "" + t.getDdd());
           }
       }
    }
}


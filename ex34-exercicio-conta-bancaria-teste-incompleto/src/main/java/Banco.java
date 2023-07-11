public class Banco {

  // Atributos
  PilhaObj<Operacao> pilhaOperacao;
  FilaObj<Operacao> filaOperacao;
  // Contador de operações empilhadas
  Integer contadorOperacao;

  public Banco() {
    this.pilhaOperacao = new PilhaObj(10);
    this.filaOperacao = new FilaObj(10);
    this.contadorOperacao = 0;
  }

  // Métodos

  /* Método debitar - recebe o valor a ser debitado e o objeto conta bancária
     Se o débito ocorreu com sucesso, cria um objeto Operacao com os valores adequados
     e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
   */
  public void debitar(Double valor, ContaBancaria conta) {
    if (conta.debitar(valor)){
      Operacao operacaoDeb = new Operacao(conta, "Débito", valor);
      pilhaOperacao.push(operacaoDeb);
      contadorOperacao++;
    }
  }

  /* Método depositar - recebe o valor a ser debitado e o objeto conta bancária
     Executa o depósito, cria um objeto Operacao com os valores adequados
     e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
   */
  public void depositar(Double valor, ContaBancaria conta) {
    conta.depositar(valor);
    Operacao operacaoCred = new Operacao(conta, "Depósito", valor);
    pilhaOperacao.push(operacaoCred);
    contadorOperacao++;
  }

  /* Método desfazerOperacao - recebe a quantidade de operações a serem desfeitas
     Se essa quantidade for inválida, lança IllegalArgumentException
     Senão, "desfaz" a quantidade de operações passadas como argumento
     e atualiza o contadorOperacao
   */
  public void desfazerOperacao(Integer qtdOperacaoDesfeita) {
    if (qtdOperacaoDesfeita == null || qtdOperacaoDesfeita <= 0 || qtdOperacaoDesfeita > contadorOperacao){
        throw new IllegalArgumentException();
    }
    else {
      for (int i = 0; i < qtdOperacaoDesfeita; i++) {
        if (pilhaOperacao.peek().getTipoOperacao().equalsIgnoreCase("Débito")) {
          depositar(pilhaOperacao.peek().getValor(), pilhaOperacao.peek().getContaBancaria());
          pilhaOperacao.pop();
          contadorOperacao--;
        }
        if (pilhaOperacao.peek().getTipoOperacao().equalsIgnoreCase("Depósito")) {
          debitar(pilhaOperacao.peek().getValor(), pilhaOperacao.peek().getContaBancaria());
          pilhaOperacao.pop();
          contadorOperacao--;
        }
        pilhaOperacao.pop();
        contadorOperacao--;
      }
    }
  }


  /* Método agendarOperacao - recebe o tipo da operaçõa, o valor e o objeto conta bancária
     Se um dos argumentos for inválido, lança IllegalArgumentException.
     Senão, cria um objeto Operacao e insere esse objeto na fila.
  */
  public void agendarOperacao(String tipoOperacao, Double valor, ContaBancaria conta) {
    if ( tipoOperacao == null  || valor == null || valor <= 0 || conta == null){
      throw new IllegalArgumentException();
    } else if (!tipoOperacao.equalsIgnoreCase("Débito") &&
            !tipoOperacao.equalsIgnoreCase("Depósito")) {
      throw new IllegalArgumentException();
    } else {
      Operacao operacaoAgenda = new Operacao(conta, tipoOperacao, valor);
      filaOperacao.insert(operacaoAgenda);
    }
  }

  /* Método executarOperacoesAgendadas
     Se não houver operações na fila, exibe mensagem de que não há operações agendadas.
     Senão, esvazia a fila, executando cada uma das operações agendadas.
  */
  public void executarOperacoesAgendadas() {
      while (!filaOperacao.isEmpty()){
        Operacao op = filaOperacao.poll();
        if ("Depósito".equals(op.getTipoOperacao())) {
          op.getContaBancaria().depositar(op.getValor());
        } else if ("Débito".equals(op.getTipoOperacao())) {
          op.getContaBancaria().debitar(op.getValor());
        }
      }
    System.out.println("Não há operações agendadas");
  }

  // Gettens
  public PilhaObj<Operacao> getPilhaOperacao() {
    return pilhaOperacao;
  }

  public FilaObj<Operacao> getFilaOperacao() {
    return filaOperacao;
  }

  public Integer getContadorOperacao() {
    return contadorOperacao;
  }

}

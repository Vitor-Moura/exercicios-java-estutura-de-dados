public class Exercicio {
  public int[] separaPositivoNegativoEmOrdem(int[] v) {
    FilaObj<Integer> filaNegativa = new FilaObj<>(v.length);
    FilaObj<Integer> filaPositiva = new FilaObj<>(v.length);


    for (int i = 0; i < v.length; i++) {
      if (v[i] >= 0) {
        filaPositiva.insert(v[i]);
      } else  {
        filaNegativa.insert(v[i]);
      }
    }

    int i=0;
    while (!filaPositiva.isEmpty()){
      v[i++] = filaPositiva.poll();
    }
    while (!filaNegativa.isEmpty()){
      v[i++] = filaNegativa.poll();
    }

//    for (int i = 0; i < v.length; i++) {
//      if (!filaPositiva.isEmpty()){
//        v[i] = filaPositiva.poll();
//      }
//      else {
//        v[i] = filaNegativa.poll();
//      }
//    }
    return v;
  }
  public int[] separaPositivoNegativoOrdemDiferente(int[] v) {
    PilhaObj<Integer> pilhaNegativa = new PilhaObj<>(v.length);
    FilaObj<Integer> filaPositiva = new FilaObj<>(v.length);

    for (int i = 0; i < v.length; i++) {
      if (v[i] >= 0) {
        filaPositiva.insert(v[i]);
      }
      else  {
        pilhaNegativa.push(v[i]);
      }
    }

    int i=0;
    while (!filaPositiva.isEmpty()){
      v[i++] = filaPositiva.poll();
    }
    while (!pilhaNegativa.isEmpty()){
      v[i++] = pilhaNegativa.pop();
    }
    return v;
  }

}

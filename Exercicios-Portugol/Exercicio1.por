programa {
  funcao inicio() {
    
    inteiro vet[] = {2,5,1,3,4,9,7,8,10,6}

    inteiro i = 0, total = 10

    para(i; i < total - 1; i++){
        inteiro x = 0
      para(x; x < total - i - 1; x++){
        se(vet[x] < vet[x + 1]){

          inteiro ordem = vet[x]
          vet[x] = vet[x + 1]
          vet[x + 1] = ordem

        }  
      }
    }
    para(inteiro i = 0; i < 10; i++){
       escreva(vet[i], " ")
    }

  }
}

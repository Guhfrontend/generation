programa
{
    funcao inicio()
    {
        inteiro vet[10], i=0

        para (i; i < 10; i++){
            escreva("Digite o ", i + 1, "º número: ")
            leia(vet[i])
        }

        escreva("Elementos nos índices ímpares:\n")

        i= 1
        para (i; i < 10; i++){
          se(vet[i] % 2 != 0){
            escreva(vet[i], " ")
          }
        }

        escreva("\n")
        
        escreva("Elementos pares:\n")

        i= 0
        para (i; i < 10; i++){
            se (vet[i] % 2 == 0){
                escreva(vet[i], " ")
            }
        }
        escreva("\n")

        inteiro soma = 0
        para (inteiro i = 0; i < 10; i++){
            soma = soma + vet[i]
        }

        escreva("Soma:\n", soma, "\n")

        inteiro media = (soma/10)
        escreva("Média:\n", media, "\n")
    }
}

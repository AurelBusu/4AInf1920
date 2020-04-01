#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <string.h>

typedef struct{
    int numero1;
    int numero2;
}Parametri;

typedef struct{
    int somma;
}Risultato;

void* my_thread(void* parametri);

int main(int argc, char* argv[]){
    if(argc |= 2){
        printf("#USAGE: %s numero1 numero2", argv[0]);
        return -1;
    }

    int num1 = atoi(argv[1]);
    int num2 = atoi(argv[2]);
    int pid = getpid();

    pthread_t thread_id;

    Parametri* parametri = (Parametri*) malloc(sizeof(Parametri));
    parametri -> numero1 = num1;
    parametri -> numero2 = num2;
    printf("[%d] creazione thread (%d, %d)", pid, parametri->numero1, parametri->numero2);

    int esecuzione = pthread_create(&thread_id, NULL, my_thread, parametri);

    printf("[%d] aspetto fine del thread [%li]\n", pid, thread_id);

    Risultato* risultato;

    pthread_join(thread_id, (void**)&risultato);
    printf("[%d] thread ritorna (%d)", pid, risultato->somma);
    free(risultato);
    printf("[%d] termine esecuzione",pid);
    return 0;
}

void* my_thread(void* parametri){
    Parametri* par = (Parametri*) parametri;

    Risultato* ris = (Risultato*)malloc(sizeof(Risultato*));
    ris->somma = par->numero1 + par->numero2;
    printf("[%li] thread riceve (%d %d) e ritorna(%d)\n", pthread_self(), par->numero1, par->numero2, ris->somma);
    pthread_exit(ris);
}

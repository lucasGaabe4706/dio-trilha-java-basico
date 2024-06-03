/*Também utilizamos o controle de fluxo FOR para interagir sobre ARRAYS e COLEÇÕES*/

public class ExemploForArray {
    /*public static void main (String [] args){
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}*/

public static void main(String[] args) {
    String carros [] = {"Ford Mustang", "Chevrolet Camaro", "Dodge Charger", "Pontiac GTO", "Ferrari 250 GTO", "Porsche 911", "Lamborghini Aventador", "Ferrari F8 Tributo", "McLaren 720S", "Aston Martin Vantage"};

    for (int x = 0; x<carros.length; x++){
        if (carros[x].equals ("Lamborghini Aventador")) {
            System.out.println( "Carro " + carros[x] + " encontrado na vaga " + x);
        }
        }
    }
}

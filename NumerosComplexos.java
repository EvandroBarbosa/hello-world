/*sobrecarga de métodos onde os métodos é diferenciado pelos 
parametros e ha três forma disso acontecer 
primeiro o método é diferenciado pelo paramentro do tipo inteiro.
segundo o método é diferenciado pela quantidade de parametro.
terceiro o método é diferenciado pela posição dos parametro.
*/
package classededados;

/**
 *
 * @author evandro
 */
public class NumerosComplexos {
    //criando os atributos
    private int parteReal = 0;
    private int parteImaginaria = 0;
    
    //metodos
    public NumerosComplexos(){
        parteReal = parteImaginaria = 0;
    }
    public NumerosComplexos(int pReal, int pImaginaria){
        this.parteReal = pReal;
        this.parteImaginaria = pImaginaria;
        
    }
    public NumerosComplexos(NumerosComplexos obj){
         this.parteReal = obj.parteReal;
        this.parteImaginaria = obj.parteImaginaria;
                
    }
    public void set(int pReal, int pImaginaria){
       this.parteReal = pReal;
        this.parteImaginaria = pImaginaria;
    }
    public void set(NumerosComplexos obj){
         this.parteReal = obj.parteReal;
        this.parteImaginaria = obj.parteImaginaria;
    }
    public String get(){
        String saida = ""+parteReal+"+"+parteImaginaria+"i";
        return saida;
    }
    public NumerosComplexos adiocionar(NumerosComplexos obj){
        int real = this.parteReal + obj.parteReal;
        int imaginaria = this.parteImaginaria + obj.parteImaginaria;
        NumerosComplexos aux = new NumerosComplexos(real, imaginaria);
        return aux;
    }
    public NumerosComplexos subtrair(NumerosComplexos obj){
        int real = this.parteReal - obj.parteReal;
        int imaginaria = this.parteImaginaria - obj.parteImaginaria;
        NumerosComplexos aux = new NumerosComplexos(real, imaginaria);
        return aux;
    }
    public NumerosComplexos mutiplicar(NumerosComplexos obj){
        int real = (this.parteReal * obj.parteReal)- (this.parteImaginaria * obj.parteImaginaria);
        int imaginaria = (this.parteImaginaria*obj.parteReal) + (this.parteReal*obj.parteImaginaria);
        NumerosComplexos aux = new NumerosComplexos(real, imaginaria);
        return aux;
    }
    public NumerosComplexos dividir(NumerosComplexos obj){
        int real = ((this.parteReal*obj.parteReal)+(this.parteImaginaria*obj.parteImaginaria))/
               ((obj.parteReal*obj.parteReal)+(obj.parteImaginaria*obj.parteImaginaria));
        int imaginaria = ((this.parteImaginaria*obj.parteReal)-(this.parteReal*obj.parteImaginaria))/
                ((obj.parteReal*obj.parteReal)+(obj.parteImaginaria*obj.parteImaginaria));
        NumerosComplexos aux = new NumerosComplexos(real, imaginaria);
        return aux;
    }
    public boolean egual(NumerosComplexos obj){
        if(this.parteReal == obj.parteReal  && this.parteImaginaria == obj.parteImaginaria)
        {
            return true;
        }else{
            return false;
        }
    }
}

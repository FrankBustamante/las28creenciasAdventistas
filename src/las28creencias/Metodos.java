
package las28creencias;

import java.util.ArrayList;

public class Metodos {
    
    int indice[] = new int[28];
    String creencias []= new String[28];
    
    public void agregar()
    {
        creencias[0]="1. La Palabra de Dios";
        creencias[1]="2. La Deidad";
        creencias[2]="3. Dios el Padre";
        creencias[3]="4. Dios el Hijo";
        creencias[4]="5. Dios el Espíritu Santo";
        creencias[5]="6. La creación";
        creencias[6]="7. La naturaleza humana";
        creencias[7]="8. El gran conflicto";
        creencias[8]="9. La vida, muerte y resurrección de Cristo.";
        creencias[9]="10. La experiencia de la salvación";
        creencias[10]="11. Crecer en Cristo";
        creencias[11]="12. La iglesia";
        creencias[12]="13. El remanente y su misión";
        creencias[13]="14. La unidad en el cuerpo de Cristo";
        creencias[14]="15. El bautismo";
        creencias[15]="16. La Cena del Señor";
        creencias[16]="17. Los dones y ministerios espirituales.";
        creencias[17]="18. El don de profecía.";
        creencias[18]="19. La ley de Dios";
        creencias[19]="20. El sábado";
        creencias[20]="21. La mayordomía";
        creencias[21]="22. La conducta cristiana";
        creencias[22]="23. El matrimonio y la familia";
        creencias[23]="24. El ministerio de Cristo en el Santuario celestial";
        creencias[24]="25. La segunda venida de Cristo";
        creencias[25]="26. La muerte y la resurrección";
        creencias[26]="27. El milenio y el fin del pecado.";
        creencias[27]="28. La Tierra Nueva";
    }
    
    {
        indice[0]= 1;
        indice[1]= 2;
        indice[2]= 3;
        indice[3]= 4;
        indice[4]= 5;
        indice[5]= 6;
        indice[6]= 7;
        indice[7]= 8;
        indice[8]= 9;
        indice[9]= 10;
        indice[10]= 11;
        indice[11]= 12;
        indice[12]= 13;
        indice[13]= 14;
        indice[14]= 15;
        indice[15]= 16;
        indice[16]= 17;
        indice[17]= 18;
        indice[18]= 19;
        indice[19]= 20;
        indice[20]= 21;
        indice[21]= 22;
        indice[22]= 23;
        indice[23]= 24;
        indice[24]= 25;
        indice[25]= 26;
        indice[26]= 27;
        indice[27]= 28;
    }
    
   
    String ordenarCreencias(int k)
    {
        
        for (int i = 0; i < 27; i++) {
            for (int j = i+1; j < 28; j++) {
                if(indice[i]>indice[j])
                {
                    int guardar = indice[i];
                    indice[i]= indice[j];
                    indice[j]=guardar;
                    
                    String texto= creencias[i];
                    creencias[i]=creencias[j];
                    creencias[j]=texto;
                }
            }
        }
      return creencias[k];
    }
    
     String desordenarCreencias(int k)
    {
        for (int i = 0; i < 13; i++) {
            for (int j = i+1; j < 14; j++) {
                if(indice[i]<indice[j]) {
                    int guardar = indice[i];
                    indice[i]= indice[j];
                    indice[j]=guardar;
                    
                    String texto= creencias[i];
                    creencias[i]=creencias[j];
                    creencias[j]=texto;
                }
            }
        }
        for (int i = 14; i < 27; i++) {
            for (int j = i+1; j < 28; j++) {
                
                if(indice[i]<indice[j])
                {
                    int guardar = indice[i];
                    indice[i]= indice[j];
                    indice[j]=guardar;
                    
                    String texto= creencias[i];
                    creencias[i]=creencias[j];
                    creencias[j]=texto;
                }
            }
        }
       return creencias[k];
    }

    
}

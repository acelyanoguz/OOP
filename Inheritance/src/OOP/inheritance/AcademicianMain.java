package OOP.inheritance;

import java.util.List;

public class AcademicianMain {
    public static void main(String[] args) {

        AcademicianManager academicianManager = new AcademicianManager();
        List<Academician> responses = academicianManager.getAll();


        Academician academician1 = new Academician();
        academician1.setId(2);
        academician1.setFirstName("Emre");
        academician1.setLastName("Kocaoğlangil");
        academician1.setEmail("emre@hotmail.com");
        academician1.setSection("Developer");
        academicianManager.add(academician1);

        for(Academician academician: responses) {
            System.out.println("Kayıt olan akademisyenin Adı ve Soyadı : " +
                    academician.getFirstName() + " " + academician.getLastName());
            System.out.println("Email bilgisi : " + academician.getEmail());
            System.out.println("Bölümü : " + academician.getSection());
            System.out.println("Sisteme kayıt tarihi : " + academician.getCreatedDate());
        }

        System.out.println("--------Delete-------------");
        academicianManager.delete(2);
        for (Academician academician2:responses){
            System.out.println(academician2.getFirstName() + " " + academician2.getLastName());
        }

        System.out.println("-------Update------------");
        Academician updatedAcademician = new Academician();
        updatedAcademician.setId(1);
        updatedAcademician.setFirstName("Açelya");
        updatedAcademician.setLastName("oğuz");
        updatedAcademician.setSection("QA");
        academicianManager.update(updatedAcademician);

        for (Academician academician3:responses){
            System.out.println(academician3.getFirstName() + " " + academician3.getLastName());
        }

    }




}

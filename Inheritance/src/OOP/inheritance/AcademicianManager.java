package OOP.inheritance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AcademicianManager {
    private List<Academician> academicians;

    public AcademicianManager(){
        academicians = new ArrayList<>();
        Academician academician = new Academician();
        academician.setId(1);
        academician.setFirstName("Zehra");
        academician.setLastName("Temizel");
        academician.setEmail("zehra@hotmail.com");
        academician.setSection("Qa Tester");
        academician.setCreatedDate(LocalDateTime.now());

        academicians.add(academician);


    }

    public List<Academician> getAll(){
        return academicians;
    }

    public void add(Academician academician){

        academician.setCreatedDate(LocalDateTime.now());
        academicians.add(academician);
    }

    public void update(Academician academician){
        for(Academician updateAcademician:academicians){
        if(updateAcademician.getId()==academician.getId()){
            updateAcademician.setFirstName(academician.getFirstName());
            updateAcademician.setLastName(academician.getLastName());
            updateAcademician.setEmail(academician.getEmail());
            updateAcademician.setSection(academician.getSection());
        }
        }
    }

    public void delete(int id){
        Iterator<Academician> iterator = academicians.iterator();
        while(iterator.hasNext()){
            Academician academician = iterator.next();
            if (academician.getId()==id){
                iterator.remove();
            }
        }


    }

    }





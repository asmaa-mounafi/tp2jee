package ma.enset.tp2hospital.repositories;

import ma.enset.tp2hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}

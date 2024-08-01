package ma.enset.tp2hospital.service;

import ma.enset.tp2hospital.entities.Consultation;
import ma.enset.tp2hospital.entities.Medecin;
import ma.enset.tp2hospital.entities.Patient;
import ma.enset.tp2hospital.entities.RendezVous;

public interface IHospital {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}

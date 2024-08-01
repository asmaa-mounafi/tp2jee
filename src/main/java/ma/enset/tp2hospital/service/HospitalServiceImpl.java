package ma.enset.tp2hospital.service;

import ma.enset.tp2hospital.entities.Consultation;
import ma.enset.tp2hospital.entities.Medecin;
import ma.enset.tp2hospital.entities.Patient;
import ma.enset.tp2hospital.entities.RendezVous;
import ma.enset.tp2hospital.repositories.ConsultationRepository;
import ma.enset.tp2hospital.repositories.MedecinRepository;
import ma.enset.tp2hospital.repositories.PatientRepository;
import ma.enset.tp2hospital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IHospitalServiceImpl implements IHospital {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public IHospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {

        return rendezVousRepository.save(rendezVous) ;
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}

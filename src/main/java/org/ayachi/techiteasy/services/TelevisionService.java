package org.ayachi.techiteasy.services;
import org.ayachi.techiteasy.exceptions.RecordNotFoundException;
import org.ayachi.techiteasy.models.Television;
import org.ayachi.techiteasy.repositories.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TelevisionService {
    @Autowired
    private TelevisionRepository televisionRepository;
    public List<Television> getTelevisions() {
        return televisionRepository.findAll();
    }
    public Television getTelevisionById(Long id) {
        return televisionRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Cannot find television"));
    }
    public void addTelevision(Television television) {
        televisionRepository.save(television);
    }
    public void removeTelevision(Long id) {
        if (!televisionRepository.existsById(id)) {
            throw new RecordNotFoundException("Cannot find television");
        }
        televisionRepository.deleteById(id);
    }
    public void updateTelevision(Long id, Television updatedTelevision) {
        if (!televisionRepository.existsById(id)) {
            throw new RecordNotFoundException("Cannot find television");
        }
    }
}
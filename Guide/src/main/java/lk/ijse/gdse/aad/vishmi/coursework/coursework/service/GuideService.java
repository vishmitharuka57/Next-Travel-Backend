package lk.ijse.gdse.aad.vishmi.coursework.coursework.service;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad.vishmi.coursework.coursework.dto.GuideDTO;
import lk.ijse.gdse.aad.vishmi.coursework.coursework.entity.Guide;
import lk.ijse.gdse.aad.vishmi.coursework.coursework.repo.GuideRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class GuideService {
    @Autowired
    private GuideRepo guideRepo;

    @Autowired
    private ModelMapper modelMapper;

    public GuideDTO saveGuide(GuideDTO guideDTO){
        guideRepo.save(modelMapper.map(guideDTO,Guide.class));
        return guideDTO;
    }
    public List<GuideDTO> getAllGuides(){
        List<Guide>guideList = guideRepo.findAll();
        return modelMapper.map(guideList,new TypeToken<List<GuideDTO>>(){}.getType());
    }

    public GuideDTO updateGuide(GuideDTO guideDTO){
        guideRepo.save(modelMapper.map(guideDTO, Guide.class));
        return guideDTO;
    }

    public boolean deleteGuide(GuideDTO guideDTO){
        guideRepo.delete(modelMapper.map(guideDTO, Guide.class));
        return true;
    }
}


package lk.ijse.gdse.aad.vishmi.coursework.coursework.controller;

import lk.ijse.gdse.aad.vishmi.coursework.coursework.dto.GuideDTO;
import lk.ijse.gdse.aad.vishmi.coursework.coursework.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/guides")
@CrossOrigin
public class GuideController {
    @Autowired
    private GuideService guideService;

  @PostMapping("/saveGuide")
    public GuideDTO saveGuide(@RequestBody GuideDTO guideDTO){
        return guideService.saveGuide(guideDTO);
    }

    @GetMapping("/getGuide")
    public List<GuideDTO> getGuide(){
        return guideService.getAllGuides();
    }

    @PutMapping("/updateGuide")
    public GuideDTO updateGuide(@RequestBody GuideDTO guideDTO){
        return guideService.updateGuide(guideDTO);
    }

    @DeleteMapping("/deleteGuide")
    public boolean deleteGuide(@RequestBody GuideDTO guideDTO){
        return guideService.deleteGuide(guideDTO);
    }
}


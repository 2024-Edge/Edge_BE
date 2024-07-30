package service;

import domain.BrightnessDomain;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class BrightnessService {

    private final BrightnessDomain brightnessDomain;

    @Autowired
    public BrightnessService(BrightnessDomain brightness) {
        this.brightnessDomain = brightness;
    }

    public float getBrightness() {
        return brightnessDomain.getBrightness();
    }

    public void setBrightness(float brightness) {
        brightnessDomain.setBrightness(brightness);
    }

}
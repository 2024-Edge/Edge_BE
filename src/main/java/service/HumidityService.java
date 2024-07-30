package service;

import domain.HumidityDomain;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class HumidityService {

    private final HumidityDomain humidityDomain;

    @Autowired
    public HumidityService(HumidityDomain humidity) {
        this.humidityDomain = humidity;
    }

    public float getTemperature() {
        return humidityDomain.getTemperature();
    }

    public void setTemperature(float temperature) {
        humidityDomain.setTemperature(temperature);
    }

    public float getHumidity() {
        return humidityDomain.getHumidity();
    }

    public void setHumidity(float humidity) {
        humidityDomain.setHumidity(humidity);
    }
}
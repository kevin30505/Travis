package edu.ucsd.cs110.temperature;

/**
 * Created by KevinLai on 2/15/17.
 */

public class toFahrenheit extends Temperature
{
    public toFahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = ((this.getValue()- 32)*5)/9;
        return new toCelsius(value);
    }

    public String toString()
    {
        return this.getValue()+" F";
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }
}

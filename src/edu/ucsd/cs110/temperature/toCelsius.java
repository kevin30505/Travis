package edu.ucsd.cs110.temperature;

/**
 * Created by KevinLai on 2/15/17.
 */
 public class toCelsius extends Temperature
    {
        public toCelsius(float t)
        {
            super(t);
        }
        public String toString()
        {
            return this.getValue()+" C";
        }

        @Override
        public Temperature toCelsius() {
            return this;
        }

        @Override
        public Temperature toFahrenheit() {
            float value = ((this.getValue()*9)/5) + 32;
            return new toFahrenheit(value);
        }
    }



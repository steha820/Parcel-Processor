package com.example.demo;

public class MedicalParcel extends Parcel
{
    protected final double COST = 3.0;
    protected double biohazardLevel;
    public MedicalParcel(ProcessingFacility sender, ProcessingFacility recipient, int priority, double biohazardLevel)
    {
        super(sender, recipient, 1);
        this.biohazardLevel = biohazardLevel;
    }

    protected void process(ProcessingFacility processingFacility)
    {
         biohazardLevel++;

         price = COST * biohazardLevel;
    }

    @Override
    public String toString()
    {
        return String.format("[from(" + sender + " to " + recipient + "] - ID: " + ID + " Price: " + price + " Biohazard Level: " + biohazardLevel);
    }
}

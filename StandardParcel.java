package com.example.demo;

public class StandardParcel extends Parcel
{

    protected final double COST = 1.25;

    protected double WEIGHT_KG;
    public StandardParcel(ProcessingFacility sender, ProcessingFacility recipient, int priority, double weight)
    {
        super(sender, recipient, 3);
        WEIGHT_KG = weight;
    }

    @Override
    protected void process(ProcessingFacility processingFacility)
    {
         price = COST * WEIGHT_KG;
    }


    @Override
    public String toString()
    {
        return String.format("StandardParcel [from " + sender + "to " + recipient + "] - ID: " + ID + " Price: " + price + " Weight: " + WEIGHT_KG);
    }
}

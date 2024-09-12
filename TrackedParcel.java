package com.example.demo;

import java.util.ArrayList;

public class TrackedParcel extends Parcel
{
    protected final double COST = 1.5;
    protected String trackingLocation;
    protected ArrayList<ProcessingFacility> locations;
    protected int locationsVisited;
    public TrackedParcel(ProcessingFacility sender, ProcessingFacility recipient, int priority)
    {
        super(sender, recipient, 2);

        locations = new ArrayList<>();

        trackingLocation = "";
    }

    @Override
    protected void process(ProcessingFacility processingFacility)
    {
         if(locations == null)
         {

         }
         else
         {
             for (ProcessingFacility element : locations)
             {
                 trackingLocation = locations + ", ";

                 locationsVisited++;
             }
         }

        price = COST * locationsVisited;
    }

    @Override
    public String toString()
    {
        return String.format("Tracked Parcel [from " + sender + " to " + recipient + "] - ID: " + ID + "Price: " + price + " Locations: " + trackingLocation);
    }
}

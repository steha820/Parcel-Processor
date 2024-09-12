package com.example.demo;

/**
 * Class to represent a Parcel object.
 * You will heavily edit this class and therefore no further comments have been added.
 * Ensure you add comments when submitting.
 */

public class Parcel
{

    protected ProcessingFacility sender;
    protected ProcessingFacility recipient;
    protected double price;
    protected int priority;
    protected final int ID;
    private static int nextId = 1;

    public Parcel(ProcessingFacility sender, ProcessingFacility recipient, int priority)
    {
        ID = nextId;
        nextId++;

        this.sender = sender;
        this.recipient = recipient;
        this.priority = priority;

    }


    protected void process(ProcessingFacility processingFacility)
    {

    }

    public ProcessingFacility getSender()
    {
        return sender;
    }

    public ProcessingFacility getRecipient()
    {
        return recipient;
    }

}

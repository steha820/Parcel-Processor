package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class to represent a ProcessingFacility object.
 * You will heavily edit this class and therefore no further comments have been added.
 * Ensure you add comments when submitting.
 */
public class ProcessingFacility
{

    protected final int ID;
    private static int nextId = 1;

    protected final int X;
    protected final int Y;
    protected final String ADDRESS;
    protected ArrayList<ProcessingFacility> neighbours;

    protected String[] neighboursAddresses;

    public ProcessingFacility(int x, int y)
    {
        ID = nextId;
        nextId++;

        X = x;
        Y = y;
        this.ADDRESS = "X" + x + "Y" + y;

        neighbours = new ArrayList<>();


    }

    public int getX()
    {
        return X;
    }

    public int getY()
    {
        return Y;
    }

    public String getADDRESS()
    {
        return ADDRESS;
    }

    public int getID()
    {
        return ID;
    }

    public ArrayList<ProcessingFacility> getNeighbours()
    {
        return neighbours;
    }

    public void addNeighbour(ProcessingFacility neighbour)
    {
         neighbours.add(neighbour);
    }

    @Override
    public String toString()
    {
        return String.format("Address:(" + ADDRESS + ")" + "Neighbours:(" + neighboursAddresses + ").");
    }



}

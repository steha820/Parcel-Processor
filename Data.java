package com.example.demo;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/**
 * Class to hold data that is added to the "database".
 * You may add methods to this class.
 */
public class Data
{

    /**
     * Attributes to save our data to the "database"
     */
    private static ArrayList<ProcessingFacility> processingFacilities = new ArrayList<>();

    private static Stack<Parcel> parcels = new Stack<>();
    private static Stack<Parcel> processedParcels = new Stack<>();

    /*0*
     * Method to return the Stack of parcels
     * @return parcels which is a stack of parcels
     */
    public static Stack<Parcel> getParcels(){
        return parcels;
    }

    /**
     * Method to return the processing facilities
     * @return array list of processing facilities
     */
    public static ArrayList<ProcessingFacility> getProcessingFacilities()
    {
        return processingFacilities;
    }

    /**
     * Method to return the processed parcels.
     * @return stack of parcels called completed deliveries.
     */
    public static Stack<Parcel> getProcessedParcels(){
        return processedParcels;
    }


    /**
     * DO NOT EDIT ANY CODE ABOVE THIS COMMENT. You may need to write additional methods below.
     */


    public ProcessingFacility findProcessingFacility(String address)
    {
        for (int i = 0; i < processingFacilities.size(); i++)
        {
            ProcessingFacility processingFacility = processingFacilities.get(i);

            if (Objects.equals(processingFacility.getADDRESS(), address))
            {
                return processingFacility;
            }

        }

        return null;

    }


    public ProcessingFacility findProcessingFacility(int ID)
    {
        for (int i = 0; i < processingFacilities.size(); i++)
        {
            ProcessingFacility processingFacility = processingFacilities.get(i);

            if (processingFacility.getID() == ID)
            {
                return processingFacility;
            }
        }

        return null;
    }




    public void readProcessingFacilities() throws FileNotFoundException
    {

        try
        {
            File processingFacility = new File("processingFacilities.txt");
            Scanner in = new Scanner(processingFacility);

            int numOfFileLines = 0;

            while(in.hasNextLine())
            {
                String fileLine = in.nextLine();
                numOfFileLines++;
                String[] split = fileLine.split("\\s+");

                if(split.length == 2)
                {
                     int x = Integer.parseInt(split[0]);
                     int y = Integer.parseInt(split[1]);

                     ProcessingFacility readProcessingFacility = new ProcessingFacility(x, y);

                     Data.getProcessingFacilities().add(readProcessingFacility);
                }
            }

            in.close();

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }



    }

    public void readConnections() throws FileNotFoundException
    {


        try
        {

            File connections = new File("connections.txt");
            Scanner in = new Scanner(connections);
            int numOfFileLines = 0;

            while(in.hasNextLine())
            {
                String fileLine = in.nextLine();
                numOfFileLines++;
                String[] split = fileLine.split("\\s+");

                for (int i = 0; i <= numOfFileLines; i++)
                {
                    ArrayList<String> linkedAddresses = new ArrayList<>();


                    if(split.length == 4)
                    {
                        String sender = String.valueOf(Integer.parseInt(split[0]));
                        String recipient = String.valueOf(Integer.parseInt(split[1]));
                        String parcelType = String.valueOf(Integer.parseInt(split[2]));
                        String otherInfo = String.valueOf(Integer.parseInt(split[3]));


                        //if ()


                    }
                }




            }

            in.close();

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }




    }


    public void readParcels()
    {
        try
        {
            File parcels = new File("parcels.txt");
            Scanner in = new Scanner(parcels);
            int numOfFileLines = 0;

            while (in.hasNextLine())
            {
                String fileLine = in.nextLine();
                numOfFileLines++;
                String[] split = fileLine.split("\\s+");

                for (int i = 0; i <= numOfFileLines; i++)
                {
                    ArrayList<String> linkedAddresses = new ArrayList<>();

                    if (split.length == 2)
                    {
                        String address1 = String.valueOf(Integer.parseInt(split[0]));
                        String address2 = String.valueOf(Integer.parseInt(split[1]));

                        ProcessingFacility facilityAddress1 = findProcessingFacility(address1);
                        ProcessingFacility facilityAddress2 = findProcessingFacility(address2);

                        if (facilityAddress1 == facilityAddress2)
                        {
                            linkedAddresses.add(address1);
                            linkedAddresses.add(address2);
                        }
                    }
                }
            }


            in.close();

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }


    }






}

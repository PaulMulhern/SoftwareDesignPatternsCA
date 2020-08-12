/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author spart
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //This is the main menu so to speak for the program
        //from here the user is able to select an aicraft from a list which was oncsturcted via factories
        //the user is also apple to add new flightscrew as well as convert an Airliner to an AWACS plane
        
        //this scans for user input
        Scanner userInput = new Scanner(System.in);
        //initializing variables
        AbstractFactory aircraftFactory;
        //each of these is for the various selection menus
        String systemSelection, factorySelection, aircraftSelection, pilotAdd, adaptorPick, pilotCertInput;
        //initialzing for Abstract Factory
        Aircraft aircraft;
        //initializing for observer
        PilotList pilotList = new PilotList();
        //initialzing for command
        PilotCertificationInvoker pilotCertInvoke = new PilotCertificationInvoker();
        
        //selection prompt
        System.out.println("Enter 1 for Aircraft selection, 2 to add new a new Pilot, "
                + "3 to convert passenger aircraft to AWACS, or 4 to certify a Pilot");
        //taking user input
        systemSelection = userInput.next();

        //this first switch is entirely fo selecting what system to use
        //this entails selecting aircraft selection, adding in new flightcrews and the adaptor
            switch (systemSelection)
            {
//--------->case 1 is for aircraft selection (Abstract Factory)
                case "1":
                    //selecting from passenger planes, cargo planes, and military jets
                    System.out.println("Would you like to select a passenger Airliner, a cargo plane, or a military jet?");
                    System.out.println("please enter 1 for Airliner,  2 for cargo plane, and 3 for Military jet");
                    //taking user input
                    factorySelection = userInput.next();
                    //this switch is for user selection of the type of Airliner they want to select
                    switch (factorySelection)
                    {
                        //case 1 is for passenger Airliners
                        case "1":
                            aircraftFactory = FactoryProvider.getAircraftFactory("1");
                            System.out.println("Please enter either 1 for a Boeing Airliner, 2 for a Lockeheed Martin Airliner, "
                                + "or 3 for a Airbus Airliner");
                            //taking user input
                            aircraftSelection = userInput.next();
                            //this switch is entirely for picking the airliner you want and displaying the data
                            switch (aircraftSelection)
                            {
                                //selects Boeing Airliners
                                case "1":
                                {
                                    aircraft = aircraftFactory.getAircraft("1");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //selects Lockeheed Martin Airliners
                                case "2":
                                {
                                    aircraft = aircraftFactory.getAircraft("2");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //selects Airbus Airliners
                                case "3":
                                {
                                    aircraft = aircraftFactory.getAircraft("3");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //default incase an invalid number is picked need to refactor to encompas entire section
                                default:
                                    while (!"1".equals(aircraftSelection) || !"2".equals(aircraftSelection) || !"3".equals(aircraftSelection))
                                    {
                                        System.out.println("please enter a number between 1 and 3");
                                        aircraftSelection = userInput.next();
                                    }
                                    break;
                            }
                            break;
                        //case 2 is for cargo planes
                        case "2":
                            aircraftFactory = FactoryProvider.getAircraftFactory("2");
                            System.out.println("Please enter either 1 for a Boeing cargo plane, 2 for a Lockeheed Martin cargo plane, "
                                + "or 3 for a Airbus cargo plane");
                            //taking user input
                            aircraftSelection = userInput.next();
                            //this switch is entirely for picking the cargo plane you want and displaying the data
                            switch (aircraftSelection)
                            {
                                //selects Boeing Cargo Plane
                                case "1":
                                {
                                    aircraft = aircraftFactory.getAircraft("1");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //selects Lockeheed Martin cargo planes
                                case "2":
                                {
                                    aircraft = aircraftFactory.getAircraft("2");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //selects Airbus cargo planes
                                case "3":
                                {
                                    aircraft = aircraftFactory.getAircraft("3");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //default incase an invalid number is picked
                                default:
                                    while (!"1".equals(aircraftSelection) || !"2".equals(aircraftSelection) || !"3".equals(aircraftSelection))
                                    {
                                        System.out.println("please enter a number between 1 and 3");
                                        aircraftSelection = userInput.next();
                                    }
                                    break;
                            }
                            break;
                        //case 3 is for military jets
                        case "3":
                            aircraftFactory = FactoryProvider.getAircraftFactory("3");
                            System.out.println("Please enter either 1 for a Boeing military jet, 2 for a Lockeheed Martin military jet, "
                                + "or 3 for a Airbus military jet");
                            //taking user input
                            aircraftSelection = userInput.next();
                            //this switch is entirely for picking the military jet you want and displaying the data
                            switch (aircraftSelection)
                            {
                                //selects Boeing military jet
                                case "1":
                                {
                                    aircraft = aircraftFactory.getAircraft("1");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //selects Lockeheed Martin military jet
                                case "2":
                                {
                                    aircraft = aircraftFactory.getAircraft("2");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //selects Airbus military jet
                                case "3":
                                {
                                    aircraft = aircraftFactory.getAircraft("3");
                                    System.out.println(aircraft.getOutput());
                                    break;
                                }
                                //default incase an invalid number is picked need to refactor to encompase entire selection
                                default:
                                    while (!"1".equals(aircraftSelection) || !"2".equals(aircraftSelection) || !"3".equals(aircraftSelection))
                                    {
                                        System.out.println("please enter a number between 1 and 3");
                                        aircraftSelection = userInput.next();
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
//--------->this case is for adding new Pilot (Observer)
                case "2":
                    //getting the observer ready
                    pilotList.addObserver(new DisplayPilotUpdateObserver());
                    //grabbing user input
                    System.out.println("What is the name of the new Pilot?");
                    pilotAdd = userInput.next();
                    //adding the new pilot to the list and displaying it2
                    pilotList.updatePilotList(new Pilot(pilotAdd));
                    break;
//---------->this case is for adapting airliners into AWACS (Adaptor)
                case "3":
                    System.out.println("Which plane would you like to convert into an AWACS?");
                    System.out.println("1 for Boeing, 2 for Lockheed Martin, and 3 for Airbus");
                    //accepting user input to select which plane to adapt into an AWACS
                    adaptorPick = userInput.next();
                    switch (adaptorPick)
                    {
                        //this case is for Boeing planes
                        case "1":
                        {
                                Aircraft boeingAirliner = new BoeingAirliner();
                                //changing the plane type from passenger to AWACS
                                AWACSAdaptor boeingAirlinerAdaptor = new AWACSAdaptorImplementation(boeingAirliner);
                                //printing out the new type
                                System.out.println("Boeing 787 Dreamliner succesfully changed");
                                System.out.println("Airliner's new type:");
                                System.out.println(boeingAirlinerAdaptor.getType());
                                break;
                        }
                        //this case is for Lockeheed Martin planes
                        case "2":
                        {
                                Aircraft lockheedMartinAirliner = new LockheedMartinAirliner();
                                //changing the plane type from passenger to AWACS
                                AWACSAdaptor lockheedMartinAirlinerAdaptor = new AWACSAdaptorImplementation(lockheedMartinAirliner);
                                //printing out the new type
                                System.out.println("Lockheed L-1011 TriStar succesfully changed");
                                System.out.println("Airliner's new type:");
                                System.out.println(lockheedMartinAirlinerAdaptor.getType());
                                break;
                        }
                        //this case is for Airbus planes
                        case "3":
                        {
                                Aircraft airbusAirliner = new AirbusAirliner();
                                //changing the plane type from passenger to AWACS
                                AWACSAdaptor airbusAirlinerAdaptor = new AWACSAdaptorImplementation(airbusAirliner);
                                //printing out the new type
                                System.out.println("Airbus A380 succesfully changed");
                                System.out.println("Airliner's new type:");
                                System.out.println(airbusAirlinerAdaptor.getType());
                                break;
                        }
                    }
                    break;
//---------->Pilot certification which is the command pattern
                case "4":
                    System.out.println("Please enter the name of the Pilot you want to certify");
                    //grabbing user input to certify pilot
                    pilotCertInput = userInput.next();
                    pilotCertInvoke.commenceCertification(new CreatePilotCertificate(new Certificate(pilotCertInput)));
                    System.out.println("Pilot Succesfully certified!");
                    break;
//---------->Default, need to refactor into a while loop that encapulates the whole assignment
                default:
            //        while (!"1".equals(systemSelection) || !"2".equals(systemSelection) || !"3".equals(systemSelection))
            //        {
            //             System.out.println("please enter a number between 1 and 4");
            //             systemSelection = userInput.next();
            //        }
                    break;

                
            } 
        
    }    
}

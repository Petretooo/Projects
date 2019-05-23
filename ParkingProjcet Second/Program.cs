using System;
using System.Collections.Generic;

namespace ModelThis2
{
    class Program
    {
         static Autopark PublicAutopark;
         static Autopark LogisticAutopark;
        static void Main(string[] args)
        {
            PublicAutopark = new PublicTransportationAutopark();
            LogisticAutopark = new LogisticAutopark();


            Console.WriteLine($"What vehicle you want to create?\n" +
                              $"1.Car\n" +
                              $"2.Bus\n" +
                              $"3.Van\n");

            int typeVehicleCommand = int.Parse(Console.ReadLine());
            Console.WriteLine();

            while (typeVehicleCommand != 0)
            {
                if (typeVehicleCommand == 1)
                {
                    MotorVehicle car = creatingVehicle(typeVehicleCommand);

                    Console.WriteLine($"Where would you like to park the vehicle?\n" +
                    $"1.Public Transportation Autopark\n" +
                    $"2.Logistic Autopark\n" +
                    $"0.Exit\n");
                    int parkingVehicle = int.Parse(Console.ReadLine());
                    parkingTheVehicle(car, parkingVehicle);
                }
                else if (typeVehicleCommand == 2)
                {
                    MotorVehicle bus = creatingVehicle(typeVehicleCommand);

                    Console.WriteLine($"Where would you like to park the vehicle?\n" +
                    $"1.Public Transportation Autopark\n" +
                    $"2.Logistic Autopark\n" +
                    $"0.Exit\n");
                    int parkingVehicle = int.Parse(Console.ReadLine());
                    parkingTheVehicle(bus, parkingVehicle);
                }
                else if (typeVehicleCommand == 3)
                {
                    MotorVehicle van = creatingVehicle(typeVehicleCommand);

                    Console.WriteLine($"Where would you like to park the vehicle?\n" +
                    $"1.Public Transportation Autopark\n" +
                    $"2.Logistic Autopark\n" +
                    $"0.Exit\n");
                    int parkingVehicle = int.Parse(Console.ReadLine());
                    parkingTheVehicle(van, parkingVehicle);
                }
                Console.WriteLine();
                Console.WriteLine($"What vehicle you want to create?\n" +
                                  $"1.Car\n" +
                                  $"2.Bus\n" +
                                  $"3.Van\n" +
                                  $"0.EXit(END OF PROGRAM!)\n");

                typeVehicleCommand = int.Parse(Console.ReadLine());
                Console.WriteLine();
            }
            Console.WriteLine(PublicAutopark.ToString());
            Console.WriteLine();
            Console.WriteLine(LogisticAutopark.ToString());
        }



        static MotorVehicle creatingVehicle(int typeVehicleCommand)
        {
            MotorVehicle vehicle = null;
            if (typeVehicleCommand == 1)
            {
                Console.Write("Power: ");
                int power = int.Parse(Console.ReadLine());
                Console.Write("Passengers: ");
                int passengers = int.Parse(Console.ReadLine());
                Console.Write("Cargo Weight: ");
                double cargo = double.Parse(Console.ReadLine());

                Car car = new Car(power, passengers, cargo);
                vehicle = car;
            }
            else if (typeVehicleCommand == 2)
            {
                Console.Write("Power: ");
                int power = int.Parse(Console.ReadLine());
                Console.Write("Passengers: ");
                int passengers = int.Parse(Console.ReadLine());
                Console.Write("Cargo Weight: ");
                double cargo = double.Parse(Console.ReadLine());

                Bus bus = new Bus(power, passengers, cargo);
                vehicle = bus;
            }
            else if (typeVehicleCommand == 3)
            {
                Console.Write("Power: ");
                int power = int.Parse(Console.ReadLine());
                Console.Write("Passengers: ");
                int passengers = int.Parse(Console.ReadLine());
                Console.Write("Cargo Weight: ");
                double cargo = double.Parse(Console.ReadLine());

                Van van = new Van(power, passengers, cargo);
                vehicle = van;
            }
            Console.WriteLine();
            return vehicle;

        }

        static void parkingTheVehicle(MotorVehicle vehicle, int parkingVehicle)
        {
            while (parkingVehicle != 0)
            {
                if (parkingVehicle == 1)
                {
                   PublicAutopark.Add(vehicle);
                }
                else if (parkingVehicle == 2)
                {
                    LogisticAutopark.Add(vehicle);
                }
                Console.WriteLine();
                Console.WriteLine($"Please write 0, to return to the first menu.");
                parkingVehicle = int.Parse(Console.ReadLine());

                //Something NEW!________________________________________________________________________________________
                if(parkingVehicle == 1 || parkingVehicle == 2)
                {
                    break;
                }
            }
        }
    }
}

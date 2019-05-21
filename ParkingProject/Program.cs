using System;
using System.Collections.Generic;

namespace ModelThis2
{
    class Program
    {
        static void Main(string[] args)
        {

            List<Autopark> autoparks = new List<Autopark>();

            Autopark PublicAutopark = new PublicTransportationAutopark();
            Autopark LogisticAutopark = new LogisticAutopark();


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
                    Console.Write("Power: ");
                    int power = int.Parse(Console.ReadLine());
                    Console.Write("Passengers: ");
                    int passengers = int.Parse(Console.ReadLine());
                    Console.Write("Cargo Weight: ");
                    double cargo = double.Parse(Console.ReadLine());

                    Car car = new Car(power, passengers, cargo);

                    Console.WriteLine();

                    Console.WriteLine($"Where would you like to park the vehicle?\n" +
                                        $"1.Public Transportation Autopark\n" +
                                        $"2.Logistic Autopark\n" +
                                        $"0.Exit\n");

                    int parkingVehicle = int.Parse(Console.ReadLine());

                    Console.WriteLine();

                    while (parkingVehicle != 0)
                    {

                        if (parkingVehicle == 1)
                        {
                            PublicAutopark.Add(car);                           
                        }
                        else if (parkingVehicle == 2)
                        {
                            LogisticAutopark.Add(car);
                        }
                        Console.WriteLine();
                        Console.WriteLine($"Please write 0, to return to the first menu.");

                        parkingVehicle = int.Parse(Console.ReadLine());
                    }

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

                    Console.WriteLine();
                    Console.WriteLine($"Where would you like to park the vehicle?\n" +
                                        $"1.Public Transportation Autopark\n" +
                                        $"2.Logistic Autopark\n" +
                                        $"0.Exit\n");

                    int parkingVehicle = int.Parse(Console.ReadLine());

                    while (parkingVehicle != 0)
                    {

                        if (parkingVehicle == 1)
                        {

                            PublicAutopark.Add(bus);

                        }
                        else if (parkingVehicle == 2)
                        {
                            LogisticAutopark.Add(bus);
                        }
                        Console.WriteLine();
                        Console.WriteLine($"Please write 0, to return to the first menu.");

                        parkingVehicle = int.Parse(Console.ReadLine());
                    }
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
                    Console.WriteLine();

                    Console.WriteLine($"Where would you like to park the vehicle?\n" +
                                        $"1.Public Transportation Autopark\n" +
                                        $"2.Logistic Autopark\n" +
                                        $"0.Exit\n");

                    int parkingVehicle = int.Parse(Console.ReadLine());

                    while (parkingVehicle != 0)
                    {

                        if (parkingVehicle == 1)
                        {

                            PublicAutopark.Add(van);

                        }
                        else if (parkingVehicle == 2)
                        {
                            LogisticAutopark.Add(van);
                        }
                        Console.WriteLine();
                        Console.WriteLine($"Please write 0, to return to the first menu.");

                        parkingVehicle = int.Parse(Console.ReadLine());
                    }
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
    }
}

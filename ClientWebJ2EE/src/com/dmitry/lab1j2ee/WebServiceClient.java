package com.dmitry.lab1j2ee;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class WebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://desktop-tiide9g:8080/JEE2_web1-189181633687756108.0-SNAPSHOT/MotorbikeService?wsdl");
        MotorbikeService motorbikeService = new MotorbikeService(url);
        List<Motorbike> bikes = motorbikeService.getMotorbikeWebServicePort().getAllBikes();
        for (Motorbike motorbike: bikes) {
            System.out.println("id: " + motorbike.getId() +
                    ", brand='" + motorbike.getBrand() +
                    ", model='" + motorbike.getModel() +
                    ", color='" + motorbike.getColor() +
                    ", fueltank='" + motorbike.getFueltank() +
                    ", weight='" + motorbike.getWeight() );
        }
        System.out.println("Total persons: " + bikes.size());

        Scanner in = new Scanner(System.in);

        String b;
        long id;
        String brand;
        String model;
        String color;
        String fueltank;
        String weight;
        String request;

        do {
            System.out.println("Enter request: ");
            request = in.nextLine();


            List<Motorbike> bikes1 = motorbikeService.getMotorbikeWebServicePort().getFind(request);
            for (Motorbike motorbike: bikes1) {
                System.out.println("id: " + motorbike.getId() +
                        ", brand='" + motorbike.getBrand() +
                        ", model='" + motorbike.getModel() +
                        ", color='" + motorbike.getColor() +
                        ", fueltank='" + motorbike.getFueltank() +
                        ", weight='" + motorbike.getWeight() );
            }
            System.out.println("What do you want to search on database? (yes/no)");
            b = in.nextLine();
            }while (b.equals("yes"));

    }

}

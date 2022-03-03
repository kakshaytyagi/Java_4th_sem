/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fcfs;

import java.util.Scanner;

/**
 *
 * @author rravit
 */
class Example {

    private int n;
    private int bt[];     // burst times
    private int ar[];     // arrival times
    private int pid[];   // id
    private int ta[];     // turn around times
    private int wt[];     // waiting times
    private int ft[];   //finish timen
    private int total_wt;   //total waiting time
    private int total_tat;  //total turn around time
    private float avgwt = 0, avgta = 0;
    Scanner sc = new Scanner(System.in);

    public Example() {
        System.out.println("Enter the no. of process: ");
        n = sc.nextInt();
        ft = new int[n];
        bt = new int[n];
        ar = new int[n];
        pid = new int[n];
        ta = new int[n];
        wt = new int[n];
    }

    public void get_inp() {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter process " + (i + 1) + " arrival time: ");
            ar[i] = sc.nextInt();
            System.out.println("Enter process " + (i + 1) + " brust time: ");
            bt[i] = sc.nextInt();
            pid[i] = i + 1;
        }
    }

    public void findWaitingTime() {

        wt[0] = 0;  // waiting time for first process is 0

        for (int i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }

    public void findTurnAroundTime() {
        // calculating turnaround time by adding
        // bt[i] + wt[i]
        for (int i = 0; i < n; i++) {
            ta[i] = bt[i] + wt[i];
        }
    }

    public void findavgTime() {

        System.out.printf("Processes | Burst time |  Waiting"
                + "time | Turn around time\n");

        findWaitingTime();
        findTurnAroundTime();
        
        // Calculate total waiting time and total turn around time
        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + ta[i];
            System.out.printf(" %d ", (i + 1));
            System.out.printf("     %d ", bt[i]);
            System.out.printf("     %d", wt[i]);
            System.out.printf("     %d\n", ta[i]);
        }
        
        float s = (float) total_wt / (float) n;
        int t = total_tat / n;
        System.out.printf("Average waiting time = %f", s);
        System.out.printf("\n");
        System.out.printf("Average turn around time = %d ", t);
    }

}

public class FCFS {

    public static void main(String[] args) {
        // TODO code application logic here

        Example e = new Example();
        e.get_inp();
        e.findavgTime();

    }

}

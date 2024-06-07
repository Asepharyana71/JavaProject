package com.mytheclipse;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DynamicJUNGGraph {
    private static final Graph<String, String> graph = new DirectedSparseGraph<>();
    private static BasicVisualizationServer<String, String> vv;
    private static JFrame frame;

    public static void main(String[] args) {
        createAndShowGUI();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Tambah node");
            System.out.println("2. Tambah edge");
            System.out.println("3. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (choice) {
                case 1:
                    addNode(scanner);
                    break;
                case 2:
                    addEdge(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void addNode(Scanner scanner) {
        System.out.print("Masukkan nama node: ");
        String nodeName = scanner.nextLine();
        graph.addVertex(nodeName);
        vv.getGraphLayout().reset();
        vv.repaint();
    }

    private static void addEdge(Scanner scanner) {
        System.out.print("Masukkan node asal: ");
        String source = scanner.nextLine();
        System.out.print("Masukkan node tujuan: ");
        String destination = scanner.nextLine();
        graph.addEdge(source + "-" + destination, source, destination);
        vv.getGraphLayout().reset();
        vv.repaint();
    }

    private static void createAndShowGUI() {
        vv = new BasicVisualizationServer<>(new CircleLayout<>(graph), new Dimension(600, 400));
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());

        frame = new JFrame("Dynamic JUNG Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }
}
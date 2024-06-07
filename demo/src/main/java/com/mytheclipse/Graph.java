package com.mytheclipse;

import java.awt.*;
import javax.swing.*;
import java.util.LinkedList;

class Graph {
    private int numVertices; // Jumlah simpul dalam graf
    private LinkedList<Integer> adjLists[]; // Daftar tetangga untuk menyimpan tepi-tepi graf

    // Constructor
    public Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    // Fungsi untuk menambahkan tepi ke graf
    public void addEdge(int src, int dest) {
        adjLists[src].add(dest); // Tambahkan tepi dari src ke dest
        adjLists[dest].add(src); // Jika graf tidak berarah, tambahkan juga tepi dari dest ke src
    }

    // Fungsi untuk menampilkan graf
    public void displayGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer node : adjLists[i]) {
                System.out.print(" -> " + node);
            }
            System.out.println();
        }
    }

    // Fungsi untuk menggambar graf secara visual
    public void displayGraphVisual() {
        JFrame frame = new JFrame("Graph Visualisation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GraphPanel());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    class GraphPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawGraph(g);
        }

        private void drawGraph(Graphics g) {
            int radius = 200; // Radius lingkaran tempat simpul-simpul akan ditempatkan
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            int vertexRadius = 20; // Radius simpul

            Point[] positions = new Point[numVertices];
            for (int i = 0; i < numVertices; i++) {
                double angle = 2 * Math.PI * i / numVertices;
                int x = (int) (centerX + radius * Math.cos(angle));
                int y = (int) (centerY + radius * Math.sin(angle));
                positions[i] = new Point(x, y);
            }

            g.setColor(Color.BLACK);
            for (int i = 0; i < numVertices; i++) {
                for (int j : adjLists[i]) {
                    if (i < j) { // Menghindari menggambar garis dua kali untuk graf yang tidak berarah
                        g.drawLine(positions[i].x, positions[i].y, positions[j].x, positions[j].y);
                    }
                }
            }

            g.setColor(Color.RED);
            for (int i = 0; i < numVertices; i++) {
                g.fillOval(positions[i].x - vertexRadius / 2, positions[i].y - vertexRadius / 2, vertexRadius, vertexRadius);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(i), positions[i].x - 5, positions[i].y + 5);
            }
        }
    }

    public static void main(String[] args) {
        // Membuat graf dengan 5 simpul
        Graph g = new Graph(5);

        // Menambahkan tepi-tepi ke graf
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // Menampilkan graf
        g.displayGraph();

        // Menampilkan graf secara visual
        g.displayGraphVisual();
    }
}

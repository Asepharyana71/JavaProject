package com.mytheclipse;

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
    }
}
package P15;

public class GraphMatriks12 {
    int vertex;
    int[][] matriks;

    public GraphMatriks12(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        int inDegree = 0;
        int outDegree = 0;

        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                inDegree++;
            }
            if (matriks[asal][i] != 0) {
                outDegree++;
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (inDegree + outDegree) + ("\n"));
    }

    public boolean cekEdge(int asal, int tujuan) {
        return matriks[asal][tujuan] != 0;
    }
}

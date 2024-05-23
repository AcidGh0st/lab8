package controller;

import domain.BTree;
import domain.TreeException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;

public class GraphicBTreeController
{
//    @javafx.fxml.FXML
//    private Canvas Canvas;
//    private BTree bTree;
//    @FXML
//    private Pane treePane;
//
//    @FXML
//    private Button randomizeButton;
//
//    @FXML
//    private Button levelsButton;
//
//    @FXML
//    private Button tourInfoButton;
//
//    @FXML
//    private TextArea tourInfoTextArea;
//
//    private BTree binaryTree;
//
//    @javafx.fxml.FXML
//    private void initialize() {
//        binaryTree = new BTree();
//    }
//
//    @javafx.fxml.FXML
//    public void levelsOnAction(ActionEvent actionEvent) {
//        try {// Traza una línea horizontal y enumera los niveles del árbol
//        int height = 0;
//
//            height = binaryTree.height();
//
//        String levels = "";
//        for (int i = 0; i <= height; i++) {
//            levels += i + "\n";
//        }
//        tourInfoTextArea.setText(levels);
//        } catch (TreeException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @javafx.fxml.FXML
//    public void randomizeOnAction(ActionEvent actionEvent) {
//        binaryTree.clear();
//        int n = util.Utility.getRandom(100); // Genera un número aleatorio entre 0 y 99
//        for (int i = 0; i < 10; i++) {
//            binaryTree.add(n); // Agrega números aleatorios al árbol
//        }
//        drawTree();
//    }
//
//    @FXML
//    public void tourInfoOnAction(ActionEvent actionEvent) {
//    }
//
//
//    @FXML
//    private void handleTourInfoButton() {
//        // Muestra información relacionada con el árbol: altura, recorridos en preorden, inorden y postorden
//        int height = binaryTree.height();
//        String info = "Tree Height: " + height + "\n";
//        info += "PreOrder: " + binaryTree.preOrder() + "\n";
//        info += "InOrder: " + binaryTree.inOrder() + "\n";
//        info += "PostOrder: " + binaryTree.postOrder() + "\n";
//        tourInfoTextArea.setText(info);
//    }
//
//    private void drawTree() {
//        // Borra el contenido anterior del Pane
//        treePane.getChildren().clear();
//
//        // Crea un nuevo Canvas
//        Canvas canvas = new Canvas(treePane.getWidth(), treePane.getHeight());
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//
//        // Dibuja el árbol binario en el Canvas
//        drawNode(gc, binaryTree.getRoot(), treePane.getWidth() / 2, 50, 50);
//
//        // Agrega el Canvas al Pane
//        treePane.getChildren().add(canvas);
//    }
//
//    private void drawNode(GraphicsContext gc, BTreeNode node, double x, double y, double spacing) {
//        if (node != null) {
//            // Dibuja el nodo
//            gc.setFill(Color.WHITE);
//            gc.setStroke(Color.BLACK);
//            gc.setLineWidth(2);
//            gc.fillOval(x - 25, y - 25, 50, 50);
//            gc.strokeOval(x - 25, y - 25, 50, 50);
//            gc.setFill(Color.BLACK);
//            gc.fillText(node.getData().toString(), x - 5, y + 5);
//
//            // Dibuja las conexiones con los hijos izquierdo y derecho
//            if (node.getLeft() != null) {
//                drawConnection(gc, x, y, x - spacing, y + 100);
//                drawNode(gc, node.getLeft(), x - spacing, y + 100, spacing / 2);
//            }
//            if (node.getRight() != null) {
//                drawConnection(gc, x, y, x + spacing, y + 100);
//                drawNode(gc, node.getRight(), x + spacing, y + 100, spacing / 2);
//            }
//        }
//    }
//
//    private void drawConnection(GraphicsContext gc, double startX, double startY, double endX, double endY) {
//        gc.setStroke(Color.BLACK);
//        gc.setLineWidth(2);
//        gc.strokeLine(startX, startY, endX, endY);
//    }
}


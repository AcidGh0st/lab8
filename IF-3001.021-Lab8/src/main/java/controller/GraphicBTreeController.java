package controller;

import domain.BTree;
import domain.BTreeNode;
import domain.TreeException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class GraphicBTreeController {

    @FXML
    private Button randomizeButton;

    @FXML
    private Button levelsButton;

    @FXML
    private Button tourInfoButton;

    private BTree binaryTree;
    @FXML
    private TextArea tourInfoTextArea;
    @FXML
    private Canvas canvas;
    @FXML
    private Pane treePane;

    @FXML
    private void initialize() {
        binaryTree = new BTree();
    }

    @FXML
    public void levelsOnAction(ActionEvent actionEvent) {
        try {
            int height = binaryTree.height();
            String levels = "";
            for (int i = 0; i <= height; i++) {
                levels += i + "\n";
            }
            tourInfoTextArea.setText(levels);
        } catch (TreeException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void randomizeOnAction(ActionEvent actionEvent) {
        binaryTree.clear();
        for (int i = 0; i < 10; i++) {
            binaryTree.add(util.Utility.getRandom(100)); // Agrega números aleatorios al árbol
        }
        drawTree();
    }

    @FXML
    public void tourInfoOnAction(ActionEvent actionEvent) {
        displayTreeInfo();
    }

    private void displayTreeInfo() {
        int height = 0;
        try {
            height = binaryTree.height();
            String info = "Tree Height: " + height + "\n";
            info += "PreOrder: " + binaryTree.preOrder() + "\n";
            info += "InOrder: " + binaryTree.inOrder() + "\n";
            info += "PostOrder: " + binaryTree.postOrder() + "\n";
            tourInfoTextArea.setText(info);
        } catch (TreeException e) {
            throw new RuntimeException(e);
        }

    }

    private void drawTree() {
        treePane.getChildren().clear();
        Canvas canvas = new Canvas(treePane.getWidth(), treePane.getHeight());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawNode(gc, binaryTree.getRoot(), treePane.getWidth() / 2, 50, 50);
        treePane.getChildren().add(canvas);
    }

    private void drawNode(GraphicsContext gc, BTreeNode node, double x, double y, double spacing) {
        if (node != null) {
            gc.setFill(Color.WHITE);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2);
            gc.fillOval(x - 25, y - 25, 50, 50);
            gc.strokeOval(x - 25, y - 25, 50, 50);
            gc.setFill(Color.BLACK);
            gc.fillText(node.getData().toString(), x - 5, y + 5);

            if (node.getLeft() != null) {
                drawConnection(gc, x, y, x - spacing, y + 100);
                drawNode(gc, node.getLeft(), x - spacing, y + 100, spacing * 1.5); // Aumenta la separación horizontal
            }
            if (node.getRight() != null) {
                drawConnection(gc, x, y, x + spacing, y + 100);
                drawNode(gc, node.getRight(), x + spacing, y + 100, spacing * 1.5); // Aumenta la separación horizontal
            }
        }
    }


    private void drawConnection(GraphicsContext gc, double startX, double startY, double endX, double endY) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(startX, startY, endX, endY);
    }
}

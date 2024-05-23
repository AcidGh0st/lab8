package controller;

import domain.BTree;
import domain.BTreeNode;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class TransversalTourController {

    @javafx.fxml.FXML
    private Canvas canvas;
    @javafx.fxml.FXML
    private Pane drawTreePane;
    @javafx.fxml.FXML
    private Button randomizeButton;
    @javafx.fxml.FXML
    private Button inOrderButton;
    @javafx.fxml.FXML
    private Button preOrderButton;
    @javafx.fxml.FXML
    private Button postOrderButton;
    private BTree binaryTree;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
        binaryTree = new BTree();
    }

    @javafx.fxml.FXML
    public void randomizeOnAction(ActionEvent actionEvent) {
        inOrderButton.setDisable(false);
        postOrderButton.setDisable(false);
        preOrderButton.setDisable(false);
        drawTreePane.setVisible(true);
        binaryTree.clear();
        for (int i = 0; i < 10; i++) {
            binaryTree.add(util.Utility.getRandom(100));
        }
        drawTree(); // Dibuja el árbol
    }


    @javafx.fxml.FXML
    public void postOrderOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void inOrderOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void preOrderOnAction(ActionEvent actionEvent) {
    }

    private void drawTree() {
        drawTreePane.getChildren().clear();
        canvas = new Canvas(drawTreePane.getWidth(), drawTreePane.getHeight());
        GraphicsContext gC = canvas.getGraphicsContext2D();
        drawNode(gC, binaryTree.getRoot(), drawTreePane.getWidth() / 2, 50, 150); // ajusta el espaciado horizontal
        drawTreePane.getChildren().add(canvas);
    }
    private void drawNode(GraphicsContext gc, BTreeNode node, double x, double y, double spacing) {
        if (node != null) {
            if (node.getLeft() != null) {
                double childX = x - spacing;
                double childY = y + 100;
                drawConnection(gc, x, y, childX, childY);
                drawNode(gc, node.getLeft(), childX, childY, spacing * 0.75); // ajusta el espacio horizontal
            }
            if (node.getRight() != null) {
                double childX = x + spacing;
                double childY = y + 100;
                drawConnection(gc, x, y, childX, childY);
                drawNode(gc, node.getRight(), childX, childY, spacing * 0.75); // ajusta el espacio horizontal
            }
            gc.setFill(Color.WHITE);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2);
            gc.fillOval(x - 25, y - 25, 50, 50);
            gc.strokeOval(x - 25, y - 25, 50, 50);
            gc.setFill(Color.BLACK);
            gc.fillText(node.getData().toString(), x - 5, y + 5);
        }
    }

    private void drawConnection(GraphicsContext gc, double startX, double startY, double endX, double endY) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(startX, startY, endX, endY);
    }
}
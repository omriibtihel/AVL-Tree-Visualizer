package org.openjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;


public class Controller {

    @FXML
    private Text Titre;

    @FXML
    private TextField input_field;

    @FXML
    private Button insert;

    @FXML
    private Button delete;

    @FXML
    private Button search;

    @FXML
    private AnchorPane displayPane;

    @FXML
    private TextArea message;

    private AVL_Tree tree = new AVL_Tree();

    @FXML
    public void initialize() {
        insert.setOnAction(e -> handleInsert());
        delete.setOnAction(e -> handleDelete());
        search.setOnAction(e -> handleSearch());
    }

    private void handleInsert() {
        int value = Integer.parseInt(input_field.getText());
        tree.root = tree.insertNode(tree.root, value);
        displayTree(tree.root);
    }

    private void handleDelete() {
        int value = Integer.parseInt(input_field.getText());
        tree.root = tree.deleteNode(tree.root, value);
        displayTree(tree.root);
    }

    private void handleSearch() {
        int value = Integer.parseInt(input_field.getText());
        AVL_Tree.Node result = tree.search(tree.root, value);
        if (result == null) {
            message.setText(value + " not found in the tree.");
        } else {
            message.setText(value + " found in the tree.");
        }
    }

    private void displayTree(AVL_Tree.Node node) {
        displayPane.getChildren().clear();
        displayNode(node, displayPane.getWidth() / 2, 50, displayPane.getWidth() / 4);
    }

    private void displayNode(AVL_Tree.Node node, double x, double y, double offset) {
        if (node != null) {
            Circle circle = new Circle(x, y, 20);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.DARKBLUE);
            circle.setStrokeWidth(2);
            Text text = new Text(x - 5, y + 5, String.valueOf(node.key));
            displayPane.getChildren().addAll(circle, text);
    
            if (node.left != null) {
                double childX = x - offset;
                double childY = y + 50;
                Line lineToLeft = new Line(x-20, y, childX, childY);
                lineToLeft.setStrokeWidth(2.0);
                lineToLeft.setStroke(Color.DARKBLUE);
                displayPane.getChildren().add(lineToLeft);
                displayNode(node.left, childX, childY, offset / 2);
            }
            if (node.right != null) {
                double childX = x + offset;
                double childY = y + 50;
                Line lineToRight = new Line(x+20, y, childX, childY);
                lineToRight.setStrokeWidth(2.0);
                lineToRight.setStroke(Color.DARKBLUE);
                displayPane.getChildren().add(lineToRight);
                displayNode(node.right, childX, childY, offset / 2);
            }
        }
    }
    
}

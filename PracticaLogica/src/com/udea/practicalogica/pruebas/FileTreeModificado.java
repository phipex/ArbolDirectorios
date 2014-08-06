package com.udea.practicalogica.pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collections;
import java.util.Vector;
 
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
 
/**
 * Display a file system in a JTree view
 * 
 * @version $Id: FileTree.java,v 1.9 2004/02/23 03:39:22 ian Exp $
 * @author Ian Darwin
 */
public class FileTreeModificado extends JPanel implements ActionListener{
  
   private int newNodeSuffix = 1;
   private static final String ADD_COMMAND = "agregar";
   private static final String REMOVE_COMMAND = "remover";
   private static final String CLEAR_COMMAND = "limpiar"; 
   private static final String RENAME_COMMAND = "renombrar";
   private static final String MOVE_COMMAND = "mover";
   
    
    
    /** Construct a FileTree */
  public FileTreeModificado(File dir) {
    
    setLayout(new BorderLayout());
 
    // Make a tree list with all the nodes, and make it a JTree
    JTree tree = new JTree(addNodes(null, dir));
 
    // Add a listener
    tree.addTreeSelectionListener(new TreeSelectionListener() {
      public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) e
            .getPath().getLastPathComponent();
        System.out.println("You selected " + node);
      }
    });
 
    JButton addButton = new JButton(ADD_COMMAND);
        addButton.setActionCommand(ADD_COMMAND);
        addButton.addActionListener(this);
        
        JButton removeButton = new JButton(REMOVE_COMMAND);
        removeButton.setActionCommand(REMOVE_COMMAND);
        removeButton.addActionListener(this);
        
        JButton clearButton = new JButton(CLEAR_COMMAND);
        clearButton.setActionCommand(CLEAR_COMMAND);
        clearButton.addActionListener(this);
    
        JButton renameButton = new JButton(RENAME_COMMAND);
        renameButton.setActionCommand(RENAME_COMMAND);
        renameButton.addActionListener(this);
        
        JButton moveButton = new JButton(MOVE_COMMAND);
        moveButton.setActionCommand(MOVE_COMMAND);
        moveButton.addActionListener(this);
        
        
    // Lastly, put the JTree into a JScrollPane.
    JScrollPane scrollpane = new JScrollPane();
    scrollpane.getViewport().add(tree);
    add(BorderLayout.CENTER, scrollpane);
    
    JPanel panel = new JPanel(new GridLayout(2,3));
        panel.add(addButton);
        panel.add(removeButton); 
        panel.add(clearButton);
        panel.add(moveButton);
        panel.add(renameButton); 
        
	add(panel, BorderLayout.SOUTH);
  }
 
  /** Add nodes from under "dir" into curTop. Highly recursive. */
  DefaultMutableTreeNode addNodes(DefaultMutableTreeNode curTop, File dir) {
    String curPath = dir.getPath();
      System.out.println("dir:"+curPath);
    DefaultMutableTreeNode curDir = new DefaultMutableTreeNode(curPath);
    if (curTop != null) { // should only be null at root
      curTop.add(curDir);
    }
    Vector ol = new Vector();
    String[] tmp = dir.list();
      System.out.println("tmp:"+tmp);
    if(tmp == null){
        return null;
    }  
      
    for (int i = 0; i < tmp.length; i++)
      ol.addElement(tmp[i]);
    Collections.sort(ol, String.CASE_INSENSITIVE_ORDER);
    File f;
    Vector files = new Vector();
    // Make two passes, one for Dirs and one for Files. This is #1.
    for (int i = 0; i < ol.size(); i++) {
      String thisObject = (String) ol.elementAt(i);
      String newPath;
      if (curPath.equals("."))
        newPath = thisObject;
      else
        newPath = curPath + File.separator + thisObject;
      if ((f = new File(newPath)).isDirectory())
        addNodes(curDir, f);
      else
        files.addElement(thisObject);
    }
    // Pass two: for files.
    for (int fnum = 0; fnum < files.size(); fnum++)
      curDir.add(new DefaultMutableTreeNode(files.elementAt(fnum)));
    return curDir;
  }
 
  public Dimension getMinimumSize() {
    return new Dimension(200, 400);
  }
 
  public Dimension getPreferredSize() {
    return new Dimension(200, 400);
  }
 
  /** Main: make a Frame, add a FileTree */
  public static void main(String[] av) {
 
    JFrame frame = new JFrame("FileTree");
    frame.setForeground(Color.black);
    frame.setBackground(Color.lightGray);
    Container cp = frame.getContentPane();
 
    if (av.length == 0) {
      cp.add(new FileTreeModificado(new File("e:\\")));
    } else {
      cp.setLayout(new BoxLayout(cp, BoxLayout.X_AXIS));
      for (int i = 0; i < av.length; i++)
        cp.add(new FileTreeModificado(new File(av[i])));
    }
 
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (ADD_COMMAND.equals(command)) {
            //Add button clicked
            //treePanel.addObject("New Node " + newNodeSuffix++);
            System.out.println("add");
        } else if (REMOVE_COMMAND.equals(command)) {
            //Remove button clicked
            //treePanel.removeCurrentNode();
            System.out.println("remove");
        } else if (CLEAR_COMMAND.equals(command)) {
            //Clear button clicked.
            //treePanel.clear();
            System.out.println("clear");
        }
    }
}
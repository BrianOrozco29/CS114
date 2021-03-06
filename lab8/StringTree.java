package lab8;

//********************************************************************
//  StringTree.java     
//
//********************************************************************

import java.util.*;

public class StringTree
{
    private Node root;

    //----------------------------------------------------------------
    // Creates an initially empty tree.
    //----------------------------------------------------------------
    public StringTree()
    {
        root = null;
    }

    //----------------------------------------------------------------
    // Adds a string to the tree.
    //----------------------------------------------------------------
    public void addString (String str)
    {
        root = addStringToSubTree(str, root);
    }

    //----------------------------------------------------------------
    // Adds a string to the subtree with the given root node
    //----------------------------------------------------------------
    private Node addStringToSubTree (String str, Node node)
    {
        Node result = node;
        if (node == null)
            result = new Node(str);

        // If the new string comes before the string in the node, add
        // the new string to the left child. Otherwise, add it to the
        // right child.
        else
        if (str.compareTo(node.value) < 0)
            node.left = addStringToSubTree(str, node.left);
        else
            node.right = addStringToSubTree(str, node.right);

        return result;
    }

    //----------------------------------------------------------------
    // Prints the result of a depth-first traversal of the tree using
    // recursion.
    //----------------------------------------------------------------
    public void traverseWithRecursion()
    {
        traverseWithRecursion(root);
    }

    //----------------------------------------------------------------
    //  Prints the elements in the specified tree using recursion.
    //----------------------------------------------------------------
    private void traverseWithRecursion (Node node)
    {
        if (node != null)
        {
            traverseWithRecursion (node.left);

            System.out.println (node.value);

            traverseWithRecursion (node.right);
        }
    }

    //******************************* part c *************************************
    public void inTraverseWithStack(Node rt)
    {
        Node temp = rt;
        if(rt == null)
            return;

        Stack<Node> st = new Stack<Node>();
        while(!(st.isEmpty()) || temp!= null)
        {
            if(temp != null)
            {
                st.push(temp);
                temp = temp.left;
            }
            else
            {
                temp = st.pop();
                temp = temp.right;
            }
        }
    }
}
//********************************************************************
//  Node for a binary tree of Strings.
//********************************************************************
class Node
{
    public String value;
    public Node left;
    public Node right;

    public Node (String value)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

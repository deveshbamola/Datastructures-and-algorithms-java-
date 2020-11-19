import java.util.ArrayList;
import java.util.Stack;

class GenericTree
{
	private static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
		
		public void display(Node root)
		{
			System.out.print(root.data + "->");
			for(Node node : root.children)
				System.out.print(node.data + "->");
			System.out.println();
			for(Node node : root.children)
				display(node);
		}
		
		public int countNode(Node root)
		{
			int count = 0;
			if(root != null)
				count++;
			for(Node chile: root.children)
				count = count + countNode(chile);
			return count;
		}
		
		public int maxNode(Node root)
		{
			int max = root.data;
			for(Node child : root.children)
			{
				if(max < child.data)
					max = child.data;
			}
			
			for(Node child : root.children)
			{
				if(max < maxNode(child))
					max = maxNode(child);
			}
			return max;
		}
		
		public int minNode(Node root)
		{
			int min = root.data;
			for(Node child : root.children)
			{
				if(min > child.data)
					min = child.data;
			}
			
			for(Node child : root.children)
			{
				if(min > minNode(child))
					min = minNode(child);
			}
			
			return min;
		}
		
		public int heightEdge(Node root)
		{
			int height = -1;
			for(Node child : root.children)
			{
				int n = heightEdge(child);
				if(n > height)
					height = n;
			}
			height++;
			return height;
			
		}
	}
	
	private Node root;
	
	public void makeTree(int[] arr)
	{
		Stack<Node> stack = new Stack<>();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == -1)
				stack.pop();
			else
			{
				Node node = new Node();
				node.data = arr[i];
				if(stack.size() > 0)
					stack.peek().children.add(node);
				else
					root = node;
				stack.push(node);
			}
		}
	}
	
	public void display()
	{
		root.display(root);
	}
	
	public void countNode()
	{
		int size = root.countNode(root);
		System.out.println(size);
	}
	
	public void maxNode()
	{
		int max = root.maxNode(root);
		System.out.println("Node with max value is : " + max);
	}
	
	public void minNode()
	{
		int min = root.minNode(root);
		System.out.println("Node with min value is : " + min);
	}
	
	public void heightEdge()
	{
		int height = root.heightEdge(root);
		System.out.println("Height of the tree is : " + height);
	}
	
	public static void main(String[] args)
	{
		GenericTree tree = new GenericTree();
		int[] arr = {100,80,10,-1,60,-1,500,-1,120,-1,-1,90,200,-1,2000,105,-1,-1,-1,-1};
		
		tree.makeTree(arr);
		tree.display();
		tree.countNode();
		tree.maxNode();
		tree.minNode();
		tree.heightEdge();
	}
}


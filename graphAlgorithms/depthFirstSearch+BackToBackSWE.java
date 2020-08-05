public static void dfs(Node start){
    Stack<Integer> stack = new Stack<>();
    
    Set<Node> seen = new HashSet<>();
    // Choose Data Structure here!

    stack.push(start);
    // Adding start to the stack

    while(!stack.isEmpty()){
        Node curr = stack.pop();
        // Pull the current Node

        if(!seen.contains(curr)){
            seen.add(curr);
            System.out.println(curr);
        }
        // Process if not seen

        for(Node adjacent : curr.adjacents){
            if(!seen.contains(adjacent)){
                stack.push(adjacent);
            }
        }
        // Adding Children
    }
}
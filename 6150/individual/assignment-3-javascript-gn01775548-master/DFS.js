var arr = [9,6,3,8,12,15]

var tree = new BinarySearchTree()
arr.map(item => {
    tree.insert(item)
})
tree.inOrderTraverse()
tree.preOrderTraverse()
tree.postOrderTraverse()


function BinarySearchTree () {
    var Node = function(key) {
        this.key = key,
        this.left = null,
        this.right = null
    }
    var root = null
    
    
    this.insert = function(key) {
        var newNode = new Node(key)
        if(root === null) {
            root = newNode
        } else {
            insertNode(root, newNode)
        }
    }
    var insertNode = function(node, newNode) {
        if (newNode.key <= node.key) {
            if (node.left === null) {
                node.left = newNode
            }else {
                insertNode(node.left, newNode)
            }
        }else {
            if (node.right === null) {
                node.right = newNode
            }else {
                insertNode(node.right, newNode)
            }
        }
    } 
    
   
    this.inOrderTraverse = function() {
        console.log('Inorder Traverse: ')
        inOrderTraverseNode(root)
        
    }
    var inOrderTraverseNode = function(node) {
        if (node !== null) {
            inOrderTraverseNode(node.left)
            console.log(node.key)
            inOrderTraverseNode(node.right)
        }
    }
    
    this.preOrderTraverse = function() {
        console.log('Preorder Traverse: ')
        preOrderTraverseNode(root)
    }
    var preOrderTraverseNode = function(node) {
        if (node !== null) {
            console.log(node.key)
            preOrderTraverseNode(node.left)
            preOrderTraverseNode(node.right)
        }
    }

   
    
    this.postOrderTraverse = function() {
        console.log('Postorder Traverse: ')
        postOrderTraverseNode(root)
    }
    
    var postOrderTraverseNode = function(node) {
        if (node !== null) {
            postOrderTraverseNode(node.left)
            postOrderTraverseNode(node.right)
            console.log(node.key)
        }
    }
}
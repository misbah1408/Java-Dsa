# AVL Tree

## Overview
An AVL tree is a self-balancing binary search tree (BST) named after its inventors, Georgy Adelson-Velsky and Evgenii Landis, who introduced it in 1962. In an AVL tree, the heights of the two child subtrees of any node differ by at most one, ensuring that the tree remains approximately balanced at all times. This balance condition ensures that the operations of insertion, deletion, and lookup all run in O(log n) time, where n is the number of nodes in the tree.

## Key Features

1. **Self-balancing**: AVL trees maintain their balance by performing rotations during insertions and deletions, ensuring the tree height remains logarithmic relative to the number of nodes.
2. **Binary Search Tree Property**: Like all BSTs, AVL trees maintain the property that for any given node, all values in its left subtree are smaller, and all values in its right subtree are larger.
3. **Rotations**: AVL trees use four types of rotations to maintain balance:
   - **Right Rotation (RR)**
   - **Left Rotation (LL)**
   - **Left-Right Rotation (LR)**
   - **Right-Left Rotation (RL)**
4. **Height-Balanced**: The balance factor of each node (the difference in heights of the left and right subtrees) is always between -1 and 1.

## Operations

### Insertion
When inserting a new node, the tree may become unbalanced. To restore balance, rotations are applied:
- If the balance factor is greater than 1 or less than -1 after insertion, appropriate rotations (single or double) are performed to balance the tree.

### Deletion
When deleting a node, the tree may become unbalanced. Similar to insertion, rotations are applied to restore balance:
- After deletion, the balance factor of each node is checked, and appropriate rotations are performed to ensure the tree remains balanced.

### Search
Searching for a value in an AVL tree follows the same procedure as a standard BST. The balanced nature of AVL trees ensures that the search operation has a time complexity of O(log n).

## Rotations

### Right Rotation (RR)
Performed when a left-heavy subtree needs to be balanced.
```
      y                            x
     / \     Right Rotation      / \
    x   T3   – – – – – – – >    T1  y 
   / \                           /  \
  T1  T2                        T2   T3
```

### Left Rotation (LL)
Performed when a right-heavy subtree needs to be balanced.
```
     x                             y
    /  \     Left Rotation       /  \
   T1   y   – – – – – – – >     x   T3
      /  \                      / \
     T2   T3                   T1  T2
```

### Left-Right Rotation (LR)
Performed when a left-heavy subtree of a right-heavy subtree needs to be balanced.
```
     z                             z                             x
    / \                           / \                          /  \
   y   T4  Left Rotation (y)    x   T4  Right Rotation (z)    y    z
  / \      – – – – – – – – – > /  \      – – – – – – – – >   / \   / \
 T1   x                       y    T3                      T1  T2 T3  T4
     / \                     / \
   T2   T3                 T1   T2
```

### Right-Left Rotation (RL)
Performed when a right-heavy subtree of a left-heavy subtree needs to be balanced.
```
   z                            z                            x
  / \                          / \                          /  \
T1   y   Right Rotation (y)  T1   x   Left Rotation (z)   z    y
    /  \  – – – – – – – – – >   /  \  – – – – – – – – >  / \   / \
   x   T4                     T2   y                    T1  T2 T3  T4
  / \                               /  \
T2   T3                           T3   T4
```

## Applications
- **Databases**: AVL trees are used in databases for indexing to maintain a balanced tree for fast search, insertion, and deletion operations.
- **Memory Management**: Used in memory management to allocate and deallocate memory blocks.
- **Telecommunication Networks**: Employed in networking to efficiently route data by maintaining balanced routing tables.

## Advantages
- Ensures O(log n) time complexity for search, insert, and delete operations.
- Prevents the degradation of performance that can occur in unbalanced trees.

## Disadvantages
- Slightly more complex to implement than a simple binary search tree due to the need for rotations.
- Requires extra memory for storing balance factors or heights of nodes.

## Conclusion
AVL trees are a powerful data structure for maintaining a balanced binary search tree. By ensuring that the tree remains balanced, AVL trees provide efficient performance for dynamic set operations, making them ideal for a variety of applications where balanced data retrieval and updates are essential.
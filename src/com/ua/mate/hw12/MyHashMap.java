package com.ua.mate.hw12;

public class MyHashMap<K, V> {
    Node<K, V>[] arrayNode;
    private final int DEFAULT_SIZE_ARRAY = 16;
    private int size;

    public MyHashMap() {
        this.arrayNode = (Node<K, V>[]) new Node[DEFAULT_SIZE_ARRAY];
    }

    public void put(K key, V value) {
        Node<K, V> node = new Node<>(hashCode(key), key, value, null);
        int index = node.hash % arrayNode.length;
        if (index < 0) {
            index *= -1;
        }
        if (arrayNode[index] == null) {
            arrayNode[index] = node;
            size++;
            return;
        }
        if (node.key == arrayNode[index].key) {
            if (node.equals(arrayNode[index])) {
                arrayNode[index] = node;
                return;
            }
            node.next = arrayNode[index];
            arrayNode[index] = node;
            size++;
            return;
        }
        resize((int)(arrayNode.length * 1.5));
    }

    public V remove(K key) throws ValueNotFoundException {
        // Create tmpNode in order to calculate the HashCode and determine the index in the array
        Node<K, V> tmpNode = new Node<>(hashCode(key), key, null, null);
        Node<K, V> previousNode, nextNode;
        int index = tmpNode.hash % arrayNode.length;
        if (index < 0) {
            index *= -1;
        }
        V result;
        if (arrayNode[index] != null) {
            do {
                previousNode = arrayNode[index];
                nextNode = arrayNode[index].next;
                if (previousNode.key == tmpNode.key) {
                    result = previousNode.value;
                    arrayNode[index] = nextNode;
                    size--;
                    return result;
                }
                if (nextNode != null) {
                    if (nextNode.key == tmpNode.key) {
                        result = nextNode.value;
                        previousNode.next = nextNode.next;
                        arrayNode[index] = previousNode;
                        size--;
                        return result;
                    }
                }
            } while (nextNode != null);
        }
        throw new ValueNotFoundException("Value not found");
    }

    public void clear() {
        this.arrayNode = (Node<K, V>[]) new Node[DEFAULT_SIZE_ARRAY];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) throws ValueNotFoundException {
        // Create tmpNode in order to calculate the HashCode and determine the index in the array
        Node<K, V> tmpNode = new Node<>(hashCode(key), key, null, null);
        int index = tmpNode.hash % arrayNode.length;
        if (arrayNode[index] != null) {
            do {
                if (arrayNode[index].key == tmpNode.key) {
                    return arrayNode[index].value;
                }
            } while (arrayNode[index].next != null);
        }
        throw new ValueNotFoundException("Value not found");
    }

    private int hashCode(Object key) {
        return key.hashCode();
    }

    private void resize(int newLength) {
        int index;
        int tmpSize = 0;
        Node<K, V>[] newArrayNode = new Node[newLength];
        for (int i = 0; i < arrayNode.length; i++) {
            if (arrayNode[i] != null) {
                Node<K, V> tmpNode = arrayNode[i];
                do {
                    index = tmpNode.hash % newLength;
                    if (newArrayNode[index] == null) {
                        newArrayNode[index] = tmpNode;
                        tmpSize++;
                    } else {
                        if (newArrayNode[index].key == tmpNode.key) {
                            if (tmpNode.equals(newArrayNode[index])) {
                                newArrayNode[index] = tmpNode;
                                tmpSize++;
                            }
                            tmpNode.next = newArrayNode[index];
                            newArrayNode[index] = tmpNode;
                            tmpSize++;
                        }
                    }
                }
                while (tmpNode.next != null);
            }
        }
        this.arrayNode = newArrayNode;
        size = tmpSize;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayNode.length; i++) {
            if (arrayNode[i] != null) {
                result.append(arrayNode[i].toString());
                while (arrayNode[i].next != null) {
                    result.append(", ").append(arrayNode[i].next.toString());
                }
            }
        }
        return result.toString();
    }
}

#include <iostream>
using namespace std;

class Node {
    int val;
    public : Node* next;

    public:
    Node(int key) {
        val = key;  
        next = nullptr;
    }
    int getVal() {
        return val;
    }
};


class Stack {
    // int top = -1;
    Node *head = nullptr;
    
    public :
    void push(int val) {
        Node *newNode = new Node(val);
        if (head == nullptr) {
            head = newNode;
            return;
        }
        newNode->next = head;
        head = newNode;        
    }

    void pop() {
        Node *ptr = head;
        head = head->next;
        delete(ptr);        
    }

    void printStack() {
        Node *ptr = head;
        while (ptr != nullptr) {
            cout << ptr->getVal();
            ptr = ptr->next;
        }
        cout << endl;
    }

    void isEmpty() {
        if (head == nullptr) {
            cout << "True" << endl;
        } else {
            cout << "False" << endl;
        }
    }
};

int main() {

    class Stack s;
    s.push(4);
    s.push(6);
    s.push(8);
    s.push(3);
    s.pop();
    s.push(5);
    s.pop(); 
    s.printStack();
    s.pop();
    s.pop();
    s.printStack();
    s.pop();
    s.printStack();

    s.isEmpty();

    return -1;    
}
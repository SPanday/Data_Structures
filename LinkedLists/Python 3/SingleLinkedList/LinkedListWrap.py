# -*- coding: utf-8 -*-
"""
Created on Sat Jun 23 08:54:12 2018

@author: Sakshi Panday

@Overview Wrapper Class for Linked List
"""
from Node import node

class LinkedListWrap(object):
    def __init__(self):
        self.head = None
        
    def setHead(self, headNode):
        self.head = headNode
        
    def getHead(self):
        return self.head
    
    '''
    This function adds a new node with the data passed to the single linked list
    '''
    def addNode(self, data):
        if self.getHead() == None:
            self.setHead(node(data))
        else:
            currentNode = self.getHead()
            while(currentNode.getNext() != None):
                currentNode = currentNode.getNext()
            currentNode.setNext(node(data))
        print("Added a new node:", data )
 
    '''
    This function deletes the node(s), with data same as value passed, from the single linked list
    '''    
    def deleteNodeByValue(self, value):
        response = ""
        foundCount = 0
        if self.getHead() == None:
            response = "Linked List is Empty!"
        else:
            currentNode = self.getHead()
            if currentNode.getData() == value and currentNode.getNext() == None:
                    self.setHead(self.getHead().getNext())
                    currentNode = self.getHead()
                    foundCount += 1
            else:
                while(currentNode.getNext() != None):
                    if currentNode.getData() == value and currentNode == self.getHead():
                        self.setHead(self.getHead().getNext())
                        currentNode = self.getHead()
                        foundCount += 1
                    elif currentNode.getNext().getData() == value:
                        foundCount += 1
                        currentNode.setNext(currentNode.getNext().getNext())
                    else:
                        currentNode = currentNode.getNext()
            response = "Number of nodes with value '" + str(value) + "' deleted: " + str(foundCount)
        return response
            
            
    def __repr__(self):
        if self.getHead() == None:
            return "Linked List is Empty!"
        currentNode = self.getHead()
        output = str(currentNode.getData())
        while(currentNode.nextLink != None):
            output += ' -> ' + str(currentNode.getNext().getData())
            currentNode = currentNode.getNext()
        return output
    
    def __str__(self):
        currentNode = self.getHead()
        output = str(currentNode.getData())
        while(currentNode.nextLink != None):
            output += ' ' + str(currentNode.getNext().getData())
            currentNode = currentNode.getNext()
        return output
# -*- coding: utf-8 -*-
"""
Created on Sat Jun 23 10:03:54 2018

@author: Sakshi Panday

@Overview
"""

from LinkedListWrap import LinkedListWrap as llw

newNumList = llw()
newNumList.addNode(1)
newNumList.addNode(1)
newNumList.addNode(4)
newNumList.addNode(1)
newNumList.addNode(3)
print(repr(newNumList))
print(newNumList.deleteNodeByValue(1))
print(repr(newNumList), '\n______________')

newWordList = llw()
newWordList.addNode("C")
newWordList.addNode("C++")
newWordList.addNode("Python")
newWordList.addNode("C")
newWordList.addNode("JAVA")
print(repr(newWordList))
print(newWordList.deleteNodeByValue("C"))
print(repr(newWordList))
newWordList.addNode("C")
print(repr(newWordList), '\n______________')

newEmptyList = llw()
newEmptyList.addNode("Empty")
print(repr(newEmptyList))
print(newEmptyList.deleteNodeByValue("Empty"))
print(repr(newEmptyList))
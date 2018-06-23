# -*- coding: utf-8 -*-
"""
Created on Sat Jun 23 08:39:59 2018

@author: Sakshi Panday

@Overview This is used to define Node for Single linked List
"""

class node(object):
    
    def __init__(self, data):
        self.nextLink = None
        self.data = data
        
    def getNext(self):
        return self.nextLink
    
    def getData(self):
        return self.data
    
    def setNext(self, newNextLink):
        self.nextLink = newNextLink
        
    def setData(self, newData):
        self.data = newData
class LeafElement:

    def __init__(self, name):
        self.name = name
        #self.level = super.level + 1
        ''''Takes the first positional argument and assigns to member variable "position".'''

    def showDetails(self, tab=0):
        print( '\t'*tab +"{self.name}")
        '''Prints the position of the child element.'''


class CompositeElement:

    def __init__(self, name):
        self.composite_name = name
        self.childs = []
        '''Takes the first positional argument and assigns to member 
         variable "position". Initializes a list of children elements.'''

    def add(self, child):
        self.childs.append(child)
        '''Adds the supplied child element to the list of children 
         elements "children".'''

    def remove(self, child):
        self.childs.remove(child)
        '''Removes the supplied child element from the list of 
        children elements "children".'''

    def showDetails(self, tab=0):
        print('\t'*tab + self.composite_name)
        for child in self.childs:
            child.showDetails(tab+1)
        '''Prints the details of the component element first. Then, 
        iterates over each of its children, prints their details by 
        calling their showDetails() method.'''

topLevelMenu = CompositeElement("GeneralManager")
subMenuItem1 = CompositeElement("Manager1")
subMenuItem2 = CompositeElement("Manager2")
subMenuItem11 = LeafElement("Developer11")
subMenuItem12 = LeafElement("Developer12")
subMenuItem21 = LeafElement("Developer21")
subMenuItem22 = LeafElement("Developer22")
subMenuItem1.add(subMenuItem11)
subMenuItem1.add(subMenuItem12)
subMenuItem2.add(subMenuItem22)
subMenuItem2.add(subMenuItem22)
topLevelMenu.add(subMenuItem1)
topLevelMenu.add(subMenuItem2)
topLevelMenu.showDetails()

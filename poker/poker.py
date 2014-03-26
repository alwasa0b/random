hand1=[[2, 'c'], [3, 'c'], [4, 'c'], [5, 'c'], [6, 'c']]
hand2=[[10, 'c'], [3, 'c'], [4, 'c'], [5, 'c'], [6, 'c']]
hand2=[[10, 'c'], [10, 'c'], [10, 'c'], [10, 'c'], [6, 'c']]

def isStraight(hand):
    for i in range(0,4):
        if hand[i][1]==hand[i+1][1] and hand[i][0]==(hand[i+1][0]-1):
                continue
        else:
            return False     
    return True
    
def isRoyalFlush(hand):  
    for i in range(0,4):
        if hand[i][1]==hand[i+1][1]:
                continue
        else:
            return False
    return True

def fourOfAkind(hand):  
    count = 0
    for i in range(0,4):
        if hand[i][0]==(hand[i+1][0]):
                count+=1
                if(count==3):
                    return True
                continue
        else:
            return False
        
def fulHouse(hand):  
    count = 0
    for i in range(0,4):
        if hand[i][0]==(hand[i+1][0]):
                count+=1
                if(count==3):
                    return True
                continue
        else:
            return False

          
print isStraight(hand1)
print isRoyalFlush(hand2)

print fourOfAkind(hand2)

print isStraight(hand2)
print isRoyalFlush(hand1)
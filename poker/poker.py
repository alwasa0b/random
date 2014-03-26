hand=[[2, 'c'], [3, 'c'], [4, 'c'], [5, 'c'], [6, 'c']]


def isStraight(hand):
    for i in range(0,4):
        if hand[i][1]==hand[i+1][1] and hand[i][0]==(hand[i+1][0]-1):
                continue
        else:
            return False
                  
    return True
    



def isRoyalFlush(hand):  
    for i in range(0,4):
        if hand[i][1]==hand[i+1][1] and hand[i][0]==(hand[i+1][0]-1):
                continue
        else:
            return False
                  
    return True
    
          
print isStraight(hand)
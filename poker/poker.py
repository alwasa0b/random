hand1=[['10', 'c'], ['j', 'c'], ['q', 'c'], ['k', 'c'], ['a', 'c']]
hand2=[[2, 'c'], [3, 'c'], [4, 'c'], [5, 'c'], [7, 'c']]
hand3=[[10, 'c'], [6, 'c'], [10, 'c'], [6, 'a'], [6, 'a']]

hand4=[[1, 'c'], [1, 'a'], [8, 'o'], [2, 'c'], [2, 'i']]
hand5=[[1, 'c'], [2, 'c'], [3, 'c'], [4, 'c'], [5, 'c']]
hand6=[[1, 'c'], [2, 'c'], [3, 'c'], [4, 'c'], [5, 'p']]
hand7=[[2, 'c'], [8, 'c'], [1, 'c'], [1, 'h'], [2, 'c']]
hand8=[[2, 'c'], [8, 'c'], [1, 'c'], [5, 'h'], [7, 'c']]
hand9=[[2, 'c'], [8, 'r'], [1, 'i'], [5, 'a'], [7, 'r']]
hand10=[[2, 'c'], [9, 'r'], [0, 'i'], [5, 'a'], [7, 'r']]

##Done  
def isRoyalFlush(hand):
    flush=['10','j','q','k','a']  
    suit=hand[0][1]
    for i in range(0,5):
        if hand[i][0] in flush and hand[i][1]==suit: 
                continue
        else:
            return False
    return True

##Done
def isStraightFlush(hand):
    suit=hand[0][1]
    for i in range(0,5):
        if hand[i][1]==suit:
            if i<4 and hand[i][0]!=(hand[i+1][0]-1):
                return False
        else:
            return False     
    return True

#Done
def fourOfAkind(hand):  
    count = 0
    hit=hand[0][0]
    for i in range(0,4):
        count=0
        for x in range(i+1,5):
            if hand[i][0]==(hand[x][0]):
                    count+=1
                    if(count==3):
                        return True
    return False

def fulHouse(hand):  
    count2 = 0
    count1 = 0
    counter=0
    for i in range(0,4):
        counter=0
        for x in range(i+1,5):
            if hand[i][0]==hand[x][0]:
                    counter+=1
                    if(counter==2 and count2!=2):
                        count2 = 2
                    elif (counter==1 and count1!=1):
                        count1 = 1  
                                                  
    if(count1==1 and count2==2):
        return True
    
    return False

#Done
def flush(hand):
        suit=hand[0][1]
        for i in range(0,5):
            if hand[i][1]==suit:
                continue
            else:
                return False
            
        if (isStraightFlush(hand)):
            return False
        
        return True
#Done
def isStraight(hand):
    for i in range(0,4):
        if hand[i][0]==(hand[i+1][0]-1):
                continue
        else:
            return False
    if (isStraightFlush(hand)):
            return False     
    return True

#Done
def threeOfAkind(hand):  
    count = 0
    for i in range(0,4):
        count=0
        for x in range(i+1,5):
            if hand[x][0]==hand[i][0]:
                count+=1
                if(count==2):
                    return True  
    return False

#Done        
def twoPair(hand):  
    count = 0
    for i in range(0,4):
        count=0
        for x in range(i+1,5):
            if hand[x][0]==hand[i][0]:
                count+=1
                if(count==1):
                    return True  
    return False

#Done
def pair(hand):  
    count = 0
    for i in range(0,4):
        count=0
        for x in range(i+1,5):
            if hand[x][1]==hand[i][1]:
                count+=1
                if(count==1):
                    return True  
    return False

#Done
def highCard(hand):  
    max=0
    for i in range(0,5):
        if max<hand[i][0]:
            max=hand[i][0]
    return max

        


print isRoyalFlush(hand1)
print isStraightFlush(hand2)
print
print fulHouse(hand3)
print fourOfAkind(hand4)

print flush(hand5)

print isStraight(hand6)

print threeOfAkind(hand7)
print twoPair(hand8)
print pair(hand9)
print highCard(hand10)
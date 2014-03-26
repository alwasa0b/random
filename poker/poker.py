hand=[[2, 'c'], [3, 'c'], [4, 'c'], [5, 'c'], [6, 'c']]


def isStraight(hand):
    count1=0
    count2=0
    
    for i in range(0,4):
        if hand[i][1]==hand[i+1][1]:
            count2+=1
            print hand[i+1][0]
        if hand[i][0]==(hand[i+1][0]-1):
            print hand[i+1][0]
            count1+=1            
    if(count1==4 and count2==4):
        return True
    else:
        return False

            
print isStraight(hand)
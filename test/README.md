```
#The function below takes a list. It then goes over it to look for duplicate values. 
#If duplicates are found the function returns them.

def function(a):    
    def f1(a, b):
        ## Create a dictionary key value pair to count the number of 
        ## times a number appears. For each iteration add one to the value field.
        a[b] = (a.get(b) or 0) + 1; 
        ## Returns key, value
        return a
    ## delete all keys that have a value of one. Only keep keys with values greater than 1
    return map(lambda a: a[0], filter(lambda a: not a[1] == 1, reduce(f1, a, {}).items())) 
```



```
def function2(a):
    ##list to hold all numbers duplicates and unique.
    notDuplicateList=[] 
    ##list to hold the duplicate numbers
    duplicateList=[]
    
    ##iterate over the given list
    for number in a:
        ## if the number has not been added before append it to notDuplicateList list 
        if number not in notDuplicateList: 
            notDuplicateList.append(number) 
        else:
            ## the number is a duplicate so append to duplicateList
            if number not in duplicateList: 
                    duplicateList.append(number)           
    
    ## return sorted duplicateList            
    return sorted(duplicateList)
```











input:
```
a=[9,9,2,2,5,5,8,8,1,1,5,2,2,5,1]
b=[9,9,2,2,5,5,1,1,5,2,2,5,1,50,50,8,8,10,10,12,12]
c=[1,9,9,1]
d=[1,8,8,1]

print 'function(a) : ', function(a)
print 'function2(a): ', function2(a)


print 'function(b) : ', function(b)
print 'function2(b): ',function2(b)

print 'function(c) : ',function(c)
print 'function2(c): ',function2(c)

print 'function(d) : ',function(d)
print 'function2(d): ',function2(d)
```

output:

```
function(a) :  [8, 9, 2, 5, 1]
function2(a):  [1, 2, 5, 8, 9]

function(b) :  [1, 2, 5, 8, 9, 10, 12, 50]
function2(b):  [1, 2, 5, 8, 9, 10, 12, 50]

function(c) :  [1, 9]
function2(c):  [1, 9]

function(d) :  [8, 1]
function2(d):  [1, 8]

```

My understanding is that the function is returning the duplicate values. It does not care about the order in which those values are returned. Please let me know if it's intended for the function to return the values in this order.

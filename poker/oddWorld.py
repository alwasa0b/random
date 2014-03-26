def fun():
    s='whats the matter with kansas.'.split()
    nw=''
    n=''
    for i in s:
        if len(i)%2!=0:
            nw=''
            for c in xrange(len(i)-1,-1,-1):
                nw+=i[c]
            n+=nw
        else:
            n+=i
                
    print n
fun()
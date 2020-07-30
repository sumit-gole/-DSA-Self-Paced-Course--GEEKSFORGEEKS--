#User function Template for python3

def _push(a,n):
    # code here

    stack = []
    min_el = a[0]
    for i in range(0,n):
        if min_el > a[i]:
            min_el = a[i]
        stack.append(min_el)
    return stack
    
    
def _getMinAtPop(stack,n):
    # code here
    n = len(stack)
    while n > 0:
        print (stack.pop(),end = " ")
        n -= 1
        
        

__author__ = 'ranaf'
def isValidPair(left, right):
    if left == '(' and right == ')':
        return True
    if left == '[' and right == ']':
        return True
    if left == '{' and right == '}':
        return True
    return False

def solution(S):
    stack = []

    for symbol in S:
        if symbol == '[' or symbol == '{' or symbol == '(':
            stack.append(symbol)
        else:
            if len(stack) == 0:
                print("NO")
            last = stack.pop()
            if not isValidPair(last, symbol):
                print("NO")

    if len(stack) != 0:
        print("NO")
    else:
        print("YES")
testCases = int(input())
i=0
x=[]
while i<testCases:
    x.append(input())
    i=i+1
for m in range(0,testCases):
    result = solution(x[m])
    


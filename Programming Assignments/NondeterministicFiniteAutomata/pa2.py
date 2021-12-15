def nfa_eclosure(M, s):
    visited = {s}
    queue = [s]
    while queue:
        current = queue.pop(0)
        for transition in M[current].keys():
            if len(transition) == 0:
                for element in M[current][transition]:
                    if element not in visited:
                        queue.append(element)
                        visited.update(M[current][transition])

    return visited


def nfa_accepts(M, A, x):
    
    currentState = {0}

    if x == '':
        currentState.update(nfa_eclosure(M, 0))
    else:
        for letter in x:
            newState = currentState.copy()
            for element in currentState:
                newState.update(nfa_eclosure(M, element))
            if len(currentState) == 0:
                return False
            else:
                for element in currentState:
                    if M[element].get(letter) != None:
                        newState.remove(element)
                        newState.update(M[element].get(letter))
            currentState = newState.copy()
            
    for element in currentState:
        for state in A:
            if (element == state):
                return True
    return False
        
        
        
        

        
        
            
        
        

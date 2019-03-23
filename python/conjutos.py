'''global vetor
vetor = []
for i in range(15):
    vetor.append([i])


def juntar(a:int, b:int):
    if a != b:
        for i in vetor[b:b + 1]:
            for j in i:
                vetor[a].append(j)
        vetor[b] = vetor[a]


juntar(1, 2)
print(vetor)
juntar(3, 2)
print(vetor)
juntar(4, 5)
print(vetor)
juntar(5, 1)
print(vetor)'''

def fat(x:int)->int:
    if(x == 0):
        return 1
    return x * fat(x - 1)
print(fat(1000))
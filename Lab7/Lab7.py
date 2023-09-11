import sys
rows_num = int(input("Введіть розмір квадратної матриці: "))
lst = []
filler = input("Введіть символ-заповнювач: ")

# цикл який виводить завдання під варіантом №10
for i in range(rows_num):
    lst.append([])

    # цикл який виводить пропуски
    for k in range(rows_num - i):
        print(' ', end='\t')

    # цикл який виводить масив
    for j in range(i+1):
        if len(filler) == 1:
            lst[i].append(ord(filler))
            print(chr(lst[i][j]), end="\t")
        elif len(filler) == 0:
            print("Не введено символ-заповнювач")
            sys.exit(1)
        else:
            print("Забагато символів-заповнювачів")
            sys.exit(1)
    # вивід нового рядка
    print()


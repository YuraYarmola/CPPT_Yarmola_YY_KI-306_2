# import modules
import math
import pickle


# exception class
class BadOption(Exception):
    pass

#main calculate function
def calculate_expression(x):
    try:
        ctg_x = 1 / math.tan(x)
        result = math.cos(x) / (x + 2 * ctg_x)
        return result
    except ZeroDivisionError:
        print("Error: Division by zero")
        return None

# get x from text
def get_from_text_file(filename):
    with open(filename, 'r') as file:
        data = file.readline()
        return float(data)

# save result to file
def save_to_text_file(filename, x, result):
    with open(filename, "w") as file:
        file.write(f"x = {x}\n")
        file.write(f"Result = {result}\n")

# save result to binary file
def save_to_binary_file(filename, x, result):
    data = {"x": x, "result": result}
    with open(filename, "wb") as file:
        pickle.dump(data, file)

# main block
if __name__ == "__main__":
    option = int(input("1 - From file\n2 - From console\nYour choose: "))
    if option == 2:
        x = float(input("Enter the value of x: "))
    elif option == 1:
        x = get_from_text_file('input.txt')
    else:
        raise BadOption
    result = calculate_expression(x)

    if result is not None:
        save_to_text_file("result.txt", x, result)
        save_to_binary_file("result.bin", x, result)
        print("Result: " + str(result))
        print("Results saved to 'result.txt' and 'result.bin'.")

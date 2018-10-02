def linear_search(arr, key, size):
    for i in range(size):
        if(arr[i] == key):
            return i
    return -1

if __name__ == "__main__":
    print("Enter the array")
    arr = [int(x) for x in input().split(' ')]
    key = int(input("Enter the key to search: "))
    pos = linear_search(arr, key, len(arr))
    if(pos < 0):
        print("Key was not found in the array")
    else:
        print("Key (", key, ") was found at location (", pos, ') in your array')

def BinarySearch(arr, x):
    low = 0
    high = len(arr) - 1
    mid = 0

    while low <= high:

        mid = (high + low) // 2

        # If x is greater, ignore left half
        if arr[mid] < x:
            low = mid + 1

        # If x is smaller, ignore right half
        elif arr[mid] > x:
            high = mid - 1

        # means x is present at mid
        else:
            return mid+1

    # If we reach here, then the element was not present
    return -1


if __name__ == "__main__":
    ar = [1, 2, 3, 5, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20]
    k = 1
    print(BinarySearch(ar, k))

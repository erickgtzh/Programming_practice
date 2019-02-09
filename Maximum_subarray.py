nums = [8,-19,5,-4,20]

def maxSubArray(nums):
    suma = 0
    mayor = -2147483647
    
    
    #----------------Test---------------#
    #suma    = 8, -11, -6, 5, 1, 21
    #sum_max = 8, -11, 5, 1, 21
    #mayor   = 8, 21
    # i                  .
    #nums = [8,-19,5,-4,20]
    for i in range(len(nums)):
        suma += nums[i]
        if(nums[i]>suma):
            suma = nums[i]   
        if(suma>mayor):
            mayor = suma
    return mayor
        
print(maxSubArray(nums))

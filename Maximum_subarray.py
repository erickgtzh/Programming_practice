nums = [-2,1,-3,4,-1,2,1,-5,4]

def maxSubArray(self,nums):
    sum_max = 0
    suma = 0
    mayor = -2147483647
    
    for i in range(len(nums)):
        suma += nums[i]
        if(nums[i]>suma):
            suma = nums[i]           
        sum_max = suma       
        if(sum_max>mayor):
            mayor = sum_max
    return mayor
        
print(maxSubArray(nums))

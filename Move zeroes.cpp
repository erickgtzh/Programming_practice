class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int cont = 0;
        int aux = 0;

        for(int i=0;i<nums.size();i++){
            if(nums[i] != 0){
                nums[cont] = nums[i];
                cont++;
            }
            else
                aux++;
        }

        for(int i=0;i<aux;i++){
            nums[i+cont] = 0;
        }

        for(int i=0;i<nums.size();i++){
            cout << nums[i] << endl;
        }
    }
};

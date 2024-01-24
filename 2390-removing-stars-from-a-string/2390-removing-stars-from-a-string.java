class Solution{
    public String removeStars(String s){
        char[] arr = s.toCharArray();
        int ind = 0;

        for (int i = 0; i < s.length(); i++){
            if (arr[i] == '*'){
                ind--;
            }
            else {
                arr[ind] = arr[i];
                ind++;
            }
        }

        return new String(arr, 0, ind);
    }
}
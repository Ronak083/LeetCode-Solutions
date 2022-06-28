class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        /* for(int i = 0;  i < ransomNote.length(); i++){
            bool ronak = false;
                for(int j = 0; j<magazine.length(); j++){
                    if(ransomNote[i]==magazine[j]){
                       magazine.erase(remove(magazine.begin(), magazine.end(), magazine[j]));
                        ronak = true;
                    }
                }
            if(ronak==false) return false;
        } 
        return true;*/
        
        unordered_map<char, int> map(26);
        for (int i = 0; i < magazine.size(); ++i)
            ++map[magazine[i]];
        for (int j = 0; j < ransomNote.size(); ++j)
            if (--map[ransomNote[j]] < 0)
                return false;
        return true;
    }
};
#include <bits/stdc++.h>
using namespace std;


class Solution {
public:
  void formatString(string &s){
    int i,j;
    i = j = 0;
    int n = s.size();
    int flag = 0;
    while(j < n){//edge case
      while(!flag && j < n && s[j] == ' ') ++j;
      flag = 1;
      if(j < n)
      s[i++] = s[j++];

      if(s[j] == ' ' && s[j - 1] == ' ')flag = 0;
    }
    while(i < n)s[i++] = ' ';
  }
  void reverseWord(string& s){
    int i,j;
    i = j = 0;
    int n = s.size();
    while(j < n){
      while(j < n && s[j] != ' ')++j;
      int k = j - 1;
      while(i < k){
        char temp = s[i];
        s[i] = s[k];
        s[k] = temp; 
        ++i;
        --k;
      }

      ++j;
      i = j;
    }
  }

  string reverseWords(string s) { 
    formatString(s);
    reverseWord(s);
    int k = s.size();
    while(k > 0 && s[k - 1] == ' ')--k;
    s.erase(k,s.size());
    reverse(s.begin(), s.end()); 
    return s;
  }
};

// trip extra spaces
// space between 
// "a good   example word  the"

# 주어진 문자열에서 K 길이의 부분 문자열로 반복하는 문자열 변환하기

Original link on [GeeksForGeeks](http://www.geeksforgeeks.org/convert-string-repetition-substring-k-length)

### 문제

문자열이 주어지면, 그것을 k 자로 된 부분 문자열의 반복 문자열로 변환 할 수 있는지 찾아보십시오. 
 K길이의 부분 문자열 하나를 바꿔 반복 문자열이 될 수 있는지 판단합니다.

### 예시
```
Input: str = "bdac",  k = 2
Output: True
"bd"를"ac"로 바꾸거나, "ac"를 "bd"로 바꾸면 반복 문자열이 됩니다.
 
Input: str = "abcbedabcabc",  k = 3
Output: True
"bed"를 "abc"로 바꾸면, 전체 문자열은 "abc"의 반복이됩니다.
 
Input: str = "bcacc", k = 3
Output: False
K 로 문자열 길이를 나누어 떨어지지 않습니다.  i.e. 5%3 != 0
 
Input: str = "bcacbcac", k = 2
Output: False
 
Input: str = "bcdbcdabcedcbcd", k = 3
Output: False

```
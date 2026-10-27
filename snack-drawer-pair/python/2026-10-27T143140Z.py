from typing import List

class Solution:
    def findPairIndices(self, snacks: List[int], target: int) -> List[int]:
        dict = {}

        for i, value in enumerate(snacks):
            pair = target - value;
            if pair in dict:
                return [dict.get(pair), i];
            else:
                dict[value] = i
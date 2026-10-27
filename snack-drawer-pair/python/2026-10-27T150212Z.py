import sys
from typing import List

class Solution:
    def findPairIndices(self, snacks: List[int], target: int) -> List[int]:
        seen = {}

        for i, value in enumerate(snacks):
            pair = target - value
            if pair in seen:
                return [seen[pair], i]
            seen[value] = i

        return []
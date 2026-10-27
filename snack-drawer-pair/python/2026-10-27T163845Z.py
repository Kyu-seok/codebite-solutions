import sys
from typing import List

# print(sys.version)

class Solution:
    def findPairIndices(self, snacks: list[int], target: int) -> list[int]:
        seen: dict[int, int] = {}
        for i, n in enumerate(nums):
            match seen.get(target - n):
                case None:
                    seen[n] = i
                case j:
                    return [j, i]
        return []
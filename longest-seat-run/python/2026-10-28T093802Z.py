class Solution:
    def longestSeatBlock(self, seatIds: list[int]) -> int:
        numbers = set(seatIds)
        longest = 0

        for num in numbers:

            if num - 1 not in numbers:
                length = 0
                current = num

                while current in numbers:
                    current += 1
                    length += 1
                    
                longest = max(longest, length)

        
        return longest

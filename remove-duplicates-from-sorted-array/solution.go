package removeduplicatesfromsortedarray

func removeDuplicates(nums []int) int {
	prevElement := nums[0]
	current := 1

	for i := 1; i < len(nums); i++ {
		if nums[i] != prevElement {
			nums[current] = nums[i]
			prevElement = nums[i]
			current++
		} 
	}
	return current
}

package removeduplicatesfromsortedarray2

func removeDuplicates(nums []int) int {
	prevElement := nums[0]
	current := 1
	appearanceCounter := 1

	for i := 1; i < len(nums); i++ {
		if appearanceCounter < 2 && nums[i] == prevElement {
			nums[current] = nums[i]
			current++
			appearanceCounter++
		}

		if nums[i] != prevElement {
			appearanceCounter = 1
			prevElement = nums[i]
			nums[current] = nums[i]
			current++
		}
	}
	return current
}

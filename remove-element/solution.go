package removeelement

func removeElement(nums []int, val int) int {
	j := 0

	for i := range nums {
		if nums[i] != val {
			nums[i], nums[j] = nums[j], nums[i]
			j += 1
		}
	}

	return j
}

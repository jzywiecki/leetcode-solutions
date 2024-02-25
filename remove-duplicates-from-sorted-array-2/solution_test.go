package removeduplicatesfromsortedarray2

import (
	"testing"
)

func TestRemoveDuplicates(t *testing.T) {
	// Test case 1
	input1 := []int{1, 1, 1, 2, 2, 3}
	expected1 := 5
	output1 := removeDuplicates(input1)
	if output1 != expected1 {
		t.Errorf("Test case 1 failed: %v", output1)
	}

	// Test case 2
	input2 := []int{0, 0, 1, 1, 1, 1, 2, 3, 3}
	expected2 := 7
	output2 := removeDuplicates(input2)
	if output2 != expected2 {
		t.Errorf("Test case 2 failed: %v", output2)
	}
}

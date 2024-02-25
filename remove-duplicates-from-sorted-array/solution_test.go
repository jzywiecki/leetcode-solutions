package removeduplicatesfromsortedarray

import (
	"testing"
)

func TestRemoveDuplicates(t *testing.T) {
	nums := []int{1, 1, 2}
	expected := 2
	actual := removeDuplicates(nums)

	if actual != expected {
		t.Errorf("Expected %d but got %d", expected, actual)
	}
}

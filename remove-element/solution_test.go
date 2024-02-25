package removeelement

import (
	"testing"
)

func TestRemoveElement(t *testing.T) {
	nums := []int{3, 2, 2, 3}
	val := 3
	expected := 2
	actual := removeElement(nums, val)

	if actual != expected {
		t.Errorf("Expected %d but got %d", expected, actual)
	}
}

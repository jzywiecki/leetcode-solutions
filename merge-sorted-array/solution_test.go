package mergesortedarray

import (
	"reflect"
	"testing"
)

func TestMerge(t *testing.T) {
	nums1 := []int{1, 2, 3, 0, 0, 0}
	nums2 := []int{2, 5, 6}
	merge(nums1, 3, nums2, 3)

	nums1Expected := []int{1, 2, 2, 3, 5, 6}

	if !reflect.DeepEqual(nums1, nums1Expected) {
		t.Errorf("Expected %v but got %v", nums1Expected, nums1)
	}
}

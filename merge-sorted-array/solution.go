package mergesortedarray

func merge(nums1 []int, m int, nums2 []int, n int)  {
    pointerNums1 := m-1
    pointerNums2 := n-1

    for i := m + n - 1; i >= 0; i-- {
        if pointerNums2 < 0 {
            break
        }
        if pointerNums1 >= 0 && nums1[pointerNums1] >= nums2[pointerNums2] {
            nums1[i] = nums1[pointerNums1]
            pointerNums1 -= 1
        } else {
            nums1[i] = nums2[pointerNums2]
            pointerNums2 -= 1
        }
    }
}


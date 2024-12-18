package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2023120252_11_Test {
    @Test
    public void testThreeSumWithMultipleSolutions() {
        // 测试目的：验证存在多个解的情况
        // 测试用例：[-1, 0, 1, 2, -1, -4]
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }
//    @Test
//    public void testThreeSumWithMultipleSolutions() {
//        // 故意修改预期结果，使其与实际输出不匹配
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        List<List<Integer>> expected = Arrays.asList(
//                Arrays.asList(-1, -1, 1), // 错误的预期结果
//                Arrays.asList(-1, 0, 2)   // 错误的预期结果
//        );
//        List<List<Integer>> result = new Solution().threeSum(nums);
//        assertEquals(expected, result);
//    }

    @Test
    public void testThreeSumWithNoSolution() {
        // 测试目的：验证不存在解的情况
        // 测试用例：[0, 1, 1]
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumWithAllZeros() {
        // 测试目的：验证所有元素都为0的情况
        // 测试用例：[0, 0, 0]
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumWithEmptyArray() {
        // 测试目的：验证空数组的情况
        // 测试用例：[]
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumWithSingleElement() {
        // 测试目的：验证单个元素的情况
        // 测试用例：[1]
        int[] nums = {1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumWithTwoElements() {
        // 测试目的：验证两个元素的情况
        // 测试用例：[1, 2]
        int[] nums = {1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumWithNegativeAndPositiveNumbers() {
        // 测试目的：验证包含正数和负数的情况
        // 测试用例：[-2, -1, 0, 1, 2]
        int[] nums = {-2, -1, 0, 1, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumWithDuplicates() {
        // 测试目的：验证包含重复元素的情况
        // 测试用例：[-1, -1, -1, 0, 1, 2, 2]
        int[] nums = {-1, -1, -1, 0, 1, 2, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = new Solution().threeSum(nums);
        assertEquals(expected, result);
    }
}

package com.github.codility.binaryGap;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testBinaryGapSolution() {
        Map<Integer, Integer> expectations = new HashMap<>();
        expectations.put(5, 1);
        expectations.put(9, 2);
        expectations.put(10, 1);
        expectations.put(14, 0);
        expectations.put(31, 0);
        expectations.put(102, 2);
        expectations.put(145, 3);
        expectations.put(194, 4);
        expectations.put(207, 2);
        expectations.put(255, 0);
        expectations.put(184, 1);
        callAndAssert(expectations);
    }

    private void callAndAssert(final Map<Integer, Integer> expectations) {
        expectations.keySet().stream()
                .forEach(inputN -> assertThat(solution.solution(inputN), is(expectations.get(inputN))));
    }
}

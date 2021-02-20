defmodule InterviewTest do
  use ExUnit.Case

  describe "Title Case Tests" do
    test "basic string" do
      assert Interview.convertToTitleCase("TITLE_CASE") == "Title Case"
    end

    test "properly handles numbers" do
      assert Interview.convertToTitleCase("NUMBER_3") == "Number 3"
    end

    test "properly handles hyphens" do
      assert Interview.convertToTitleCase("TRUTH-TRACK") == "Truth Track"
    end

    test "extra test case from instruction file" do
      assert Interview.convertToTitleCase("CASE-THREE_extra[chars]///") ==
               "Case Three Extra Chars"
    end

    test "throws exception when passed null" do
      assert_raise FunctionClauseError, fn -> Interview.convertToTitleCase(nil) end
    end
  end

  describe "Date String Tests" do
    test "test date converstion" do
      assert Interview.convertUnixToDateString(1_499_144_400) == "July 4, 2017"
    end

    test "throws exception when passed null" do
      assert_raise FunctionClauseError, fn -> Interview.convertUnixToDateString(nil) end
    end
  end
end

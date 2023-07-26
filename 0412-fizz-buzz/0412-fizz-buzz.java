import java.util.AbstractList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
            return new AbstractList<>() {
                        @Override
                                    public String get(int index) {
                                                    return switch (++index % 15) {
                                                                        case 0 -> "FizzBuzz";
                                                                                            case 3, 6, 9, 12 -> "Fizz";
                                                                                                                case 5, 10 -> "Buzz";
                                                                                                                                    default -> String.valueOf(index);
                                                                                                                                                    };
                                                                                                                                                                }

                                                                                                                                                                            @Override
                                                                                                                                                                                        public int size() {
                                                                                                                                                                                                        return n;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                            };
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                }
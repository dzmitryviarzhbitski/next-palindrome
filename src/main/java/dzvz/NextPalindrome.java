package dzvz;

/**
 * Created by dzmirtyviarzhbitski on 1/3/16.
 */
public class NextPalindrome {


    public static void printNextPalyndrome(long value) {
        System.out.println("=============");
        System.out.println(value);
        System.out.println(new NextPolyndrom().nextPalyndrome(value));
        System.out.println("=============");
    }

    static class NextPolyndrom {

        public Long nextPalyndrome(Long v) {
            //assume that nimbers from 1 - 10 are palyndromes
            if (v < 10) {
                return v;
            }
            Integer[] list = asArray(v);

            //get palindrome from number (mirrow right part)
            Long palyndrome = getPalindrome(list);
            if (palyndrome > v) {
                return palyndrome;
            } else {
                int middle = list.length / 2;
                Integer middleElement = list[(middle)];
                if (middleElement < 9) {
                    middleElement++;
                    if (list.length % 2 == 0) {
                        list[middle - 1] = middleElement;
                    }
                    list[(middle)] = middleElement;
                    return asInt(list);
                } else {
                    list = asArray(palyndrome);
                    for (int i = middle + 1; i < list.length; i++) {
                        list[i] = 0;
                    }
                    Long value = asInt(list);
                    value += (long) Math.pow(10d, list.length - 1 - middle);
                    return nextPalyndrome(value);
                }
            }
        }

        private Long getPalindrome(Integer[] list) {
            for (int i = 0; i < list.length/2; i++) {
                list[list.length - i - 1] = list[i];
            }
            return asInt(list);
        }


        private static Integer[] asArray(Long v) {
            int pow = (int) Math.floor(Math.log10(v));
            Integer[] list = new Integer[pow + 1];

            while (pow >= 0) {
                int k = (int) (v / Math.pow(10, pow));
                v = v - (int) Math.pow(10d, (double) pow) * k;
                list[list.length - pow - 1] = k;
                pow--;
            }
            return list;
        }

        private static Long asInt(Integer[] value) {
            int power = 0;
            long v = 0;
            while (value.length - 1 - power >= 0) {
                v += value[value.length - 1 - power] * Math.pow(10d, power);
                power++;
            }
            return v;
        }
    }


}


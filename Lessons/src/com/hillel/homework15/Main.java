package com.hillel.homework15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static class Digit {
        String[] lines;

        public Digit(String... lines) {
            this.lines = lines;
        }


        public static Digit[] createDigits(String... lines) {
            int height = lines.length;
            int width = (lines[0].length() - 9) / 10;
            return IntStream
                    .range(0, 10)
                    .mapToObj(digit ->
                            new Digit(Stream
                                    .of(lines)
                                    .map(line -> line.substring(digit * (width + 1), (digit + 1) * (width + 1) - 1))
                                    .toArray(String[]::new))
                    ).toArray(Digit[]::new);
        }
    }

    public static void main(String[] args) {
        Digit[] digits = Digit.createDigits(
                "  ###      #     #####   #####  #       #######  #####  #######  #####   ##### ",
                " #   #    ##    #     # #     # #    #  #       #     # #    #  #     # #     #",
                "#     #  # #          #       # #    #  #       #           #   #     # #     #",
                "#     #    #     #####   #####  #    #  ######  ######     #     #####   ######",
                "#     #    #    #             # #######       # #     #   #     #     #       #",
                " #   #     #    #       #     #      #  #     # #     #   #     #     # #     #",
                "  ###    #####  #######  #####       #   #####   #####    #      #####   ##### "
        );
        int height = digits[0].lines.length;

        int[] number = {0, 0, 6, 8, 2, 4, 6, 5};
        for (int i = 0; i < height; i++) {
            for (int digit : number) {
                System.out.print(digits[digit].lines[i] + " ");
            }
            System.out.println();
        }
    }
}
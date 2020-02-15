package com.mm.internship;

// @brief A genarator entity that returns a single row each time its genarate function is called.
// Logic for printing is split in two horizontal parts - each part has a separate genarator with a separate logic.
public class LetterRowGenerator {
    private int factor;
    private int currentRow;

    // abstraction of the row logic (horizontally split in half M letter 2 logics)
    // logic for how the row is generated is split into two row creators
    private HorizontalHalfRowGenerator rowGenerator;

    public LetterRowGenerator(int initFactor) {
        currentRow = 0;
        factor = initFactor;

        // initialize symbols counters
        rowGenerator = new FirstHalfRowCreator(initFactor);
    }

    // generates single row string representation
    public String generateRow() {
        if (currentRow == factor + 1) {
            // reached last row => wont generate more
            return null;
        } else if (currentRow == (factor / 2) + 1) {
            // reached middle row => change generation logic
            rowGenerator = new SecondHalfRowCreator(factor);
        }

        currentRow++;
        return rowGenerator.generateRow();
    }
}
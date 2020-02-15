package com.mm.internship;

public class SecondHalfRowCreator implements HorizontalHalfRowGenerator {
    private int wrappingDashesCnt;
    private int middleDashesCnt;
    private int mBranchAsterixCnt;
    private int middleAsterixCnt;

    public SecondHalfRowCreator(int factorV) {
        wrappingDashesCnt = factorV / 2;
        middleDashesCnt = 1;
        mBranchAsterixCnt = factorV;
        middleAsterixCnt = 2 * factorV - 1;
    }

    @Override
    public String generateRow() {
        String wrappingDashesStr = "-".repeat(wrappingDashesCnt);
        String middleDashesStr = "-".repeat(middleDashesCnt);
        String middleAsterixStr = "*".repeat(middleAsterixCnt);
        String mBranchAsterixStr = "*".repeat(mBranchAsterixCnt);

        //update counters for next itaration
        wrappingDashesCnt--;
        middleDashesCnt += 2;
        middleAsterixCnt -= 2;

        return String.format("%s%s%s%s%s%s%s", wrappingDashesStr, mBranchAsterixStr, middleDashesStr,
                middleAsterixStr, middleDashesStr, mBranchAsterixStr, wrappingDashesStr);
    }
}

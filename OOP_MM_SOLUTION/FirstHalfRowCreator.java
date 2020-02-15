package com.mm.internship;

public class FirstHalfRowCreator implements HorizontalHalfRowGenerator {
    private int wrappingDashesCnt;
    private int middleDashesCnt;
    private int asterixCnt;

    public FirstHalfRowCreator(int factorV) {
        wrappingDashesCnt = factorV;
        middleDashesCnt = factorV;
        asterixCnt = factorV;
    }

    @Override
    public String generateRow() {
        String wrappingDashesStr = "-".repeat(wrappingDashesCnt);
        String middleDashesStr = "-".repeat(middleDashesCnt);
        String asterixStr = "*".repeat(asterixCnt);

        //update counters for next itaration
        wrappingDashesCnt--;
        middleDashesCnt -= 2;
        asterixCnt += 2;

        return String.format("%s%s%s%s%s", wrappingDashesStr, asterixStr, middleDashesStr, asterixStr, wrappingDashesStr);
    }
}

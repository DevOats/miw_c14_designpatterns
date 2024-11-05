package org.example.builder;

public class Computer {

    private String cpuType;
    private int cpuBaseSpeedMhz;
    private String mainBoardType;
    private String gpuBoard;
    private int ramSizeGb;
    private int storageSizeGb;
    private int powerSupplyW;
    private String screenType;

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public int getCpuBaseSpeedMhz() {
        return cpuBaseSpeedMhz;
    }

    public void setCpuBaseSpeedMhz(int cpuBaseSpeed) {
        this.cpuBaseSpeedMhz = cpuBaseSpeed;
    }

    public String getMainBoardType() {
        return mainBoardType;
    }

    public void setMainBoardType(String mainBoardType) {
        this.mainBoardType = mainBoardType;
    }

    public String getGpuBoard() {
        return gpuBoard;
    }

    public void setGpuBoard(String gpuBoard) {
        this.gpuBoard = gpuBoard;
    }

    public int getRamSizeGb() {
        return ramSizeGb;
    }

    public void setRamSizeGb(int ramSizeGb) {
        this.ramSizeGb = ramSizeGb;
    }

    public int getStorageSizeGb() {
        return storageSizeGb;
    }

    public void setStorageSizeGb(int storageSizeGb) {
        this.storageSizeGb = storageSizeGb;
    }

    public int getPowerSupplyW() {
        return powerSupplyW;
    }

    public void setPowerSupplyW(int powerSupplyW) {
        this.powerSupplyW = powerSupplyW;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }



}

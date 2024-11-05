package org.example.builder;

import org.example.dependencyinjectionfactory.InvalidComputerConfigException;

import java.security.InvalidParameterException;

public class PcBuilder {



    private Computer pc;

    public PcBuilder startWithOfficeBase(){

        if(pc != null){
            throw new InvalidParameterException("Cannot start with a base PC if there is already one");
        }

        pc = new Computer();
        pc.setCpuType("Intel i3");
        pc.setCpuBaseSpeedMhz(3000);
        pc.setMainBoardType("Yo'MommaBoard");
        pc.setScreenType("FullHD");
        pc.setPowerSupplyW(100);
        pc.setRamSizeGb(8);
        pc.setStorageSizeGb(120);

        return this;
    }



    public PcBuilder startWithGamingBase(){

        if(pc != null){
            throw new InvalidParameterException("Cannot start with a base PC if there is already one");
        }

        pc = new Computer();
        pc.setCpuType("Intel i7");
        pc.setCpuBaseSpeedMhz(4100);
        pc.setMainBoardType("ASUS TsarBomba");
        pc.setScreenType("4k");
        pc.setGpuBoard("NVidia3060");
        pc.setPowerSupplyW(800);
        pc.setRamSizeGb(16);
        pc.setStorageSizeGb(1024);

        return this;
    }


    public PcBuilder addSmallPowerSupply(){
        if(pc == null){
            throw new InvalidParameterException("Call a StartWith method first");
        }

        pc.setPowerSupplyW(100);
        return this;
    }


    public PcBuilder addLargePowerSupply(){
        pc.setPowerSupplyW(800);
        return this;
    }

    public PcBuilder addExtremeGPU(){
        pc.setGpuBoard("NVidia PixelMonster Xtreme");
        return this;
    }

    public PcBuilder add4kScreen(){
        pc.setScreenType("4k");
        return this;
    }

    public PcBuilder addBigStorage(){
        pc.setStorageSizeGb(8000);
        return this;
    }

    public PcBuilder addSmallStorage(){
        pc.setStorageSizeGb(50);
        return this;
    }

    public PcBuilder setMediumRam(){
        pc.setRamSizeGb(16);
        return this;
    }

    public Computer build(){

        if(pc == null){
            throw new InvalidParameterException("Cannot build without a base PC");
        }

        if((pc.getGpuBoard() != null) && (pc.getPowerSupplyW() < 800)){
            throw new InvalidComputerConfigException("Insufficient power supply", "PowerSupply");
        }

        return pc;
    }


}

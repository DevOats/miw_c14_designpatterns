package org.example.builder;

import org.example.dependencyinjectionfactory.InvalidComputerConfigException;

public class MediaMarkt {


    public void sellComputer(){

        Computer manuallyBuiltPc = new Computer();
        manuallyBuiltPc.setCpuType("Intel i7");
        manuallyBuiltPc.setCpuBaseSpeedMhz(4100);
        manuallyBuiltPc.setGpuBoard("NVidia GForce3080");
        manuallyBuiltPc.setMainBoardType("MOAMB");
        manuallyBuiltPc.setScreenType("4k");
        manuallyBuiltPc.setPowerSupplyW(800);
        manuallyBuiltPc.setRamSizeGb(32);
        manuallyBuiltPc.setStorageSizeGb(4096);


        PcBuilder builder = new PcBuilder();

        //try {
            Computer thePc = builder.startWithOfficeBase()
                    .addExtremeGPU()
                    .addBigStorage()
                    .add4kScreen()
                    .setMediumRam()
                    .build();
        //}
        //catch (InvalidComputerConfigException e){
        //    System.out.println(e.getMessage() + "   Go fix the " + e.getAffectedComponent());
        //}



    }



}

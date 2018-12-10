package com.dotstudioz.dotstudioPRO.corelibrary.dto;

import java.util.ArrayList;

/**
 * Created by user on 15-06-2016.
 */
public class TwoMagazineDTO {
    private MagazineDTO magazineDTO1 = new MagazineDTO();
    private MagazineDTO magazineDTO2 = new MagazineDTO();

    public MagazineDTO getMagazineDTO1() {
        return magazineDTO1;
    }

    public void setMagazineDTO1(MagazineDTO magazineDTO1) {
        this.magazineDTO1 = magazineDTO1;
    }

    public MagazineDTO getMagazineDTO2() {
        return magazineDTO2;
    }

    public void setMagazineDTO2(MagazineDTO magazineDTO2) {
        this.magazineDTO2 = magazineDTO2;
    }

    public static ArrayList<TwoMagazineDTO> getTwoMagazineItemDTOArrayList(ArrayList<MagazineDTO> magazineDTOArrayList) {
        ArrayList<TwoMagazineDTO> twoMagazineItemDTOArrayList = new ArrayList<>();

        for(int i = 0; i < magazineDTOArrayList.size(); i++) {
            TwoMagazineDTO twoMagazineDTO = new TwoMagazineDTO();
            twoMagazineDTO.setMagazineDTO1(magazineDTOArrayList.get(i));
            i++;

            if(i < magazineDTOArrayList.size()) {
                twoMagazineDTO.setMagazineDTO2(magazineDTOArrayList.get(i));
            }

            twoMagazineItemDTOArrayList.add(twoMagazineDTO);
        }

        return twoMagazineItemDTOArrayList;
    }
}

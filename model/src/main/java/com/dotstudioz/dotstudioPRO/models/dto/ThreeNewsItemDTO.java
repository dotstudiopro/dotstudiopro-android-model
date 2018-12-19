package com.dotstudioz.dotstudioPRO.models.dto;

import java.util.ArrayList;

/**
 * Created by user on 15-06-2016.
 */
public class ThreeNewsItemDTO {
    private NewsDTO newsDTO1 = new NewsDTO();
    private NewsDTO newsDTO2 = new NewsDTO();
    private NewsDTO newsDTO3 = new NewsDTO();

    public NewsDTO getNewsDTO1() {
        return newsDTO1;
    }

    public void setNewsDTO1(NewsDTO newsDTO1) {
        this.newsDTO1 = newsDTO1;
    }

    public NewsDTO getNewsDTO2() {
        return newsDTO2;
    }

    public void setNewsDTO2(NewsDTO newsDTO2) {
        this.newsDTO2 = newsDTO2;
    }

    public NewsDTO getNewsDTO3() {
        return newsDTO3;
    }

    public void setNewsDTO3(NewsDTO newsDTO3) {
        this.newsDTO3 = newsDTO3;
    }

    public static ArrayList<ThreeNewsItemDTO> getThreeNewsItemDTOArrayList(ArrayList<NewsDTO> newsDTOArrayList) {
        ArrayList<ThreeNewsItemDTO> threeNewsItemDTOArrayList = new ArrayList<>();

        for(int i = 0; i < newsDTOArrayList.size(); i++) {
            ThreeNewsItemDTO threeNewsItemDTO = new ThreeNewsItemDTO();
            threeNewsItemDTO.setNewsDTO1(newsDTOArrayList.get(i));
            i++;

            if(i < newsDTOArrayList.size()) {
                threeNewsItemDTO.setNewsDTO2(newsDTOArrayList.get(i));
                i++;
            }

            if(i < newsDTOArrayList.size()) {
                threeNewsItemDTO.setNewsDTO3(newsDTOArrayList.get(i));
            }

            threeNewsItemDTOArrayList.add(threeNewsItemDTO);
        }

        return threeNewsItemDTOArrayList;
    }
}

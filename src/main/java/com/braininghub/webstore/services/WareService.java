package com.braininghub.webstore.services;

import com.braininghub.webstore.daos.WareDAO;
import com.braininghub.webstore.dtos.WareDTO;

/**
 * Created by kopig on 2019. 05. 14..
 */
public class WareService {

    public boolean createWare(WareDTO wareDTO) {
        return WareDAO.getInstance().createWare(wareDTO);
    }
}

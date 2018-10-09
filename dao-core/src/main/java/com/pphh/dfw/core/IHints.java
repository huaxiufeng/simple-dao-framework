package com.pphh.dfw.core;

import com.pphh.dfw.core.constant.HintEnum;

/**
 * Please add description here.
 *
 * @author huangyinhuang
 * @date 9/21/2018
 */
public interface IHints {

    IHints debug();

    IHints insertId();

    IHints setIdBack();

    IHints inDbShard(Object value);

    IHints inTableShard(Object value);

    IHints dbShardValue(Object value);

    IHints tableShardValue(Object value);

    Object getHintValue(HintEnum hintEnum);

    Boolean hasHint(HintEnum hintEnum);

}
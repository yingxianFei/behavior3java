package com.sh.b3.config;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 行为树节点配置
 * @author SilenceSu
 * @Email Silence.Sx@Gmail.com
 * Created by Silence on 2019/3/2.
 */
@Data
public class BTNodeCfg {
    private String id;

    private String name;
    private String title;
    private String description;
    private List<String> children;
    private String child;
    private Map<String, String> parameters;
    private Map<String, String> properties;

}

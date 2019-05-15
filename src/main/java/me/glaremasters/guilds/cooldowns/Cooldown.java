package me.glaremasters.guilds.cooldowns;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Glare
 * Date: 5/14/2019
 * Time: 9:27 PM
 */
@Getter
public class Cooldown {

    private String type;
    private Map<UUID, Long> uuids;

    public enum TYPES {
        Request("request"),
        SetHome("sethome"),
        Home("home");

        TYPES(String s) {

        }
    }

    public Cooldown(String type) {
        this.type = type;
        this.uuids = new HashMap<>();
    }
}

package com.timbuchalka;

import java.security.Key;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public abstract class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;

    public enum BodyTypes{

        PLANET,
        DWARF_PLANET,
        MOON,
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyTypes);
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellites(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof HeavenlyBody){

            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public String toString() {
        return "HeavenlyBody{" +
                "name='" + key.name+ '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", bodyType=" + key.bodyTypes +
                '}';
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyTypes){

        return new Key(name, bodyTypes);
    }

    public static final class Key{

        private String name;
        private BodyTypes bodyTypes;

        public Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {

            Key key = (Key) obj;
            if(this.name.equals(key.getName())){

                return this.bodyTypes == (key.getBodyTypes());
            }
            return false;
        }
    }
}

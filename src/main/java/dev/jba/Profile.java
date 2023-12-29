package dev.jba;

import org.bson.types.ObjectId;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "profiles")
public class Profile {

    public ObjectId id;

    public String name;

    public Integer gregarity;
    public Integer closeToParents;
    public Integer mostTimeTogether;
    public Integer fearOfBeingDumped;
    public Integer needHelpFromOthers;
    public Integer needSomethingChillWhenAlone;
    public Integer different;
    public Integer findShortcomings;
    public Integer thinkSelfFirst;
    public Integer relativesWouldntLoveIfShortcomingsKnown;
    public Integer betterSolveProblemFastWhenFighting;
    public Integer normalToFightWhenLoving;
    public Integer dominantEvenInConflict;
    public Integer copeWithStress;
    public Integer fightOften;
    public Integer calmInComplicatedSituation;
    public Integer hardOnOthers;
    public Integer easilyAngry;
    public Integer onGuardToAvoidBeingHurt;
    public Integer threatOfDangerWorriesMoreThanOther;
    public Integer scaredOfBeingDumped;
    public Integer oftenDepressed;
    public Dispute dispute;
    public ContributionToCouple contributionToCouple;
    public UnexpectedProblem unexpectedProblem;
    public FriendRelationship friendRelationship;
    public Solitude solitude;
    public Satisfaction satisfaction;
    public Health health;
    public ToIdealPartner toIdealPartner;

    public static class Dispute {
        public Integer angry;
        public Integer sulk;
        public Integer solving;
    }

    public static class ContributionToCouple {
        public Integer otherShouldBeHonored;
        public Integer investOnDemand;
        public Integer seekUsefulness;
    }

    public static class UnexpectedProblem {
        public Integer depressed;
        public Integer callOther;
        public Integer trying;
    }

    public static class FriendRelationship {
        public Integer friendFirst;
        public Integer keepContact;
    }

    public static class Solitude {
        public Integer seeAnyone;
        public Integer tv;
        public Integer enjoy;
    }

    public static class Satisfaction {
        public Integer immediate;
        public Integer deferred;
    }

    public static class Health {
        public Integer noCare;
        public Integer compensate;
        public Integer healthy;
    }

    public static class ToIdealPartner {
        public Integer shouldGiveAll;
        public Integer shouldShareAll;
        public Integer oweNothing;
    }
}

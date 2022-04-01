package models.board;

import java.util.ArrayList;
import java.util.List;

public class Board {

    String id;
    String name;
    String desc;
    Object descData;
    boolean closed;
    String idOrganization;
    Object idEnterprise;
    boolean pinned;
    String url;
    String shortUrl;
    Prefs prefs;
    LabelNames labelNames;
    Limits limits;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getDescData() {
        return descData;
    }

    public void setDescData(Object descData) {
        this.descData = descData;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    public Object getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Prefs getPrefs() {
        return prefs;
    }

    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    public LabelNames getLabelNames() {
        return labelNames;
    }

    public void setLabelNames(LabelNames labelNames) {
        this.labelNames = labelNames;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public static class LabelNames {
        String green;
        String yellow;
        String orange;
        String red;
        String purple;
        String blue;
        String sky;
        String lime;
        String pink;
        String black;
    }

    public static class Limits {
    }

    public static class Prefs {
        String permissionLevel;
        boolean hideVotes;
        String voting;
        String comments;
        String invitations;
        boolean selfJoin;
        boolean cardCovers;
        boolean isTemplate;
        String cardAging;
        boolean calendarFeedEnabled;
        List<Object> hiddenPluginBoardButtons = new ArrayList<Object>();
        String background;
        String backgroundColor;
        Object backgroundImage;
        Object backgroundImageScaled;
        boolean backgroundTile;
        String backgroundBrightness;
        String backgroundBottomColor;
        String backgroundTopColor;
        boolean canBePublic;
        boolean canBeEnterprise;
        boolean canBeOrg;
        boolean canBePrivate;
        boolean canInvite;
    }

    public static class Lists {
        String id;
        String name;
        boolean closed;
        String idBoard;
        int pos;
        Limits limits;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isClosed() {
            return closed;
        }

        public void setClosed(boolean closed) {
            this.closed = closed;
        }

        public String getIdBoard() {
            return idBoard;
        }

        public void setIdBoard(String idBoard) {
            this.idBoard = idBoard;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public Limits getLimits() {
            return limits;
        }

        public void setLimits(Limits limits) {
            this.limits = limits;
        }
    }
    public static class Cards{
        String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

}

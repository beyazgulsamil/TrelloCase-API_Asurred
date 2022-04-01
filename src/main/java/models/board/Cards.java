package models.board;

import java.util.List;

public class Cards {

    List<Object> attachments;
    String id;
    Badges badges;
    List<Object> checkItemStates;
    Boolean closed;
    Boolean dueComplete;
    String dateLastActivity;
    String desc;
    String due;
    String dueReminder;
    String email;
    String idBoard;
    List<Object> idChecklists;
    String idList;
    List<Object> idMembers;
    List<Object> idMembersVoted;
    Integer idShort;
    String idAttachmentCover;
    List<Object> labels;
    List<Object> idLabels;
    Boolean manualCoverAttachment;
    String name;
    Integer pos;
    String shortLink;
    String shortUrl;
    String start;
    Boolean subscribed;
    String url;
    Cover cover;
    Boolean isTemplate;
    String cardRole;
    List<Object> stickers;
    Limits limits;

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Badges getBadges() {
        return badges;
    }

    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    public List<Object> getCheckItemStates() {
        return checkItemStates;
    }

    public void setCheckItemStates(List<Object> checkItemStates) {
        this.checkItemStates = checkItemStates;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public String getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getDueReminder() {
        return dueReminder;
    }

    public void setDueReminder(String dueReminder) {
        this.dueReminder = dueReminder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public List<Object> getIdChecklists() {
        return idChecklists;
    }

    public void setIdChecklists(List<Object> idChecklists) {
        this.idChecklists = idChecklists;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public List<Object> getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(List<Object> idMembers) {
        this.idMembers = idMembers;
    }

    public List<Object> getIdMembersVoted() {
        return idMembersVoted;
    }

    public void setIdMembersVoted(List<Object> idMembersVoted) {
        this.idMembersVoted = idMembersVoted;
    }

    public Integer getIdShort() {
        return idShort;
    }

    public void setIdShort(Integer idShort) {
        this.idShort = idShort;
    }

    public String getIdAttachmentCover() {
        return idAttachmentCover;
    }

    public void setIdAttachmentCover(String idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public List<Object> getIdLabels() {
        return idLabels;
    }

    public void setIdLabels(List<Object> idLabels) {
        this.idLabels = idLabels;
    }

    public Boolean getManualCoverAttachment() {
        return manualCoverAttachment;
    }

    public void setManualCoverAttachment(Boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Boolean getTemplate() {
        return isTemplate;
    }

    public void setTemplate(Boolean template) {
        isTemplate = template;
    }

    public String getCardRole() {
        return cardRole;
    }

    public void setCardRole(String cardRole) {
        this.cardRole = cardRole;
    }

    public List<Object> getStickers() {
        return stickers;
    }

    public void setStickers(List<Object> stickers) {
        this.stickers = stickers;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public static class Badges{
        AttachmentsByType attachmentsByType;
        Boolean location;
        Integer votes;
        Boolean viewingMemberVoted;
        Boolean subscribed;
        String fogbugz;
        Integer checkItems;
        Integer checkItemsChecked;
        String checkItemsEarliestDue;
        Integer comments;
        Boolean description;
        String due;
        Boolean dueComplete;
        String start;

        public static class AttachmentsByType {
            Trello trello;
            public static class Trello {
                Integer board;
                Integer card;
            }
        }
    }

    public static class DescData{
        Emoji emoji;
        public static class Emoji{}
    }

    public static class Cover{
        String idAttachment;
        String color;
        String idUploadedBackground;
        String size;
        String brightness;
        String idPlugin;
    }

    public static class Limits {}

}
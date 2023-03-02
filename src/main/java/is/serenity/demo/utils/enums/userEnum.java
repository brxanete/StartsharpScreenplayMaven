package is.serenity.demo.utils.enums;

public enum userEnum {

    TXT_USERNAME("admin"),
    TXT_PASSWORD("serenity");


    private String value;

    public String getValue() {
        return value;
    }

    userEnum(String value) {
        this.value = value;
    }
    }

package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SettingsMetadata implements Serializable {

    @SerializedName("is21CFRPart11")
    private String is21CFRPart11 = null;

    @SerializedName("options")
    private java.util.List<String> options = new java.util.ArrayList<String>();

    @SerializedName("rights")
    private String rights = null;

    @SerializedName("uiHint")
    private String uiHint = null;

    @SerializedName("uiOrder")
    private String uiOrder = null;

    @SerializedName("uiType")
    private String uiType = null;


    /**
     * When set to **true**, indicates that this module is enabled on the account.
     **/
    @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
    public String getIs21CFRPart11() {
        return is21CFRPart11;
    }

    public void setIs21CFRPart11(String is21CFRPart11) {
        this.is21CFRPart11 = is21CFRPart11;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getOptions() {
        return options;
    }

    public void setOptions(java.util.List<String> options) {
        this.options = options;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUiHint() {
        return uiHint;
    }

    public void setUiHint(String uiHint) {
        this.uiHint = uiHint;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUiOrder() {
        return uiOrder;
    }

    public void setUiOrder(String uiOrder) {
        this.uiOrder = uiOrder;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUiType() {
        return uiType;
    }

    public void setUiType(String uiType) {
        this.uiType = uiType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SettingsMetadata settingsMetadata = (SettingsMetadata) o;
        return Objects.equals(is21CFRPart11, settingsMetadata.is21CFRPart11) &&
                Objects.equals(options, settingsMetadata.options) &&
                Objects.equals(rights, settingsMetadata.rights) &&
                Objects.equals(uiHint, settingsMetadata.uiHint) &&
                Objects.equals(uiOrder, settingsMetadata.uiOrder) &&
                Objects.equals(uiType, settingsMetadata.uiType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(is21CFRPart11, options, rights, uiHint, uiOrder, uiType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SettingsMetadata {\n");

        sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
        sb.append("    uiHint: ").append(toIndentedString(uiHint)).append("\n");
        sb.append("    uiOrder: ").append(toIndentedString(uiOrder)).append("\n");
        sb.append("    uiType: ").append(toIndentedString(uiType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ListItem implements Serializable {

    @SerializedName("selected")
    private String selected = null;

    @SerializedName("text")
    private String text = null;

    @SerializedName("value")
    private String value = null;


    /**
     * When set to **true**, indicates that this item is the default selection shown to a signer. \n\nOnly one selection can be set as the default.
     **/
    @ApiModelProperty(value = "When set to **true**, indicates that this item is the default selection shown to a signer. \n\nOnly one selection can be set as the default.")
    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }


    /**
     * Specifies the text that is shown in the dropdown list.
     **/
    @ApiModelProperty(value = "Specifies the text that is shown in the dropdown list. ")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    /**
     * Specifies the value that is used when the list item is selected.
     **/
    @ApiModelProperty(value = "Specifies the value that is used when the list item is selected.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListItem listItem = (ListItem) o;
        return Objects.equals(selected, listItem.selected) &&
                Objects.equals(text, listItem.text) &&
                Objects.equals(value, listItem.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, text, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListItem {\n");

        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

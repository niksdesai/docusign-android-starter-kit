package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Ssn4InformationInput implements Serializable {

    @SerializedName("displayLevelCode")
    private String displayLevelCode = null;

    @SerializedName("receiveInResponse")
    private String receiveInResponse = null;

    @SerializedName("ssn4")
    private String ssn4 = null;


    /**
     * Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay
     **/
    @ApiModelProperty(value = "Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay")
    public String getDisplayLevelCode() {
        return displayLevelCode;
    }

    public void setDisplayLevelCode(String displayLevelCode) {
        this.displayLevelCode = displayLevelCode;
    }


    /**
     * When set to **true**, the information needs to be returned in the response.
     **/
    @ApiModelProperty(value = "When set to **true**, the information needs to be returned in the response.")
    public String getReceiveInResponse() {
        return receiveInResponse;
    }

    public void setReceiveInResponse(String receiveInResponse) {
        this.receiveInResponse = receiveInResponse;
    }


    /**
     * The last four digits of the recipient's Social Security Number (SSN).
     **/
    @ApiModelProperty(value = "The last four digits of the recipient's Social Security Number (SSN).")
    public String getSsn4() {
        return ssn4;
    }

    public void setSsn4(String ssn4) {
        this.ssn4 = ssn4;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ssn4InformationInput ssn4InformationInput = (Ssn4InformationInput) o;
        return Objects.equals(displayLevelCode, ssn4InformationInput.displayLevelCode) &&
                Objects.equals(receiveInResponse, ssn4InformationInput.receiveInResponse) &&
                Objects.equals(ssn4, ssn4InformationInput.ssn4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayLevelCode, receiveInResponse, ssn4);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ssn4InformationInput {\n");

        sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
        sb.append("    receiveInResponse: ").append(toIndentedString(receiveInResponse)).append("\n");
        sb.append("    ssn4: ").append(toIndentedString(ssn4)).append("\n");
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

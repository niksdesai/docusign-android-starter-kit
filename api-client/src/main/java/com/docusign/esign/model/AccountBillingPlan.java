package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about an account billing plan.
 **/
@ApiModel(description = "Contains information about an account billing plan.")
public class AccountBillingPlan implements Serializable {

    @SerializedName("addOns")
    private java.util.List<AddOn> addOns = new java.util.ArrayList<AddOn>();

    @SerializedName("canCancelRenewal")
    private String canCancelRenewal = null;

    @SerializedName("canUpgrade")
    private String canUpgrade = null;

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("enableSupport")
    private String enableSupport = null;

    @SerializedName("includedSeats")
    private String includedSeats = null;

    @SerializedName("incrementalSeats")
    private String incrementalSeats = null;

    @SerializedName("isDowngrade")
    private String isDowngrade = null;

    @SerializedName("otherDiscountPercent")
    private String otherDiscountPercent = null;

    @SerializedName("paymentCycle")
    private String paymentCycle = null;

    @SerializedName("paymentMethod")
    private String paymentMethod = null;

    @SerializedName("perSeatPrice")
    private String perSeatPrice = null;

    @SerializedName("planClassification")
    private String planClassification = null;

    @SerializedName("planFeatureSets")
    private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();

    @SerializedName("planId")
    private String planId = null;

    @SerializedName("planName")
    private String planName = null;

    @SerializedName("renewalStatus")
    private String renewalStatus = null;

    @SerializedName("seatDiscounts")
    private java.util.List<SeatDiscount> seatDiscounts = new java.util.ArrayList<SeatDiscount>();

    @SerializedName("supportIncidentFee")
    private String supportIncidentFee = null;

    @SerializedName("supportPlanFee")
    private String supportPlanFee = null;


    /**
     * Reserved:
     **/
    @ApiModelProperty(value = "Reserved:")
    public java.util.List<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(java.util.List<AddOn> addOns) {
        this.addOns = addOns;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getCanCancelRenewal() {
        return canCancelRenewal;
    }

    public void setCanCancelRenewal(String canCancelRenewal) {
        this.canCancelRenewal = canCancelRenewal;
    }


    /**
     * When set to **true**, specifies that you can upgrade the account through the API.
     **/
    @ApiModelProperty(value = "When set to **true**, specifies that you can upgrade the account through the API.")
    public String getCanUpgrade() {
        return canUpgrade;
    }

    public void setCanUpgrade(String canUpgrade) {
        this.canUpgrade = canUpgrade;
    }


    /**
     * Specifies the ISO currency code for the account.
     **/
    @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * When set to **true**, then customer support is provided as part of the account plan.
     **/
    @ApiModelProperty(value = "When set to **true**, then customer support is provided as part of the account plan.")
    public String getEnableSupport() {
        return enableSupport;
    }

    public void setEnableSupport(String enableSupport) {
        this.enableSupport = enableSupport;
    }


    /**
     * The number of seats (users) included.
     **/
    @ApiModelProperty(value = "The number of seats (users) included.")
    public String getIncludedSeats() {
        return includedSeats;
    }

    public void setIncludedSeats(String includedSeats) {
        this.includedSeats = includedSeats;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getIncrementalSeats() {
        return incrementalSeats;
    }

    public void setIncrementalSeats(String incrementalSeats) {
        this.incrementalSeats = incrementalSeats;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsDowngrade() {
        return isDowngrade;
    }

    public void setIsDowngrade(String isDowngrade) {
        this.isDowngrade = isDowngrade;
    }


    /**
     * Any other percentage discount for the plan.
     **/
    @ApiModelProperty(value = " Any other percentage discount for the plan. ")
    public String getOtherDiscountPercent() {
        return otherDiscountPercent;
    }

    public void setOtherDiscountPercent(String otherDiscountPercent) {
        this.otherDiscountPercent = otherDiscountPercent;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(String paymentCycle) {
        this.paymentCycle = paymentCycle;
    }


    /**
     * The payment method used with the plan. The possible values are: CreditCard, PurchaseOrder, Premium, or Freemium.
     **/
    @ApiModelProperty(value = " The payment method used with the plan. The possible values are: CreditCard, PurchaseOrder, Premium, or Freemium. ")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPerSeatPrice() {
        return perSeatPrice;
    }

    public void setPerSeatPrice(String perSeatPrice) {
        this.perSeatPrice = perSeatPrice;
    }


    /**
     * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
     **/
    @ApiModelProperty(value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
    public String getPlanClassification() {
        return planClassification;
    }

    public void setPlanClassification(String planClassification) {
        this.planClassification = planClassification;
    }


    /**
     * A complex type that sets the feature sets for the account. It contains the following information (all string content):\n\n* currencyFeatureSetPrices - Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, seatFee that are configured for this plan feature set.\n* envelopeFee - An incremental envelope cost for plans with envelope overages (when isEnabled=true).\n* featureSetId - A unique ID for the feature set.\n* fixedFee - A one-time fee associated with the plan (when isEnabled=true).\n* isActive - Specifies whether the feature set is actively set as part of the plan.\n* isEnabled - Specifies whether the feature set is actively enabled as part of the plan.\n* name - The name of the feature set.\n* seatFee - An incremental seat cost for seat-based plans (when isEnabled=true).\n
     **/
    @ApiModelProperty(value = "A complex type that sets the feature sets for the account. It contains the following information (all string content):\n\n* currencyFeatureSetPrices - Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, seatFee that are configured for this plan feature set.\n* envelopeFee - An incremental envelope cost for plans with envelope overages (when isEnabled=true).\n* featureSetId - A unique ID for the feature set.\n* fixedFee - A one-time fee associated with the plan (when isEnabled=true).\n* isActive - Specifies whether the feature set is actively set as part of the plan.\n* isEnabled - Specifies whether the feature set is actively enabled as part of the plan.\n* name - The name of the feature set.\n* seatFee - An incremental seat cost for seat-based plans (when isEnabled=true).\n")
    public java.util.List<FeatureSet> getPlanFeatureSets() {
        return planFeatureSets;
    }

    public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
        this.planFeatureSets = planFeatureSets;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }


    /**
     * The name of the Billing Plan.
     **/
    @ApiModelProperty(value = "The name of the Billing Plan.")
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }


    /**
     * The renewal status for the account. The acceptable values are:\n\n* auto: The account automatically renews.\n* queued_for_close: Account will be closed at the billingPeriodEndDate.\n* queued_for_downgrade: Account will be downgraded at the billingPeriodEndDate.
     **/
    @ApiModelProperty(value = "The renewal status for the account. The acceptable values are:\n\n* auto: The account automatically renews.\n* queued_for_close: Account will be closed at the billingPeriodEndDate.\n* queued_for_downgrade: Account will be downgraded at the billingPeriodEndDate.")
    public String getRenewalStatus() {
        return renewalStatus;
    }

    public void setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
    }


    /**
     * A complex type that contains any seat discount information.\n\nValues are: BeginSeatCount, EndSeatCount, and SeatDiscountPercent.\n
     **/
    @ApiModelProperty(value = " A complex type that contains any seat discount information.\n\nValues are: BeginSeatCount, EndSeatCount, and SeatDiscountPercent.\n ")
    public java.util.List<SeatDiscount> getSeatDiscounts() {
        return seatDiscounts;
    }

    public void setSeatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
        this.seatDiscounts = seatDiscounts;
    }


    /**
     * The support incident fee charged for each support incident.
     **/
    @ApiModelProperty(value = "The support incident fee charged for each support incident.")
    public String getSupportIncidentFee() {
        return supportIncidentFee;
    }

    public void setSupportIncidentFee(String supportIncidentFee) {
        this.supportIncidentFee = supportIncidentFee;
    }


    /**
     * The support plan fee charged for this plan.
     **/
    @ApiModelProperty(value = "The support plan fee charged for this plan.")
    public String getSupportPlanFee() {
        return supportPlanFee;
    }

    public void setSupportPlanFee(String supportPlanFee) {
        this.supportPlanFee = supportPlanFee;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountBillingPlan accountBillingPlan = (AccountBillingPlan) o;
        return Objects.equals(addOns, accountBillingPlan.addOns) &&
                Objects.equals(canCancelRenewal, accountBillingPlan.canCancelRenewal) &&
                Objects.equals(canUpgrade, accountBillingPlan.canUpgrade) &&
                Objects.equals(currencyCode, accountBillingPlan.currencyCode) &&
                Objects.equals(enableSupport, accountBillingPlan.enableSupport) &&
                Objects.equals(includedSeats, accountBillingPlan.includedSeats) &&
                Objects.equals(incrementalSeats, accountBillingPlan.incrementalSeats) &&
                Objects.equals(isDowngrade, accountBillingPlan.isDowngrade) &&
                Objects.equals(otherDiscountPercent, accountBillingPlan.otherDiscountPercent) &&
                Objects.equals(paymentCycle, accountBillingPlan.paymentCycle) &&
                Objects.equals(paymentMethod, accountBillingPlan.paymentMethod) &&
                Objects.equals(perSeatPrice, accountBillingPlan.perSeatPrice) &&
                Objects.equals(planClassification, accountBillingPlan.planClassification) &&
                Objects.equals(planFeatureSets, accountBillingPlan.planFeatureSets) &&
                Objects.equals(planId, accountBillingPlan.planId) &&
                Objects.equals(planName, accountBillingPlan.planName) &&
                Objects.equals(renewalStatus, accountBillingPlan.renewalStatus) &&
                Objects.equals(seatDiscounts, accountBillingPlan.seatDiscounts) &&
                Objects.equals(supportIncidentFee, accountBillingPlan.supportIncidentFee) &&
                Objects.equals(supportPlanFee, accountBillingPlan.supportPlanFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addOns, canCancelRenewal, canUpgrade, currencyCode, enableSupport, includedSeats, incrementalSeats, isDowngrade, otherDiscountPercent, paymentCycle, paymentMethod, perSeatPrice, planClassification, planFeatureSets, planId, planName, renewalStatus, seatDiscounts, supportIncidentFee, supportPlanFee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountBillingPlan {\n");

        sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
        sb.append("    canCancelRenewal: ").append(toIndentedString(canCancelRenewal)).append("\n");
        sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
        sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
        sb.append("    incrementalSeats: ").append(toIndentedString(incrementalSeats)).append("\n");
        sb.append("    isDowngrade: ").append(toIndentedString(isDowngrade)).append("\n");
        sb.append("    otherDiscountPercent: ").append(toIndentedString(otherDiscountPercent)).append("\n");
        sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
        sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
        sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
        sb.append("    seatDiscounts: ").append(toIndentedString(seatDiscounts)).append("\n");
        sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
        sb.append("    supportPlanFee: ").append(toIndentedString(supportPlanFee)).append("\n");
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

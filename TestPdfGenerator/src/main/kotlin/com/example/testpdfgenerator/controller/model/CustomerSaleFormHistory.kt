package com.example.testpdfgenerator.controller.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.time.ZonedDateTime

/**
 * A CustomerSaleFormHistory.
 */

data class CustomerSaleFormHistory(

        var id: Long? = 1,

        var gender: String? = "FEMALE",


        var saleId: Long? = 1,


        var companyName: String? = "Austria",


        var vatNo: String? = "adadsas",


        var city: String? = "Wein",

        var state: String? = "ERR3",


        var birthday: ZonedDateTime? = ZonedDateTime.now(),


        var name: String? = "Dnnnnn",


        var firstName: String? = "Dni WEEEE",

        var title: String? = "Title",


        var street: String? = "Street 63529. jhg",


        var postcodeCity: String? = "SDSD",


        var country: String? = "Ger",


        var phone: String? = null,


        var email: String? = null,


        var height: String? = null,


        var weight: String? = null,

        var medicationDosage: String? = null,


        var generalFatigue: Boolean? = true,


        var sweating: Boolean? = true,

        var allergies: Boolean? = false,


        var weaknessOfConnectiveTissue: Boolean? = false,


        var edema: Boolean? = false,


        var drySkin: Boolean? = true,


        var autoimmuneDisease: Boolean? = null,


        var osteoporosis: Boolean? = null,

        var infectionAndInflammationTendency: Boolean? = null,


        var diabetesMellitus: Boolean? = null,

        var irritableBowel: Boolean? = null,


        var cravings: Boolean? = null,


        var weightGain: Boolean? = null,


        var jointProblems: Boolean? = null,

        var otherGeneralPhysicalComplaints: Boolean? = null,


        var emotionalStress: Boolean? = null,


        var lackOfConcentration: Boolean? = null,


        var burnout: Boolean? = null,


        var depression: Boolean? = null,


        var nervousness: Boolean? = null,


        var panicAttacks: Boolean? = null,


        var moodSwings: Boolean? = null,


        var adsAdhd: Boolean? = null,


        var sleepDisorders: Boolean? = null,

        var chronicFatigue: Boolean? = null,


        var sensitivityToLightAndSound: Boolean? = null,


        var aggression: Boolean? = null,


        var memoryDisorders: Boolean? = null,


        var otherMentalComplaints: Boolean? = null,

        var highInProtein: Boolean? = null,


        var richInVitamins: Boolean? = null,

        var vegetarianVegan: Boolean? = null,


        var highInFat: Boolean? = null,


        var nutritionOther: Boolean? = null,


        var noExtraordinaryStress: Boolean? = null,


        var psychologicalStress: Boolean? = null,


        var physicalStress: Boolean? = null,


        var noSport: Boolean? = null,


        var occasionalSport: Boolean? = null,


        var dailySport: Boolean? = null,


        var sports: Boolean? = null,


        var nonSmoker: Boolean? = null,


        var smoker: Boolean? = null,


        var noPleasure: Boolean? = null,


        var occasionalUse: Boolean? = null,


        var regularUse: Boolean? = null,


        var unfulfilledDesireToHaveChildren: Boolean? = null,


        var pms: Boolean? = null,


        var hotFlashes: Boolean? = null,


        var lossOfLibido: Boolean? = null,


        var breastSensitivity: Boolean? = null,


        var heavyMenstruation: Boolean? = null,


        var irregularCycle: Boolean? = null,


        var dryMucousMembranes: Boolean? = null,


        var cellulitis: Boolean? = null,


        var especiallyForWomenHairLoss: Boolean? = null,


        var premenstrualMigraine: Boolean? = null,


        var especiallyForWomenOther: Boolean? = null,


        var erectileDysfunction: Boolean? = null,

        var potencyDisorder: Boolean? = null,


        var especiallyForMenHairLoss: Boolean? = null,


        var prostateComplaints: Boolean? = null,


        var especiallyForMenOther: Boolean? = null,


        @JsonIgnore
    var isDeleted: Boolean? = null,


        @JsonIgnore
    var deleted: ZonedDateTime? = null,

        @JsonIgnore
    var deletedBy: Long? = null,

        var updated: ZonedDateTime? = null,


        var updatedBy: Long? = null,

        var created: ZonedDateTime? = null,

        var createdBy: Long? = null

    // jhipster-needle-entity-add-field - JHipster will add fields here
) : Serializable {

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CustomerSaleFormHistory) return false

        return id != null && other.id != null && id == other.id
    }

    override fun hashCode() = 31

    override fun toString() = "CustomerSaleFormHistory{" +
        "id=$id" +
        ", gender='$gender'" +
        ", birthday='$birthday'" +
        ", name='$name'" +
        ", firstName='$firstName'" +
        ", title='$title'" +
        ", street='$street'" +
        ", postcodeCity='$postcodeCity'" +
        ", country='$country'" +
        ", phone='$phone'" +
        ", email='$email'" +
        ", height='$height'" +
        ", weight='$weight'" +
        ", medicationDosage='$medicationDosage'" +
        ", generalFatigue='$generalFatigue'" +
        ", sweating='$sweating'" +
        ", allergies='$allergies'" +
        ", weaknessOfConnectiveTissue='$weaknessOfConnectiveTissue'" +
        ", edema='$edema'" +
        ", drySkin='$drySkin'" +
        ", autoimmuneDisease='$autoimmuneDisease'" +
        ", osteoporosis='$osteoporosis'" +
        ", infectionAndInflammationTendency='$infectionAndInflammationTendency'" +
        ", diabetesMellitus='$diabetesMellitus'" +
        ", irritableBowel='$irritableBowel'" +
        ", cravings='$cravings'" +
        ", weightGain='$weightGain'" +
        ", jointProblems='$jointProblems'" +
        ", otherGeneralPhysicalComplaints='$otherGeneralPhysicalComplaints'" +
        ", emotionalStress='$emotionalStress'" +
        ", lackOfConcentration='$lackOfConcentration'" +
        ", burnout='$burnout'" +
        ", depression='$depression'" +
        ", nervousness='$nervousness'" +
        ", panicAttacks='$panicAttacks'" +
        ", moodSwings='$moodSwings'" +
        ", adsAdhd='$adsAdhd'" +
        ", sleepDisorders='$sleepDisorders'" +
        ", chronicFatigue='$chronicFatigue'" +
        ", sensitivityToLightAndSound='$sensitivityToLightAndSound'" +
        ", aggression='$aggression'" +
        ", memoryDisorders='$memoryDisorders'" +
        ", otherMentalComplaints='$otherMentalComplaints'" +
        ", highInProtein='$highInProtein'" +
        ", richInVitamins='$richInVitamins'" +
        ", vegetarianVegan='$vegetarianVegan'" +
        ", highInFat='$highInFat'" +
        ", nutritionOther='$nutritionOther'" +
        ", noExtraordinaryStress='$noExtraordinaryStress'" +
        ", psychologicalStress='$psychologicalStress'" +
        ", physicalStress='$physicalStress'" +
        ", noSport='$noSport'" +
        ", occasionalSport='$occasionalSport'" +
        ", dailySport='$dailySport'" +
        ", sports='$sports'" +
        ", nonSmoker='$nonSmoker'" +
        ", smoker='$smoker'" +
        ", noPleasure='$noPleasure'" +
        ", occasionalUse='$occasionalUse'" +
        ", regularUse='$regularUse'" +
        ", unfulfilledDesireToHaveChildren='$unfulfilledDesireToHaveChildren'" +
        ", pms='$pms'" +
        ", hotFlashes='$hotFlashes'" +
        ", lossOfLibido='$lossOfLibido'" +
        ", breastSensitivity='$breastSensitivity'" +
        ", heavyMenstruation='$heavyMenstruation'" +
        ", irregularCycle='$irregularCycle'" +
        ", dryMucousMembranes='$dryMucousMembranes'" +
        ", cellulitis='$cellulitis'" +
        ", especiallyForWomenHairLoss='$especiallyForWomenHairLoss'" +
        ", premenstrualMigraine='$premenstrualMigraine'" +
        ", especiallyForWomenOther='$especiallyForWomenOther'" +
        ", erectileDysfunction='$erectileDysfunction'" +
        ", potencyDisorder='$potencyDisorder'" +
        ", especiallyForMenHairLoss='$especiallyForMenHairLoss'" +
        ", prostateComplaints='$prostateComplaints'" +
        ", especiallyForMenOther='$especiallyForMenOther'" +
        "}"

    companion object {
        private const val serialVersionUID = 1L
    }
}

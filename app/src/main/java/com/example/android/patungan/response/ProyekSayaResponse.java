package com.example.android.patungan.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id_proyek",
        "proyek_nama",
        "slot_id",
        "status_pemabayran",
        "ada_proyek",
        "slot_date"
})
public class ProyekSayaResponse {

    @JsonProperty("id_proyek")
    private String idProyek;
    @JsonProperty("proyek_nama")
    private String proyekNama;
    @JsonProperty("slot_id")
    private String slotId;
    @JsonProperty("status_pemabayran")
    private String statusPemabayran;
    @JsonProperty("ada_proyek")
    private Boolean adaProyek;
    @JsonProperty("slot_date")
    private String slotDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id_proyek")
    public String getIdProyek() {
        return idProyek;
    }

    @JsonProperty("id_proyek")
    public void setIdProyek(String idProyek) {
        this.idProyek = idProyek;
    }

    @JsonProperty("proyek_nama")
    public String getProyekNama() {
        return proyekNama;
    }

    @JsonProperty("proyek_nama")
    public void setProyekNama(String proyekNama) {
        this.proyekNama = proyekNama;
    }

    @JsonProperty("slot_id")
    public String getSlotId() {
        return slotId;
    }

    @JsonProperty("slot_id")
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    @JsonProperty("status_pemabayran")
    public String getStatusPemabayran() {
        return statusPemabayran;
    }

    @JsonProperty("status_pemabayran")
    public void setStatusPemabayran(String statusPemabayran) {
        this.statusPemabayran = statusPemabayran;
    }

    @JsonProperty("ada_proyek")
    public Boolean getAdaProyek() {
        return adaProyek;
    }

    @JsonProperty("ada_proyek")
    public void setAdaProyek(Boolean adaProyek) {
        this.adaProyek = adaProyek;
    }

    @JsonProperty("slot_date")
    public String getSlotDate() {
        return slotDate;
    }

    @JsonProperty("slot_date")
    public void setSlotDate(String slotDate) {
        this.slotDate = slotDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
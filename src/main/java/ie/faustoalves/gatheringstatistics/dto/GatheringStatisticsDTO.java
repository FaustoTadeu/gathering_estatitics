package ie.faustoalves.gatheringstatistics.dto;

public class GatheringStatisticsDTO {
    private Long idKey;

    public Integer acessed;

    public Long idSelected;

    public GatheringStatisticsDTO() {
    }

    public GatheringStatisticsDTO(Long idKey, Integer acessed) {
        this.idKey = idKey;
        this.acessed = acessed;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    public Integer getAcessed() {
        return acessed;
    }

    public void setAcessed(Integer acessed) {
        this.acessed = acessed;
    }

    public Long getIdSelected() {
        return idSelected;
    }

    public void setIdSelected(Long idSelected) {
        this.idSelected = idSelected;
    }
}

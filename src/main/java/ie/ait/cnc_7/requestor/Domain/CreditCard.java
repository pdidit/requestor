package ie.ait.cnc_7.requestor.Domain;

import javax.persistence.*;
import org.hibernate.validator.constraints.Range;
import org.springframework.lang.NonNull;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.net.Inet4Address;
import java.sql.Timestamp;

@Entity
@Table(name = "creditcard")
public class CreditCard {
    @Id
    @NotNull
    @Range(min=1_000_000_000_000_000L,max= 9_999_999_999_999_999L)
    private Long pan; //`pan` int(16) NOT NULL
    @NotNull
    @Range(min=1_000_000_000_000_000L,max= 9_999_999_999_999_999L)
    private Long tranid; // `tranid` int(16) NOT NULL,

    @NotNull
    @Size(max = 128)
    private String name; //   `name` varchar(128) NOT NULL,

    @NonNull
    @Range(min=1_000_000_000_000_000L,max= 9_999_999_999_999_999L)
    private Long merchid; // `merchid` int(16) NOT NULL

    @NotNull
    @Range(min=1, max=12)
    private Integer expmonth; //`expmonth` int(2) NOT NULL,
    @NotNull
    @Range(min=0, max=99)
    private Integer expyear; //  `expyear` int(2) NOT NULL,
    @NotNull
    @Range(min=100, max=999)
    private Integer csv; //  `csv` int(3) NOT NULL,
    @NotNull
    private Timestamp initime; // `initime` TimestampTIME NOT NULL,
    @NotNull
    @Range(min=10000000, max=99999999)
    private Integer authcode; //`authcode` int(8) NOT NULL,
    @NotNull
    private Timestamp authtime; // `authtime` TimestampTIME NOT NULL,
    @NotNull
    private Timestamp comptime; // `comptime` TimestampTIME NOT NULL,

    public Long getPan() {
        return pan;
    }

    public void setPan(Long pan) {
        this.pan = pan;
    }

    public Long getTranid() {
        return tranid;
    }

    public void setTranid(Long tranid) {
        this.tranid = tranid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMerchid() {
        return merchid;
    }

    public void setMerchid(Long merchid) {
        this.merchid = merchid;
    }

    public Integer getExpmonth() {
        return expmonth;
    }

    public void setExpmonth(Integer expmonth) {
        this.expmonth = expmonth;
    }

    public Integer getExpyear() {
        return expyear;
    }

    public void setExpyear(Integer expyear) {
        this.expyear = expyear;
    }

    public Integer getCsv() {
        return csv;
    }

    public void setCsv(Integer csv) {
        this.csv = csv;
    }

    public Timestamp getInitime() {
        return initime;
    }

    public void setInitime(Timestamp initime) {
        this.initime = initime;
    }

    public Integer getAuthcode() {
        return authcode;
    }

    public void setAuthcode(Integer authcode) {
        this.authcode = authcode;
    }

    public Timestamp getAuthtime() {
        return authtime;
    }

    public void setAuthtime(Timestamp authtime) {
        this.authtime = authtime;
    }

    public Timestamp getComptime() {
        return comptime;
    }

    public void setComptime(Timestamp comptime) {
        this.comptime = comptime;
    }
}

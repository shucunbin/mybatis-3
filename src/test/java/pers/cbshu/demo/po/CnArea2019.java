package pers.cbshu.demo.po;

import java.math.BigDecimal;

/**
 * 2019 中国各级新政区域.
 *
 * @author shucunbin
 * @date 2020/10/20 15:14
 */
public class CnArea2019 {
  /**
   * 唯一标识
   */
  private Integer id;

  /**
   * 层级
   */
  private Integer level;

  /**
   * 父级行政代码
   */
  private Long parentCode;

  /**
   * 行政代码
   */
  private Long areaCode;

  /**
   * 邮政编码
   */
  private Integer  zipCode;

  /**
   * 区号
   */
  private String cityCode;

  /**
   * 名称
   */
  private String name;

  /**
   * 简称
   */
  private String shortName;

  /**
   * 组合名
   */
  private String mergerName;

  /**
   * 拼音
   */
  private String pinyin;

  /**
   * 经度
   */
  private BigDecimal lng;

  /**
   * 纬度
   */
  private BigDecimal lat;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Long getParentCode() {
    return parentCode;
  }

  public void setParentCode(Long parentCode) {
    this.parentCode = parentCode;
  }

  public Long getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(Long areaCode) {
    this.areaCode = areaCode;
  }

  public Integer getZipCode() {
    return zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }

  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getMergerName() {
    return mergerName;
  }

  public void setMergerName(String mergerName) {
    this.mergerName = mergerName;
  }

  public String getPinyin() {
    return pinyin;
  }

  public void setPinyin(String pinyin) {
    this.pinyin = pinyin;
  }

  public BigDecimal getLng() {
    return lng;
  }

  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }

  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  @Override
  public String toString() {
    return "CnArea2019{" +
      "id=" + id +
      ", level=" + level +
      ", parentCode=" + parentCode +
      ", areaCode=" + areaCode +
      ", zipCode=" + zipCode +
      ", cityCode='" + cityCode + '\'' +
      ", name='" + name + '\'' +
      ", shortName='" + shortName + '\'' +
      ", mergerName='" + mergerName + '\'' +
      ", pinyin='" + pinyin + '\'' +
      ", lng=" + lng +
      ", lat=" + lat +
      '}';
  }
}

package me.chanjar.weixin.mp.bean.kefu.result;

import com.google.gson.annotations.SerializedName;
import me.chanjar.weixin.common.util.ToStringUtils;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author Binary Wang
 */
public class WxMpKfSessionWaitCaseList implements Serializable {
  private static final long serialVersionUID = 2432132626631361922L;

  /**
   * count 未接入会话数量
   */
  @SerializedName("count")
  private Long count;

  /**
   * waitcaselist 未接入会话列表，最多返回100条数据
   */
  @SerializedName("waitcaselist")
  private List<WxMpKfSession> kfSessionWaitCaseList;

  public static WxMpKfSessionWaitCaseList fromJson(String json) {
    return WxMpGsonBuilder.INSTANCE.create().fromJson(json,
      WxMpKfSessionWaitCaseList.class);
  }

  @Override
  public String toString() {
    return ToStringUtils.toSimpleString(this);
  }

  public List<WxMpKfSession> getKfSessionWaitCaseList() {
    return this.kfSessionWaitCaseList;
  }

  public void setKfSessionWaitCaseList(List<WxMpKfSession> kfSessionWaitCaseList) {
    this.kfSessionWaitCaseList = kfSessionWaitCaseList;
  }

}

package com.example.demo.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户类
 * @author CJ
 * @date 2018-06-09 13:17:05
 */
public class User implements Serializable {

    
	/**
	 *
	 */
		
	private static final long serialVersionUID = 1L;

	/** 用户ID */
    private Integer pkid;

    /** 用户账户 */
    private String usercode;

    /** 用户密码 */
    private String userpwd;

    /** 用户名称 */
    private String username;

    /** 用户昵称 */
    private String nickname;

    /** 超级管理员=1, 系统管理员=2, 普通人员=4, 工作人员=8, 文秘人员=16 @see UserTypeEnm */ 
    private Integer usertype;

    /** 系统管理员=1, 办公管理员=2, @see ManagerUserTypeEnm */
    private Integer managerusertype;

    /** 未知=0, 男=1, 女=2 */
    private Integer usersex;

    /** 职位职称 */
    private String userrank;

    /**  人员关联部门，dptname,dptname,dptname */
    private String deptlist;

    /** 隶属公司 */
    private String company;

    /** 邮箱 */
    private String email;

    /** 手机 */
    private String phone;

    /** 头像地址 */
    private String avatarpath;

    /** 小头像地址 */
    private String smallavatarpath;

    /** 正常=1, 禁用=2, 已删除=3, 临时 = 8  @see UserStatusEnm */
    private Integer userstatus;

    /** 身份识别卡号 */
    private String rfid;

    /** 联系信息 */
    private String contactinfo;

    /** 排序 */
    private Integer sort;

    /** 人员权限 */
    private String privilege;

    /** 操作时间 */
    private Date filltime;

    /** 扩展1 */
    private String ext1;

    /** 扩展2 */
    private String ext2;

    /** 扩展3 */
    private String ext3;

    /** 全体ID */
    private String multiid;
	
	 /* //临时变量-s
    private String startTime; 
    private String endTime;
    //临时变量-e
    
    public String getStartTime() {
    	return startTime;
    }
    
    public void setStartTime(String startTime) {
    	this.startTime = startTime;
    }
    
    public String getEndTime() {
    	return endTime;
    }
    
    public void setEndTime(String endTime) {
    	this.endTime = endTime;
    }*/
    
	//临时变量-s
    //部门名称
	private String deptName;//部门名称
	private String deptId;// 部门ID
	private String orgParty;//党组织名称
	private String orgPartyId;//党组织ID
	private String npcName;//人大名称
	private String npcId;//人大ID
	private String committeeName;//常委会名称
	private String committeeId;//常委会ID
	private List<Integer> managerusertypes;//管理员数组
    private String lastLoginIp;
	//临时变量-s

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getManagerusertype() {
        return managerusertype;
    }

    public void setManagerusertype(Integer managerusertype) {
        this.managerusertype = managerusertype;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public String getUserrank() {
        return userrank;
    }

    public void setUserrank(String userrank) {
        this.userrank = userrank;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatarpath() {
        return avatarpath;
    }

    public void setAvatarpath(String avatarpath) {
        this.avatarpath = avatarpath;
    }

    public String getSmallavatarpath() {
        return smallavatarpath;
    }

    public void setSmallavatarpath(String smallavatarpath) {
        this.smallavatarpath = smallavatarpath;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Date getFilltime() {
        return filltime;
    }

    public void setFilltime(Date filltime) {
        this.filltime = filltime;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getMultiid() {
        return multiid;
    }

    public void setMultiid(String multiid) {
        this.multiid = multiid;
    }

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

    public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getOrgParty() {
		return orgParty;
	}

	public void setOrgParty(String orgParty) {
		this.orgParty = orgParty;
	}

	public String getOrgPartyId() {
		return orgPartyId;
	}

	public void setOrgPartyId(String orgPartyId) {
		this.orgPartyId = orgPartyId;
	}

	public String getNpcName() {
		return npcName;
	}

	public void setNpcName(String npcName) {
		this.npcName = npcName;
	}

	public String getNpcId() {
		return npcId;
	}

	public void setNpcId(String npcId) {
		this.npcId = npcId;
	}

	public String getCommitteeName() {
		return committeeName;
	}

	public void setCommitteeName(String committeeName) {
		this.committeeName = committeeName;
	}

	public String getCommitteeId() {
		return committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public List<Integer> getManagerusertypes() {
		return managerusertypes;
	}

	public void setManagerusertypes(List<Integer> managerusertypes) {
		this.managerusertypes = managerusertypes;
	}

    public String getDeptlist() {
        return deptlist;
    }

    public void setDeptlist(String deptlist) {
        this.deptlist = deptlist;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Override
    public String toString() {
        return "User{" +
                "pkid=" + pkid +
                ", usercode='" + usercode + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", usertype=" + usertype +
                ", managerusertype=" + managerusertype +
                ", usersex=" + usersex +
                ", userrank='" + userrank + '\'' +
                ", deptlist='" + deptlist + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", avatarpath='" + avatarpath + '\'' +
                ", smallavatarpath='" + smallavatarpath + '\'' +
                ", userstatus=" + userstatus +
                ", rfid='" + rfid + '\'' +
                ", contactinfo='" + contactinfo + '\'' +
                ", sort=" + sort +
                ", privilege='" + privilege + '\'' +
                ", filltime=" + filltime +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", multiid='" + multiid + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptId='" + deptId + '\'' +
                ", orgParty='" + orgParty + '\'' +
                ", orgPartyId='" + orgPartyId + '\'' +
                ", npcName='" + npcName + '\'' +
                ", npcId='" + npcId + '\'' +
                ", committeeName='" + committeeName + '\'' +
                ", committeeId='" + committeeId + '\'' +
                ", managerusertypes=" + managerusertypes +
                '}';
    }
}

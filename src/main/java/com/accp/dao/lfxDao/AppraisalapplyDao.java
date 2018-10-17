package com.accp.dao.lfxDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Post;
import com.accp.pojo.Putforwardrecord;
import com.accp.pojo.User;
import com.accp.vo.AppraisalapplyVo;
import com.accp.vo.PostVo;
import com.accp.vo.PutforwardrecordVo;

public interface AppraisalapplyDao {

public List<Appraisalapply> queryapply(@Param("userid") Integer userid,@Param("auditstatus") Integer auditstatus);
//鉴定申请vo
public List<AppraisalapplyVo> queryapplyVo(@Param("userName") String userName,@Param("auditStatus") Integer auditStatus);
//取消鉴定
public void modifyapply(@Param("auditStatus") Integer auditStatus,@Param("applyID") Integer applyID);
//查看鉴定详情
public AppraisalapplyVo queryapplyVox(@Param("applyID") Integer applyID);
//查看商家入驻
public List<User> queryShoppentry(@Param("userName")String userName,@Param("merchantType") Integer merchantType,@Param("auditStatus") Integer auditStatus);
//查看入驻详情
public User queryentryx(@Param("userid") Integer userid);
//提现管理
public List<PutforwardrecordVo> querytixian();
//查看提现管理详情
public PutforwardrecordVo querytixianx(@Param("pfrID") Integer pfrID);
//查看帖子
public List<PostVo> querypost(@Param("fName") String fName,@Param("title") String title);
//查看帖子详情
public PostVo querypostx(@Param("postID") Integer postID);
//修改帖子
public void modifypost(@Param("auditStatus") Integer auditStatus,@Param("operatingState") Integer operatingState,@Param("adminOpinion") String adminOpinion,@Param("postID") Integer postID);
//删除帖子
public void removepost(@Param("postid")  Integer [] postid);
}

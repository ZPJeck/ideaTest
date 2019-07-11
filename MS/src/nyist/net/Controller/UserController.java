/*package nyist.net.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import nyist.net.po.BaoXiu;
import nyist.net.po.User;
import nyist.net.service.AdminService;
import nyist.net.service.BaoXiuService;
import nyist.net.service.HygieneService;
import nyist.net.service.LossService;
import nyist.net.service.UserService;
import nyist.net.service.WaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
	@Autowired
	private BaoXiuService baoXiuService; 
	@Autowired
	private LossService lossService;
	@Autowired
	private HygieneService hygieneService;
	@Autowired
	private WaterService waterService;
	
	 * 跳转到UserLoginOK
	 
	@RequestMapping("jumpUser")
	public String jumpUser(){
		
		return "UserLoginOK";
	}
	
	
	 * 查询报修信息
	 
	@RequestMapping("UqueryBaoXiu")
	 public String UqueryBaoXiu(HttpSession session,HttpServletRequest req){
		 User user1 =(User)session.getAttribute("user");
		 System.out.println(user1);
		 Integer BxDnum=user1.getDnum();
		 
		 BaoXiu baoXiu=baoXiuService.SelectById(BxDnum);
		 System.out.println("baoXiu:"+baoXiu);
		 req.setAttribute("baoXiu", baoXiu);
		 return "User/SelectByB";
	 }
	
	 * 添加保修情况
	 
	@RequestMapping("insertBx")
	public String insertBx(BaoXiu baoXiu){
		
		String BxExa="未审核";
		baoXiu.setBxExa(BxExa);
		baoXiuService.InserBaoxiu(baoXiu);
		
		
		return "";
	}
	
	
}
*/
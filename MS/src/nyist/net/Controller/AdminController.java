package nyist.net.Controller;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.Spring;
import javax.xml.crypto.Data;

import nyist.net.po.Admin;
import nyist.net.po.BaoXiu;
import nyist.net.po.Hygiene;
import nyist.net.po.Loss;
import nyist.net.po.User;
import nyist.net.po.Water;
import nyist.net.service.AdminService;
import nyist.net.service.BaoXiuService;
import nyist.net.service.HygieneService;
import nyist.net.service.LossService;
import nyist.net.service.UserService;
import nyist.net.service.WaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.bcel.internal.generic.NEW;



@Controller
public class AdminController {
	
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
	
	 /*
	  * 学生和管理员 登录验证
	  */
	 @RequestMapping("Login")
	 public String Login(Model model,HttpServletRequest req,HttpSession session){
		 String username=req.getParameter("username");
		 String password=req.getParameter("password");
		 String position=req.getParameter("position");
		 System.out.println("usernmae:"+username);
		 System.out.println("password:"+password);
		 System.out.println("position:"+position);
		
		 if("管理员".equals(position)){
			 Admin admin = new Admin();
			 admin.setUsername(username);
			 admin.setPassword(password);
			 Admin admin2 = adminService.SelectAdmin(admin);
			 if(admin2 != null){
				 return "AdminLoginOk";
			 }
			 else {
				return "index";
			}
		 }
		 else {
			User user= new User();
			user.setUsername(username);
			user.setPassword(password);
			
			if(userService.SelectUser(user) != null){
				User user2=new User();
				
				user2=userService.SelectUser(user);
				System.out.println(user2);
				session.setAttribute("user2", user2);
				return "UserLoginOK";
			}else {
				return "index";
			}
			
		}
	 }
	 /*
	  * 跳转学生信息录入
	  */
	 @RequestMapping("jumpInsertUser")
	 public String jumpInsertUser(){
		 return "Admin/insertUser";
	 }
	 /*
	  * 管理员添加学生信息
	  * 
	  */
	
	 @RequestMapping("insertUser")
	 public String insertUser(HttpServletRequest req,Model model,HttpSession session,User user){
		 /*String username=req.getParameter("username");
		 String password=req.getParameter("password");
		 String stu=req.getParameter("stu");
		 String sex=req.getParameter("sex");
		 String Dnum1=req.getParameter("Dnum");
		 System.out.println(Dnum1);
		 String BedNum1=req.getParameter("BedNum");
		 Integer dnum=Integer.parseInt(Dnum1);
		 System.out.println(dnum);
		 Integer bedNum=Integer.parseInt(BedNum1);*/
		
		/* //存到user  对象中
		 User user = new User();
		 user.setBedNum(bedNum);
		 user.setDnum(dnum);
		 user.setPassword(password);
		 user.setSex(sex);
		 user.setUsername(username);
		 user.setStu(stu);*/
		 System.out.println(user);
		 userService.InsertUser(user);
		 System.out.println(user);
		 //用list集合存放数据
		 List<User> userList=userService.selectUsersByAdmin();
		 if (userList !=null) {
			 model.addAttribute("userList",userList);
			 System.out.println(userList);
			 return "Admin/selectUserByAdmin";
		}
		 else {
			 /*
			  * 如果没有用户  提示  没有用户存在  返回添加信息
			  * 否则返回  AdminLoginOK.jsp页面
			  */
			return "AdminLoginOK";
		}
	}
	/*
	 * 查看所有用户的信息
	 */
	 @RequestMapping("queryUser")
	 public String queryUser(Model model){
		 
		 //用list集合存放数据
		 List<User> userList=userService.selectUsersByAdmin();
		 if (userList !=null) {
			 model.addAttribute("userList",userList);
			 System.out.println(userList);
			 return "Admin/selectUserByAdmin";
		}
		 else {
			 /*
			  * 如果没有用户  提示  没有用户存在  返回添加信息
			  * 否则返回  AdminLoginOK.jsp页面
			  */
			return "AdminLoginOK";
		}
	 }
	 
	 /*
	  * 查找报修的状态
	  */
	 @RequestMapping("queryBaoXiu")
	 public String queryBaoXiu(HttpSession session){
		 
		 List<BaoXiu> baoXius=baoXiuService.SelectBXAdmin();
		 System.out.println("baoxiu:"+baoXius);
		 

		 session.setAttribute("baoXius", baoXius);
		 return "/Admin/SelectByB";
	 }
	 /*
	  * 信息的审核(报修)
	  */
	 @RequestMapping("updateBaoxiu")
	 public String  updateBaoxiu(HttpSession session){
		 Integer BxDnum=(Integer) session.getAttribute("BxDnum");
		 System.out.println(BxDnum);
		 baoXiuService.UpdateByDnum(BxDnum);
		 
		 List<BaoXiu> baoXius=baoXiuService.SelectBXAdmin();
	
		 session.setAttribute("baoXius", baoXius);
		 return "/Admin/SelectByB";
	 }
	 /*
	  * 查找遗失信息(遗失)
	  */
	 @RequestMapping("queryLossByAdmin")
	 public String queryLossByAdmin(HttpSession session){
		 
		 List<Loss> queryLoss=lossService.SelectLoss();
		 System.out.println("queryLoss:"+queryLoss);
		 

		 session.setAttribute("queryLoss", queryLoss);
		 return "/Admin/queryLossByAdmin";
	 }
	 /*
	  * 信息的审核(遗失)
	  */
	 @RequestMapping("updateLoss")
	 public String  updateLoss(HttpSession session){
		 String LossStu=(String ) session.getAttribute("LossStu");
		 System.out.println(LossStu);
		 lossService.AlterLoss(LossStu);
		 
		 List<Loss> queryLoss=lossService.SelectLoss();
	
		 session.setAttribute("queryLoss", queryLoss);
		 return "/Admin/queryLossByAdmin";
	 }
	 /*
	  * 查询卫生信息
	  */
	 @RequestMapping("queryHygiene")
	 public String queryHygiene(Model model,HttpSession session){
		 
		 List<Hygiene> hygiene=hygieneService.SelectHygiene();
		
		 session.setAttribute("hygiene", hygiene);
		 return "Admin/SelectHygiene";
	 }
	 /*
	  * 删除 卫生信息
	  */
	 @RequestMapping("DeleteHygiene")
	 public String DeleteHygiene(Model model,HttpSession session){
		 
		 Integer HDnum=(Integer ) session.getAttribute("HDnum");
		 System.out.println(HDnum);
		 hygieneService.DelectHg(HDnum);
		 
		 List<Hygiene> hygiene=hygieneService.SelectHygiene();
		 session.setAttribute("hygiene", hygiene);
		 System.out.println(hygiene);
		 return "Admin/SelectHygiene";
	 }
	 /*
	  * 添加卫生信息
	  */
	 @RequestMapping("two")
	 public String two(){
		 return "Admin/insertHygiene";
	 }
	 @RequestMapping("insertHygiene")
	 public String insertHygiene(Hygiene hygiene,HttpSession session ){
		 System.out.println(hygiene);
		 hygieneService.InsertHg(hygiene);
		 List<Hygiene> hygiene1=hygieneService.SelectHygiene();
			
		 session.setAttribute("hygiene", hygiene1);
		 return "Admin/SelectHygiene";
	 }
	 
	 
	 /*
	  * 查询水电费信息
	  */
	 @RequestMapping("queryWater")
	 public String queryWater(Model model,HttpSession session){
		 
		 List<Water> waters=waterService.selectWaterAdmin();
		
		 session.setAttribute("waters", waters);
		 return "Admin/SelectWater";
	 }
	 /*
	  * 删除 水电费信息
	  */
	 @RequestMapping("DeleteWater")
	 public String DeleteWater(Model model,HttpSession session){
		 
		 Integer We_Dnum=(Integer ) session.getAttribute("We_Dnum");
		 System.out.println(We_Dnum);
		 waterService.DeleteWater(We_Dnum);
		 
		 List<Water> waters=waterService.selectWaterAdmin();
			
		 session.setAttribute("waters", waters);
		 System.out.println(waters);
		 return "Admin/SelectWater";
	 }
	 /*
	  * 添加水电费信息
	  * 
	  * 
	  */
	 @RequestMapping("one")
	 public String one(){
		 System.out.println("4564864681856");
		 return "Admin/insertWater";
	 }
	 @RequestMapping("WaterByAdmin")  
	 public String WaterByAdmin(Water water,HttpSession session ){
		 
		 /*System.out.println(water);
		 water.setWeId("");

		 waterService.InsertWater(water);
		 List<Water> waters=waterService.selectWaterAdmin();
			
		 session.setAttribute("waters", waters);
		 return "Admin/SelectWater";*/
		 return "";
	 }
	 
	 @RequestMapping("insertWater")
	 public String insertWater(HttpSession session ,HttpServletRequest req){
		
		 String We_Dnum1=req.getParameter("We_Dnum");
		 String WeMon1=req.getParameter("WeMon");
		 String WeTime=req.getParameter("WeTime");
		 System.out.println(We_Dnum1);
		 Integer We_Dnum=Integer.parseInt(We_Dnum1);
		 Integer WeMon=Integer.parseInt(WeMon1);
		 Water water=new Water();
		 water.setWe_Dnum(We_Dnum);
		 water.setWeMon(WeMon);
		 water.setWeTime(WeTime);
		 System.out.println(water);
		 water.setWeId("");

		 waterService.InsertWater(water);
		 List<Water> waters=waterService.selectWaterAdmin();
			
		 session.setAttribute("waters", waters);
		 return "Admin/SelectWater";
		 
	 }
	 
	 @RequestMapping("third")
	 public String third(){
		 return "AdminLoginOk";
	 }
	 

}

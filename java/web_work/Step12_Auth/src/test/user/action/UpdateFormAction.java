package test.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.controller.Action;
import test.controller.ActionForward;
import test.users.dao.UsersDao;
import test.users.dto.UsersDto;

public class UpdateFormAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String id =(String)session.getAttribute("id");
		UsersDto dto = UsersDao.getInstance().getData(id);
		request.setAttribute("dto", dto);
		ActionForward af = new ActionForward("/views/users/private/update_form.jsp");
		return af;
	}

}
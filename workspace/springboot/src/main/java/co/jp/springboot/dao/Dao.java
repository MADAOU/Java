package co.jp.springboot.dao;

import java.util.List;

import co.jp.springboot.po.User;


public class Dao {
	private JdbcTemplate jdbcTemplate;
	
	public int insert (User user)throws Exception{
		int inserResult = 1;
		List<User> result = jdbcTemplate.query(
				"select * from TB_USER where user_id= ?",
				new Object[]{user.getUserid()},
				new BeanPropertyRowMapper<User>(User.class));
		if(result.size() > 0){
			inserResult = 0;
		}else{
			inserResult = jdbcTemplate.update(
					"insert into TB_USER values(?,?,?,?)",
					user.getUserId(),user.getPassword(),
					user.getName(),user.getDelFlg());
		}
		return inserResult;
	}
	
	public List<User> getUsers() throws Exception{
		return jdbcTemplate.query("select * from TB_USER",
				new Object[]{},
				new BeanPropertyRowMapper<User>(User.class));
	}
}

package com.spring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
	@Table(name="fath_user_tbl")
	public class User {

		@Id
		@Column(name="ID")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer Id;
		
		@Column(name = "userid")
		private Integer userId;
		
		@Column(columnDefinition="text" ,name = "username")
		private String userName;
		
		@Column(columnDefinition="text" ,name = "email")
		private String email;
		
		@Column(nullable = false ,name = "name")
		private String name;

		@Column(nullable = false ,name = "status")
		private Integer status;
	    
		@Column(nullable = false ,name = "created_date")
		private Date createdDate;
	    
		@Column(nullable = false ,name = "updated_date")
		private Date updatedDate;

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public Date getUpdatedDate() {
			return updatedDate;
		}

		public void setUpdatedDate(Date updatedDate) {
			this.updatedDate = updatedDate;
		}

		
}

package com.spring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
	@Table(name="fath_logindata_tbl")
	public class logindata {

		@Id
		@Column(name="ID")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer Id;
		
		@Column(columnDefinition="text" ,name = "username")
		private String username;
		
		@Column(nullable = false ,name = "status")
		private Integer status;
		
		@Column(nullable = false ,name = "created_date")
		private Date createdDate;

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
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
	    
		
}

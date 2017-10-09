package com.spring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
	@Table(name="fath_chat_tbl")
	public class Chat {

		@Id
		@Column(name="ID")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer Id;
		
		@Column(columnDefinition="text" ,name = "text")
		private String text;
		
		@Column(nullable = false ,name = "from")
		private Integer from;
		
		@Column(nullable = false ,name = "to")
		private Integer to;
		
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

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Integer getFrom() {
			return from;
		}

		public void setFrom(Integer from) {
			this.from = from;
		}

		public Integer getTo() {
			return to;
		}

		public void setTo(Integer to) {
			this.to = to;
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

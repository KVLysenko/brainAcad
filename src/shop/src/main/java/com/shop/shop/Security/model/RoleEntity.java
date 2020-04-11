package com.shop.shop.Security.model;

import com.shop.shop.Catalogs.model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(schema = "security", name = "app_role")
public class RoleEntity extends BaseEntity {


}

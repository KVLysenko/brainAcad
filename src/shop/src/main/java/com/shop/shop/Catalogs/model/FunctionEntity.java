package com.shop.shop.Catalogs.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(schema = "catalog", name = "function")
public class FunctionEntity extends BaseIdNameEntity{

}

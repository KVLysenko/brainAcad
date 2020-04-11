package com.shop.shop.Shop.dto;

import com.shop.shop.Catalogs.model.*;
import com.shop.shop.Shop.model.ProductEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Long cost;
    private String description;
    private HomeTextileEntity homeTextile;
    private ManufacturerEntity manufacturer;
    private FunctionEntity function;
    private MaterialEntity material;
    private ColorEntity color;
    private SizeEntity size;

    public ProductDto(ProductEntity entity){
        this.id = entity.getId();
        this.name=entity.getName();
        this.cost=entity.getCost();
        this.description=entity.getDescription();
        this.homeTextile=entity.getHomeTextile();
        this.manufacturer=entity.getManufacturer();
        this.function=entity.getFunction();
        this.material=entity.getMaterial();
        this.color=entity.getColor();
        this.size=entity.getSize();
    }

    public static List<ProductDto> productEntityListToDtoList(List<ProductEntity> productEntityList){
        List<ProductDto> productDtoList = new ArrayList<>();
        for (ProductEntity entity: productEntityList){
            productDtoList.add(new ProductDto(entity));
        }
        return productDtoList;
    }
}

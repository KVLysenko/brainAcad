package com.shop.shop.Shop.model;

import com.shop.shop.Catalogs.model.*;
import lombok.Data;

import javax.persistence.*;


@NamedEntityGraph(
        name = "Graph.Product",
        includeAllAttributes = false,
        attributeNodes = {
                @NamedAttributeNode(value = "id"),
                @NamedAttributeNode(value = "name"),
                @NamedAttributeNode(value = "cost"),
                @NamedAttributeNode(value = "description"),
                @NamedAttributeNode(value = "homeTextile", subgraph = "SubGraph.homeTextile"),
                @NamedAttributeNode(value = "manufacturer", subgraph = "SubGraph.manufacturer"),
                @NamedAttributeNode(value = "function", subgraph = "SubGraph.function"),
                @NamedAttributeNode(value = "material", subgraph = "SubGraph.material"),
                @NamedAttributeNode(value = "color", subgraph = "SubGraph.color"),
                @NamedAttributeNode(value = "size", subgraph = "SubGraph.size"),
        },
        subgraphs = {
                @NamedSubgraph(
                        name = "SubGraph.homeTextile",
                        attributeNodes = {
                                @NamedAttributeNode(value = "id"),
                                @NamedAttributeNode(value = "name"),
                        }
                ),
                @NamedSubgraph(
                        name = "SubGraph.manufacturer",
                        attributeNodes = {
                                @NamedAttributeNode(value = "id"),
                                @NamedAttributeNode(value = "name"),
                        }
                ),
                @NamedSubgraph(
                        name = "SubGraph.function",
                        attributeNodes = {
                                @NamedAttributeNode(value = "id"),
                                @NamedAttributeNode(value = "name"),
                        }
                ),
                @NamedSubgraph(
                        name = "SubGraph.material",
                        attributeNodes = {
                                @NamedAttributeNode(value = "id"),
                                @NamedAttributeNode(value = "name"),
                        }
                ),
                @NamedSubgraph(
                        name = "SubGraph.color",
                        attributeNodes = {
                                @NamedAttributeNode(value = "id"),
                                @NamedAttributeNode(value = "name"),
                        }
                ),
                @NamedSubgraph(
                        name = "SubGraph.size",
                        attributeNodes = {
                                @NamedAttributeNode(value = "id"),
                                @NamedAttributeNode(value = "name"),
                        }
                )
        }
)


@Data
@Entity
@Table(schema = "shop", name = "product")
public class ProductEntity extends BaseEntity {

    @Column(name = "cost")
    private Long cost;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "home_textile_id")
    private HomeTextileEntity homeTextile;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerEntity manufacturer;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "function_id")
    private FunctionEntity function;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "material_id")
    private MaterialEntity material;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "color_id")
    private ColorEntity color;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "size_id")
    private SizeEntity size;

}

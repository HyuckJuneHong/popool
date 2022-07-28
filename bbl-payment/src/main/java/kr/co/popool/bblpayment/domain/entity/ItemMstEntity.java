package kr.co.popool.bblpayment.domain.entity;

import kr.co.popool.bblpayment.domain.dto.ItemDto;
import kr.co.popool.bblpayment.domain.shared.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@NoArgsConstructor
@Table(name = "tbl_item_mst")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@AttributeOverride(name = "id", column = @Column(name = "item_id"))
@Entity
public abstract class ItemMstEntity extends BaseEntity {

    @Column(nullable = false)
    protected int price;

    @Column(nullable = false)
    protected String name;

    protected ItemMstEntity(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract void update(ItemDto.UPDATE updateDto);
}

package io.pillopl.eventsource.domain.shopitem;

import java.util.UUID;

public interface ShopItemRepository {

    ShopItem save(ShopItem aggregate) ;

    ShopItem getByUUID(UUID uuid);

}
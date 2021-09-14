package com.gw.gd.commonmodels.shop.store.controller.catalog.facade;

import java.util.Optional;

import com.gw.gd.commonmodels.core.model.catalog.catalog.Catalog;
import com.gw.gd.commonmodels.core.model.merchant.MerchantStore;
import com.gw.gd.commonmodels.core.model.reference.language.Language;
import com.gw.gd.commonmodels.shop.model.catalog.catalog.PersistableCatalog;
import com.gw.gd.commonmodels.shop.model.catalog.catalog.PersistableCatalogCategoryEntry;
import com.gw.gd.commonmodels.shop.model.catalog.catalog.ReadableCatalog;
import com.gw.gd.commonmodels.shop.model.catalog.catalog.ReadableCatalogCategoryEntry;
import com.gw.gd.commonmodels.shop.model.entity.ReadableEntityList;

public interface CatalogFacade {

    ReadableCatalog saveCatalog(PersistableCatalog catalog, MerchantStore store, Language language);

    void updateCatalog(Long catalogId, PersistableCatalog catalog, MerchantStore store, Language language);

    void deleteCatalog(Long catalogId, MerchantStore store, Language language);

    boolean uniqueCatalog(String code, MerchantStore store);

    ReadableCatalog getCatalog(String code, MerchantStore store, Language language);

    Catalog getCatalog(String code, MerchantStore store);

    ReadableCatalog getCatalog(Long id, MerchantStore store, Language language);

    ReadableEntityList<ReadableCatalog> getListCatalogs(Optional<String> code, MerchantStore store, Language language, int page, int count);

    ReadableEntityList<ReadableCatalogCategoryEntry> listCatalogEntry(Optional<String> product, Long catalogId, MerchantStore store, Language language, int page, int count);

    ReadableCatalogCategoryEntry getCatalogEntry(Long id, MerchantStore store, Language language);

    ReadableCatalogCategoryEntry addCatalogEntry(PersistableCatalogCategoryEntry entry, MerchantStore store, Language language);

    void removeCatalogEntry(Long catalogId, Long catalogEntryId, MerchantStore store, Language language);

}

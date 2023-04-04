package com.nimai.admin.repository;

import com.nimai.admin.model.NimaiSystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface nimaiSystemConfigRepository extends JpaRepository<NimaiSystemConfig, Integer>, JpaSpecificationExecutor<NimaiSystemConfig> {
  @Query(value = "select * from nimai_system_config ns where ns.id=:i", nativeQuery = true)
  NimaiSystemConfig findBySystemId(int i);
  
  @Query(value = "select * from nimai_system_config ns where ns.system_config_entity=:systemValue", nativeQuery = true)
  NimaiSystemConfig findBySystemValue(String systemValue);
  
  @Query(value = "select ns.system_config_entity_value from nimai_system_config ns where ns.system_config_entity=:string", nativeQuery = true)
  String getimagePath(String string);
  
  @Query(value = "select ns.system_config_entity_value from nimai_system_config ns where ns.system_config_entity='360tfNumber'", nativeQuery = true)
  String findByNumber();
  
  @Query(value = "select ns.system_config_entity_value from nimai_system_config ns where ns.system_config_entity='360tfEmail'", nativeQuery = true)
  String findByEmail();
  
  @Query(value = "select ns.system_config_entity_value from nimai_system_config ns where ns.system_config_entity='CUSTOMER_LINK_EXPIRES'", nativeQuery = true)
  String findByLinkDays();
  
  @Query(value = "select ns.system_config_entity_value from nimai_system_config ns where ns.system_config_entity='referrer_earnings'", nativeQuery = true)
  String earningPercentage();


  @Query(value = "select ns.system_config_entity_value from nimai_system_config ns where ns.system_config_entity=:url", nativeQuery = true)
  String migUrlData(String url);

}

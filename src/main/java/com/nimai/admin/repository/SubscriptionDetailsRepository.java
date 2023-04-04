package com.nimai.admin.repository;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nimai.admin.model.NimaiMCustomer;
import com.nimai.admin.model.NimaiSubscriptionDetails;

@Repository
public interface SubscriptionDetailsRepository
		extends JpaRepository<NimaiSubscriptionDetails, Integer>, JpaSpecificationExecutor<NimaiSubscriptionDetails> {


	@Transactional
	@Modifying
	@Query(value = "UPDATE nimai_subscription_details SET LC_UTILIZED_COUNT=LC_UTILIZED_COUNT-1 WHERE SPL_SERIAL_NUMBER=:serialNumber",nativeQuery = true)
	void updateLcUtilizedCount(Integer serialNumber);

		/*
	 * @Query("from NimaiSubscriptionDetails sub where sub.userid= :userid and status='ACTIVE' "
	 * ) List<NimaiSubscriptionDetails> findByUserid(@Param("userid") NimaiMCustomer
	 * userid);
	 */
	List<NimaiSubscriptionDetails> findByUserid(NimaiMCustomer userid);
	
	@Query(value="\r\n" + 
			" SELECT * FROM nimai_subscription_details ns WHERE\r\n" + 
			"  ns.SUBSCRIPTION_NAME='POSTPAID_PLAN' AND ns.userid=:userid" , nativeQuery = true)
	List<NimaiSubscriptionDetails> postPaidPlanFindByUserid(@Param("userid") String userid);

	List<NimaiSubscriptionDetails> findByUseridAndCountryNameIn(NimaiMCustomer userid, List<String> countryNames);
	
	//List<NimaiSubscriptionDetails> findByUseridSDetails(NimaiMCustomer userid, java.util.Date fromDate,java.util.Date toDate);
	
	

	@Query(value = "select m.userid,m.subscriber_type,m.company_name,s.subscription_name,s.is_vas_applied,s.subscription_amount,m.currency_code,\r\n"
			+ "s.splan_start_date,s.splan_end_date,(sp.lc_count-s.lc_utilized_count) as credits_available,s.subsidiaries from \r\n"
			+ "nimai_subscription_details s inner join nimai_m_customer m on s.userid=m.USERID inner join nimai_m_subscription sp on\r\n"
			+ "sp.SUBSCRIPTION_ID=s.SUBSCRIPTION_ID where s.SPLAN_START_DATE between :startDate and :endDate", nativeQuery = true)
	List<Tuple> getUserSubsRenewal(@Param("startDate") String startDate, @Param("endDate") Date endDate);

	@Query(value = "select m.userid,m.subscriber_type,m.company_name,s.subscription_name,s.is_vas_applied,s.subscription_amount,m.currency_code,\r\n"
			+ "s.splan_start_date,s.splan_end_date,(sp.lc_count-s.lc_utilized_count) as credits_available,s.subsidiaries from \r\n"
			+ "nimai_subscription_details s inner join nimai_m_customer m on s.userid=m.USERID inner join nimai_m_subscription sp on\r\n"
			+ "sp.SUBSCRIPTION_ID=s.SUBSCRIPTION_ID where s.SPLAN_START_DATE between :startDate and :endDate and m.userid= :userid", nativeQuery = true)
	List<Tuple> getUserSubsRenewalUserId(@Param("startDate") String startDate, @Param("endDate") Date endDate,
			@Param("userid") String userid);

	// --->>>>>>>>>>>>>>>>>>>>>>>>>>Dashboard-------------
	@Transactional
	@Procedure(name = "dashboardRevenue")
	public Map<String, Object> getRevenues(@Param("query_no") int queryNo, @Param("dateFrom") Date dateFrom,
			@Param("dateTo") Date dateTo, @Param("countryNames") String countryNames);

	@Query(value = "select monthname(s.splan_start_date) as month,count(s.userid)  as customers \r\n"
			+ "from nimai_subscription_details s inner join nimai_m_customer m on s.userid=m.USERID \r\n"
			+ "where m.SUBSCRIBER_TYPE='Customer' and year(s.SPLAN_START_DATE)= :year and s.`STATUS`='Active'\r\n"
			+ "group by month(s.splan_start_date) order by month(s.splan_start_date);\r\n" + "", nativeQuery = true)
	List<Tuple> getDashboardActiveCustStat(@Param("year") String year);

	@Query(value = "select monthname(s.splan_start_date) as month,count(s.userid)  as customers \r\n"
			+ "	from nimai_subscription_details s inner join nimai_m_customer m on s.userid=m.USERID \r\n"
			+ "	where m.SUBSCRIBER_TYPE='Customer' and FIND_IN_SET(m.COUNTRY_NAME, :userCountry) and year(s.SPLAN_START_DATE)= :year and s.`STATUS`='Active'\r\n"
			+ "	group by month(s.splan_start_date) order by month(s.splan_start_date);", nativeQuery = true)
	List<Tuple> getDashboardActiveCustCountryStat(@Param("year") String dateFrom,
			@Param("userCountry") String userCountry);

	@Query(value = "select monthname(s.splan_start_date) as month,count(s.userid)  as customers \r\n"
			+ "from nimai_subscription_details s inner join nimai_m_customer m on s.userid=m.USERID \r\n"
			+ "where m.SUBSCRIBER_TYPE='Bank' and m.bank_type= :bankType and year(s.SPLAN_START_DATE)= :year and s.`STATUS`='Active'\r\n"
			+ "group by month(s.splan_start_date) order by month(s.splan_start_date);\r\n" + "", nativeQuery = true)
	List<Tuple> getDashboardActiveBankStat(@Param("bankType") String bankType, @Param("year") String year);

	@Query(value = "select monthname(s.splan_start_date) as month,count(s.userid)  as customers \r\n"
			+ "from nimai_subscription_details s inner join nimai_m_customer m on s.userid=m.USERID \r\n"
			+ "where m.SUBSCRIBER_TYPE='Customer' and m.bank_type= :bankType and FIND_IN_SET(m.COUNTRY_NAME, :userCountry) and year(s.SPLAN_START_DATE)= :year and s.`STATUS`='Active'\r\n"
			+ "group by month(s.splan_start_date) order by month(s.splan_start_date);", nativeQuery = true)
	List<Tuple> getDashboardActiveBankCountryStat(@Param("bankType") String bankType, @Param("year") String year,@Param("userCountry")String userCountry);

	NimaiSubscriptionDetails findBySubscriptionId(String subscriptionId);
	
@Query(value="SELECT * FROM nimai_subscription_details ns \n" + 
		"WHERE ns.userid=:userid AND ns.`STATUS`=:planStatus",nativeQuery = true)
	NimaiSubscriptionDetails getplanByUserID(@Param("userid") String userid, @Param("planStatus") String planStatus);




@Query(value="from NimaiSubscriptionDetails nm where \n" + 
		"            nm.insertedDate >= (:fromDate) AND\n" + 
		"        nm.insertedDate   <= (:toDate)")
public List<NimaiSubscriptionDetails> getCustomerDetail(@Param("fromDate") java.util.Date fromDate,@Param("toDate") java.util.Date toDate);

@Query(value="select * from nimai_subscription_details nm where \n" + 
		"            nm.INSERTED_DATE >= (:fromDate) AND\n" + 
		"        nm.INSERTED_DATE   <= (:toDate) and nm.userid.USERID=(:userId)",nativeQuery = true)
List<Tuple> getCustomerDetailByUserID(@Param("fromDate")java.util.Date fromDate,@Param("toDate") java.util.Date toDate,@Param("userId") String userId);

@Query(value="SELECT * FROM nimai_subscription_details ns \n" + 
		"WHERE ns.userid=:userid AND ns.`STATUS`=:planStatus and ns.SUBSCRIPTION_ID=:scubscriptionId",nativeQuery = true)
	NimaiSubscriptionDetails getplanByUserIDAndSID(@Param("userid") String userid, @Param("planStatus") String planStatus,@Param("scubscriptionId") String scubscriptionId);




//
//@Query(value = "SELECT  sum(nq.total_quote_value/(nm.lc_value/nm.usd_currency_value )) as amount"
//		+ "  FROM  nimai_m_customer nc INNER JOIN nimai_mm_transaction nm ON "
//		+ "nm.user_id=nc.USERID INNER JOIN nimai_m_quotation nq ON nm.transaction_id=nq.transaction_id"
//		+ " WHERE  FIND_IN_SET(nc.COUNTRY_NAME, :countryNames) and  "
//		+ "nm.lc_issuing_date BETWEEN :dateFrom AND :dateTo", nativeQuery = true)
//Double gettotalQuoteReceivedCountryNames(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo, @Param("countryNames") String countryNames);


@Query(value = "SELECT SUM(nmt.usd_currency_value) FROM nimai_m_customer nc INNER JOIN "
		+ "nimai_mm_transaction nmt on nmt.user_id=nc.USERID " + 
		"INNER JOIN nimai_m_quotation nmq ON nmt.transaction_id=nmq.transaction_id "
		+ "WHERE  FIND_IN_SET(nc.COUNTRY_NAME, :countryNames) and " + 
		"nmt.inserted_date BETWEEN :dateFrom AND :dateTo", nativeQuery = true)
Double gettotalQuoteReceivedCountryNames(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo, @Param("countryNames") String countryNames);



//@Query(value = "SELECT  sum(nq.total_quote_value/(nm.lc_value/nm.usd_currency_value )) "
//		+ "as amount  FROM  nimai_m_customer nc INNER JOIN nimai_mm_transaction nm ON "
//		+ "nm.user_id=nc.USERID INNER JOIN nimai_m_quotation nq ON nm.transaction_id=nq.transaction_id"
//		+ "  WHERE   nm.lc_issuing_date BETWEEN :dateFrom AND :dateTo ", nativeQuery = true)
//Double gettotalQuoteReceived(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo);



@Query(value = "SELECT SUM(nmt.usd_currency_value) FROM nimai_mm_transaction nmt  " +
		"  INNER JOIN nimai_m_quotation nmq ON nmt.transaction_id=nmq.transaction_id "
		+ "WHERE  nmt.inserted_date BETWEEN :dateFrom AND :dateTo", nativeQuery = true)
Double gettotalQuoteReceived(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo);

//@Query(value = "SELECT  sum(nq.total_quote_value/(nm.lc_value/nm.usd_currency_value )) as amount FROM  "
//		+ "nimai_m_customer nc INNER JOIN nimai_mm_transaction nm ON nm.user_id=nc.USERID INNER JOIN "
//		+ "nimai_m_quotation nq ON nm.transaction_id=nq.transaction_id WHERE  "
//		+ "FIND_IN_SET(nc.COUNTRY_NAME, :countryNames) and  nm.lc_issuing_date BETWEEN :dateFrom AND :dateTo AND   nq.quotation_status='Accepted'", nativeQuery = true)
//Double gettotalQuoteAcceptedCountryNames(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo, @Param("countryNames") String countryNames);


@Query(value = "SELECT SUM(nmt.usd_currency_value) FROM nimai_m_customer nc INNER JOIN nimai_mm_transaction nmt on nc.USERID=nmt.user_id " + 
		" INNER JOIN nimai_m_quotation nmq ON nmt.transaction_id=nmq.transaction_id " + 
		" WHERE nmt.transaction_status='Accepted' and FIND_IN_SET(nc.COUNTRY_NAME, :countryNames) " + 
		" and  nmt.inserted_date BETWEEN :dateFrom AND :dateTo", nativeQuery = true)
Double gettotalQuoteAcceptedCountryNames(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo, @Param("countryNames") String countryNames);


//@Query(value = "SELECT  sum(nq.total_quote_value/(nm.lc_value/nm.usd_currency_value )) as amount  "
//		+ "FROM  nimai_m_customer nc INNER JOIN nimai_mm_transaction nm ON nm.user_id=nc.USERID"
//		+ " INNER JOIN nimai_m_quotation nq ON nm.transaction_id=nq.transaction_id WHERE   "
//		+ "nm.lc_issuing_date BETWEEN :dateFrom AND :dateTo AND  nq.quotation_status='Accepted'", nativeQuery = true)
//Double gettotalQuoteAccepted(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo);


@Query(value = "SELECT SUM(nmt.usd_currency_value) FROM nimai_mm_transaction nmt " + 
		" INNER JOIN nimai_m_quotation nmq ON nmt.transaction_id=nmq.transaction_id " + 
		" WHERE nmt.inserted_date BETWEEN :dateFrom AND :dateTo AND nmt.transaction_status='Accepted'", nativeQuery = true)
Double gettotalQuoteAccepted(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo);



//@Query(value = "SELECT  sum(nq.total_quote_value/(nm.lc_value/nm.usd_currency_value )) as "
//		+ "amount  FROM  nimai_m_customer nc INNER JOIN nimai_mm_transaction nm ON "
//		+ "nm.user_id=nc.USERID INNER JOIN nimai_m_quotation nq ON nm.transaction_id=nq.transaction_id"
//		+ " WHERE  nm.lc_issuing_date BETWEEN :dateFrom AND :dateTo AND  nm.transaction_status='Closed'", nativeQuery = true)
//Double gettotalQuoteClosed(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo);
//

@Query(value = "SELECT SUM(nmt.usd_currency_value) FROM nimai_mm_transaction nmt " + 
		" WHERE nmt.transaction_status!='Cancelled' " + 
		" and nmt.inserted_date BETWEEN :dateFrom AND :dateTo", nativeQuery = true)
Double gettotalQuoteClosed(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo);





//@Query(value = "SELECT  sum(nq.total_quote_value/(nm.lc_value/nm.usd_currency_value )) as amount  FROM  "
//		+ "nimai_m_customer nc INNER JOIN nimai_mm_transaction nm  "
//		+ " INNER JOIN nimai_m_quotation nq ON nm.transaction_id=nq.transaction_id"
//		+ " WHERE  FIND_IN_SET(nc.COUNTRY_NAME, :countryNames) and  nm.lc_issuing_date "
//		+ "BETWEEN :dateFrom AND :dateTo AND   nm.transaction_status='Closed'", nativeQuery = true)
//Double gettotalQuoteClosedCountryNames(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo, @Param("countryNames") String countryNames);



@Query(value = "SELECT SUM(nmt.usd_currency_value) FROM nimai_m_customer nc "
		+ " INNER JOIN nimai_mm_transaction nmt ON " + 
		" nmt.user_id=nc.USERID " + 
		" WHERE nmt.transaction_status!='Cancelled' " + 
		" and FIND_IN_SET(nc.COUNTRY_NAME, :countryNames)" + 
		" and nmt.inserted_date BETWEEN :dateFrom AND :dateTo " + 
		"", nativeQuery = true)
Double gettotalQuoteClosedCountryNames(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo, @Param("countryNames") String countryNames);

@Query("from NimaiSubscriptionDetails re where re.userid.userid= (:userId)")
List<NimaiSubscriptionDetails> finSplanByReferId(@Param("userId") String paramString);



}
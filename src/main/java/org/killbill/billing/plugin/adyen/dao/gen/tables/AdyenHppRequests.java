/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.adyen.dao.gen.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdyenHppRequests extends org.jooq.impl.TableImpl<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord> {

	private static final long serialVersionUID = -2014591445;

	/**
	 * The reference instance of <code>killbill.adyen_hpp_requests</code>
	 */
	public static final org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenHppRequests ADYEN_HPP_REQUESTS = new org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenHppRequests();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord> getRecordType() {
		return org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord.class;
	}

	/**
	 * The column <code>killbill.adyen_hpp_requests.record_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord, org.jooq.types.UInteger> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>killbill.adyen_hpp_requests.kb_account_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord, java.lang.String> KB_ACCOUNT_ID = createField("kb_account_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.adyen_hpp_requests.transaction_external_key</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord, java.lang.String> TRANSACTION_EXTERNAL_KEY = createField("transaction_external_key", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>killbill.adyen_hpp_requests.additional_data</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord, java.lang.String> ADDITIONAL_DATA = createField("additional_data", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>killbill.adyen_hpp_requests.created_date</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord, java.sql.Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>killbill.adyen_hpp_requests.kb_tenant_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord, java.lang.String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * Create a <code>killbill.adyen_hpp_requests</code> table reference
	 */
	public AdyenHppRequests() {
		this("adyen_hpp_requests", null);
	}

	/**
	 * Create an aliased <code>killbill.adyen_hpp_requests</code> table reference
	 */
	public AdyenHppRequests(java.lang.String alias) {
		this(alias, org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenHppRequests.ADYEN_HPP_REQUESTS);
	}

	private AdyenHppRequests(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord> aliased) {
		this(alias, aliased, null);
	}

	private AdyenHppRequests(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.killbill.billing.plugin.adyen.dao.gen.Killbill.KILLBILL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord, org.jooq.types.UInteger> getIdentity() {
		return org.killbill.billing.plugin.adyen.dao.gen.Keys.IDENTITY_ADYEN_HPP_REQUESTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord> getPrimaryKey() {
		return org.killbill.billing.plugin.adyen.dao.gen.Keys.KEY_ADYEN_HPP_REQUESTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenHppRequestsRecord>>asList(org.killbill.billing.plugin.adyen.dao.gen.Keys.KEY_ADYEN_HPP_REQUESTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenHppRequests as(java.lang.String alias) {
		return new org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenHppRequests(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenHppRequests rename(java.lang.String name) {
		return new org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenHppRequests(name, null);
	}
}

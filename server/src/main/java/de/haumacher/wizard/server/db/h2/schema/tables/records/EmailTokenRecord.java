/*
 * This file is generated by jOOQ.
 */
package de.haumacher.wizard.server.db.h2.schema.tables.records;


import de.haumacher.wizard.server.db.h2.schema.tables.EmailToken;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmailTokenRecord extends UpdatableRecordImpl<EmailTokenRecord> implements Record4<String, byte[], byte[], Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.EMAIL_TOKEN.UID</code>.
     */
    public void setUid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.EMAIL_TOKEN.UID</code>.
     */
    public String getUid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.EMAIL_TOKEN.EMAIL</code>.
     */
    public void setEmail(byte[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.EMAIL_TOKEN.EMAIL</code>.
     */
    public byte[] getEmail() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>PUBLIC.EMAIL_TOKEN.HASH</code>.
     */
    public void setHash(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.EMAIL_TOKEN.HASH</code>.
     */
    public byte[] getHash() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>PUBLIC.EMAIL_TOKEN.NOT_AFTER</code>.
     */
    public void setNotAfter(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.EMAIL_TOKEN.NOT_AFTER</code>.
     */
    public Long getNotAfter() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, byte[], byte[], Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, byte[], byte[], Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EmailToken.EMAIL_TOKEN.UID;
    }

    @Override
    public Field<byte[]> field2() {
        return EmailToken.EMAIL_TOKEN.EMAIL;
    }

    @Override
    public Field<byte[]> field3() {
        return EmailToken.EMAIL_TOKEN.HASH;
    }

    @Override
    public Field<Long> field4() {
        return EmailToken.EMAIL_TOKEN.NOT_AFTER;
    }

    @Override
    public String component1() {
        return getUid();
    }

    @Override
    public byte[] component2() {
        return getEmail();
    }

    @Override
    public byte[] component3() {
        return getHash();
    }

    @Override
    public Long component4() {
        return getNotAfter();
    }

    @Override
    public String value1() {
        return getUid();
    }

    @Override
    public byte[] value2() {
        return getEmail();
    }

    @Override
    public byte[] value3() {
        return getHash();
    }

    @Override
    public Long value4() {
        return getNotAfter();
    }

    @Override
    public EmailTokenRecord value1(String value) {
        setUid(value);
        return this;
    }

    @Override
    public EmailTokenRecord value2(byte[] value) {
        setEmail(value);
        return this;
    }

    @Override
    public EmailTokenRecord value3(byte[] value) {
        setHash(value);
        return this;
    }

    @Override
    public EmailTokenRecord value4(Long value) {
        setNotAfter(value);
        return this;
    }

    @Override
    public EmailTokenRecord values(String value1, byte[] value2, byte[] value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailTokenRecord
     */
    public EmailTokenRecord() {
        super(EmailToken.EMAIL_TOKEN);
    }

    /**
     * Create a detached, initialised EmailTokenRecord
     */
    public EmailTokenRecord(String uid, byte[] email, byte[] hash, Long notAfter) {
        super(EmailToken.EMAIL_TOKEN);

        setUid(uid);
        setEmail(email);
        setHash(hash);
        setNotAfter(notAfter);
    }
}

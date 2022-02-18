/*
 * This file is generated by jOOQ.
 */
package de.haumacher.wizard.server.db.h2.schema.tables.records;


import de.haumacher.wizard.server.db.h2.schema.tables.Users;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record7<String, String, byte[], String, Long, Boolean, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.USERS.UID</code>.
     */
    public void setUid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.USERS.UID</code>.
     */
    public String getUid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.USERS.NICKNAME</code>.
     */
    public void setNickname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.USERS.NICKNAME</code>.
     */
    public String getNickname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.USERS.EMAIL</code>.
     */
    public void setEmail(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.USERS.EMAIL</code>.
     */
    public byte[] getEmail() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>PUBLIC.USERS.LANGUAGE</code>.
     */
    public void setLanguage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.USERS.LANGUAGE</code>.
     */
    public String getLanguage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.USERS.CREATED</code>.
     */
    public void setCreated(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.USERS.CREATED</code>.
     */
    public Long getCreated() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>PUBLIC.USERS.VERIFIED</code>.
     */
    public void setVerified(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.USERS.VERIFIED</code>.
     */
    public Boolean getVerified() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>PUBLIC.USERS.LAST_LOGIN</code>.
     */
    public void setLastLogin(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.USERS.LAST_LOGIN</code>.
     */
    public Long getLastLogin() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, byte[], String, Long, Boolean, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, byte[], String, Long, Boolean, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Users.USERS.UID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.NICKNAME;
    }

    @Override
    public Field<byte[]> field3() {
        return Users.USERS.EMAIL;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.LANGUAGE;
    }

    @Override
    public Field<Long> field5() {
        return Users.USERS.CREATED;
    }

    @Override
    public Field<Boolean> field6() {
        return Users.USERS.VERIFIED;
    }

    @Override
    public Field<Long> field7() {
        return Users.USERS.LAST_LOGIN;
    }

    @Override
    public String component1() {
        return getUid();
    }

    @Override
    public String component2() {
        return getNickname();
    }

    @Override
    public byte[] component3() {
        return getEmail();
    }

    @Override
    public String component4() {
        return getLanguage();
    }

    @Override
    public Long component5() {
        return getCreated();
    }

    @Override
    public Boolean component6() {
        return getVerified();
    }

    @Override
    public Long component7() {
        return getLastLogin();
    }

    @Override
    public String value1() {
        return getUid();
    }

    @Override
    public String value2() {
        return getNickname();
    }

    @Override
    public byte[] value3() {
        return getEmail();
    }

    @Override
    public String value4() {
        return getLanguage();
    }

    @Override
    public Long value5() {
        return getCreated();
    }

    @Override
    public Boolean value6() {
        return getVerified();
    }

    @Override
    public Long value7() {
        return getLastLogin();
    }

    @Override
    public UsersRecord value1(String value) {
        setUid(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setNickname(value);
        return this;
    }

    @Override
    public UsersRecord value3(byte[] value) {
        setEmail(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public UsersRecord value5(Long value) {
        setCreated(value);
        return this;
    }

    @Override
    public UsersRecord value6(Boolean value) {
        setVerified(value);
        return this;
    }

    @Override
    public UsersRecord value7(Long value) {
        setLastLogin(value);
        return this;
    }

    @Override
    public UsersRecord values(String value1, String value2, byte[] value3, String value4, Long value5, Boolean value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(String uid, String nickname, byte[] email, String language, Long created, Boolean verified, Long lastLogin) {
        super(Users.USERS);

        setUid(uid);
        setNickname(nickname);
        setEmail(email);
        setLanguage(language);
        setCreated(created);
        setVerified(verified);
        setLastLogin(lastLogin);
    }
}

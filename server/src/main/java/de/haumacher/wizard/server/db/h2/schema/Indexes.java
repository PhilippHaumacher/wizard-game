/*
 * This file is generated by jOOQ.
 */
package de.haumacher.wizard.server.db.h2.schema;


import de.haumacher.wizard.server.db.h2.schema.tables.Users;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in PUBLIC.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index USERS_EMAIL_INDEX = Internal.createIndex(DSL.name("USERS_EMAIL_INDEX"), Users.USERS, new OrderField[] { Users.USERS.EMAIL }, true);
    public static final Index USERS_NICKNAME_INDEX = Internal.createIndex(DSL.name("USERS_NICKNAME_INDEX"), Users.USERS, new OrderField[] { Users.USERS.NICKNAME }, true);
}

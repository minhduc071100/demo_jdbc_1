/*
 * This file is generated by jOOQ.
 */
package com.mh.tables;


import com.mh.Indexes;
import com.mh.Keys;
import com.mh.Website1;
import com.mh.tables.records.CommentRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Comment extends TableImpl<CommentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>website1.comment</code>
     */
    public static final Comment COMMENT = new Comment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentRecord> getRecordType() {
        return CommentRecord.class;
    }

    /**
     * The column <code>website1.comment.id</code>.
     */
    public final TableField<CommentRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>website1.comment.post_id</code>.
     */
    public final TableField<CommentRecord, Integer> POST_ID = createField(DSL.name("post_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>website1.comment.user_id</code>.
     */
    public final TableField<CommentRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>website1.comment.content</code>.
     */
    public final TableField<CommentRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>website1.comment.created_at</code>.
     */
    public final TableField<CommentRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>website1.comment.updated_at</code>.
     */
    public final TableField<CommentRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>website1.comment.deleted_at</code>.
     */
    public final TableField<CommentRecord, LocalDateTime> DELETED_AT = createField(DSL.name("deleted_at"), SQLDataType.LOCALDATETIME(0), this, "");

    private Comment(Name alias, Table<CommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comment(Name alias, Table<CommentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>website1.comment</code> table reference
     */
    public Comment(String alias) {
        this(DSL.name(alias), COMMENT);
    }

    /**
     * Create an aliased <code>website1.comment</code> table reference
     */
    public Comment(Name alias) {
        this(alias, COMMENT);
    }

    /**
     * Create a <code>website1.comment</code> table reference
     */
    public Comment() {
        this(DSL.name("comment"), null);
    }

    public <O extends Record> Comment(Table<O> child, ForeignKey<O, CommentRecord> key) {
        super(child, key, COMMENT);
    }

    @Override
    public Schema getSchema() {
        return Website1.WEBSITE1;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMMENT_POSTID, Indexes.COMMENT_USERID);
    }

    @Override
    public UniqueKey<CommentRecord> getPrimaryKey() {
        return Keys.KEY_COMMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<CommentRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentRecord>>asList(Keys.KEY_COMMENT_PRIMARY, Keys.KEY_COMMENT_COMMENTID);
    }

    @Override
    public List<ForeignKey<CommentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CommentRecord, ?>>asList(Keys.COMMENT_IBFK_1, Keys.COMMENT_IBFK_2);
    }

    private transient Post _post;
    private transient User _user;

    public Post post() {
        if (_post == null)
            _post = new Post(this, Keys.COMMENT_IBFK_1);

        return _post;
    }

    public User user() {
        if (_user == null)
            _user = new User(this, Keys.COMMENT_IBFK_2);

        return _user;
    }

    @Override
    public Comment as(String alias) {
        return new Comment(DSL.name(alias), this);
    }

    @Override
    public Comment as(Name alias) {
        return new Comment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Comment rename(String name) {
        return new Comment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Comment rename(Name name) {
        return new Comment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, String, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}

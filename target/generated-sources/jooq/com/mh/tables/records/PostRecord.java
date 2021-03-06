/*
 * This file is generated by jOOQ.
 */
package com.mh.tables.records;


import com.mh.tables.Post;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PostRecord extends UpdatableRecordImpl<PostRecord> implements Record8<Integer, Integer, String, String, LocalDateTime, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>website1.post.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>website1.post.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>website1.post.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>website1.post.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>website1.post.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>website1.post.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>website1.post.content</code>.
     */
    public void setContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>website1.post.content</code>.
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>website1.post.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>website1.post.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>website1.post.likes</code>.
     */
    public void setLikes(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>website1.post.likes</code>.
     */
    public Integer getLikes() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>website1.post.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>website1.post.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>website1.post.deleted_at</code>.
     */
    public void setDeletedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>website1.post.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, String, String, LocalDateTime, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, String, String, LocalDateTime, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Post.POST.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Post.POST.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return Post.POST.TITLE;
    }

    @Override
    public Field<String> field4() {
        return Post.POST.CONTENT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Post.POST.CREATED_AT;
    }

    @Override
    public Field<Integer> field6() {
        return Post.POST.LIKES;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Post.POST.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Post.POST.DELETED_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public String component4() {
        return getContent();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public Integer component6() {
        return getLikes();
    }

    @Override
    public LocalDateTime component7() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime component8() {
        return getDeletedAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public String value4() {
        return getContent();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public Integer value6() {
        return getLikes();
    }

    @Override
    public LocalDateTime value7() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime value8() {
        return getDeletedAt();
    }

    @Override
    public PostRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PostRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public PostRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public PostRecord value4(String value) {
        setContent(value);
        return this;
    }

    @Override
    public PostRecord value5(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public PostRecord value6(Integer value) {
        setLikes(value);
        return this;
    }

    @Override
    public PostRecord value7(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public PostRecord value8(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public PostRecord values(Integer value1, Integer value2, String value3, String value4, LocalDateTime value5, Integer value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PostRecord
     */
    public PostRecord() {
        super(Post.POST);
    }

    /**
     * Create a detached, initialised PostRecord
     */
    public PostRecord(Integer id, Integer userId, String title, String content, LocalDateTime createdAt, Integer likes, LocalDateTime updatedAt, LocalDateTime deletedAt) {
        super(Post.POST);

        setId(id);
        setUserId(userId);
        setTitle(title);
        setContent(content);
        setCreatedAt(createdAt);
        setLikes(likes);
        setUpdatedAt(updatedAt);
        setDeletedAt(deletedAt);
    }
}

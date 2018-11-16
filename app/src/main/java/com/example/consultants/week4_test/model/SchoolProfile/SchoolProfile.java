
package com.example.consultants.week4_test.model.SchoolProfile;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SchoolProfile implements Serializable
{

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dataTypeName")
    @Expose
    private String dataTypeName;
    @SerializedName("fieldName")
    @Expose
    private String fieldName;
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("renderTypeName")
    @Expose
    private String renderTypeName;
    @SerializedName("tableColumnId")
    @Expose
    private int tableColumnId;
    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("cachedContents")
    @Expose
    private CachedContents cachedContents;
    @SerializedName("format")
    @Expose
    private Format format;
    private final static long serialVersionUID = -7631219881952537875L;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getRenderTypeName() {
        return renderTypeName;
    }

    public void setRenderTypeName(String renderTypeName) {
        this.renderTypeName = renderTypeName;
    }

    public int getTableColumnId() {
        return tableColumnId;
    }

    public void setTableColumnId(int tableColumnId) {
        this.tableColumnId = tableColumnId;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public CachedContents getCachedContents() {
        return cachedContents;
    }

    public void setCachedContents(CachedContents cachedContents) {
        this.cachedContents = cachedContents;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

}

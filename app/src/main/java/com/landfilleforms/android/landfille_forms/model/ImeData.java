package com.landfilleforms.android.landfille_forms.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Work on 2/16/2017.
 */

public class ImeData {
    private UUID mId;
    private String mImeNumber;
    private String mLocation;
    private String mGridId;
    private Date mDate;
    private String mDescription;
    private String mInspectorFullName;
    private String mInspectorUserName;
    private double mMethaneReading;

    public ImeData() {
        this(UUID.randomUUID());
    }

    public ImeData(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getImeNumber() {
        return mImeNumber;
    }

    public void setImeNumber(String imeNumber) {
        mImeNumber = imeNumber;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getGridId() {
        return mGridId;
    }

    public void setGridId(String gridId) {
        mGridId = gridId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getInspectorFullName() {
        return mInspectorFullName;
    }

    public void setInspectorFullName(String inspectorFullName) {
        mInspectorFullName = inspectorFullName;
    }

    public String getInspectorUserName() {
        return mInspectorUserName;
    }

    public void setInspectorUserName(String inspectorUserName) {
        mInspectorUserName = inspectorUserName;
    }

    public double getMethaneReading() {
        return mMethaneReading;
    }

    public void setMethaneReading(double methaneReading) {
        mMethaneReading = methaneReading;
    }
}

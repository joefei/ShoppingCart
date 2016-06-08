package com.zerovoid.common.view.grouplist;

/**
 * Created by wanghaiming on 2016/6/3.
 */
public final class ChildData<CHILD>{
    private CHILD mChild;
    private GroupData<?,CHILD> mGroupData;
    private boolean mIsSelected;
    private boolean mIsEditing;
    private boolean mIsEditingSelected;

    public GroupData<?, CHILD> getGroupData() {
        return mGroupData;
    }

    public void setGroupData(GroupData<?, CHILD> groupData) {
        mGroupData = groupData;
    }

    public ChildData(CHILD child){
        mChild = child;
    }
    public CHILD getChild() {
        return mChild;
    }

    public void setChild(CHILD child) {
        mChild = child;
    }

    public boolean isEditingSelected() {
        return mIsEditingSelected;
    }

    public void setEditingSelected(boolean editingSelected) {
        mIsEditingSelected = editingSelected;
    }

    public boolean isSelected() {
        return mIsSelected;
    }

    public void setSelected(boolean selected) {
        mIsSelected = selected;
    }

    public boolean isEditing() {
        return mIsEditing;
    }

    public void setEditing(boolean editing) {
        mIsEditing = editing;
        mIsEditingSelected = false;
    }
}

package com.lin.cardlib;

import com.lin.cardlib.utils.ReItemTouchHelper;

/**
 * Created by linchen on 2018/2/6.
 * mail: linchen@sogou-inc.com
 */

public class CardSetting {
    public static final int DEFAULT_SHOW_ITEM = 3;

    public static final float DEFAULT_SCALE = 0.1f;

    public static final int DEFAULT_TRANSLATE = 14;

    public static final float DEFAULT_ROTATE_DEGREE = 15f;
    public int DEFAULT_MARGIN_TOP = 15;
    public boolean isLoopCard = false;
    public int showCount = 3;
    public float cardScale = 0.1f;
    public int translateDistance = 14;
    public float cardRotateDegree = 15f;
    public int couldSwipeOutDirection = ReItemTouchHelper.LEFT | ReItemTouchHelper.RIGHT |
            ReItemTouchHelper.UP | ReItemTouchHelper.DOWN;

    public int stackDirection;
    public int swipeThreshold;
    private OnSwipeCardListener mListener;


    public int getDefaultMarginTop() {
        return DEFAULT_MARGIN_TOP;
    }


    public void setDefaultMarginTop(int defaultMarginTop) {
        DEFAULT_MARGIN_TOP = defaultMarginTop;
    }


    public void setShowCount(int showCount) {
        this.showCount = showCount;
    }


    public int getShowCount() {
        return showCount;
    }


    public void setCardScale(float cardScale) {
        this.cardScale = cardScale;
    }


    public void setTranslateDistance(int translateDistance) {
        this.translateDistance = translateDistance;
    }


    public void setCardRotateDegree(float cardRotateDegree) {
        this.cardRotateDegree = cardRotateDegree;
    }


    public void setCouldSwipeOutDirection(int couldSwipeOutDirection) {
        this.couldSwipeOutDirection = couldSwipeOutDirection;
    }


    public void setStackDirection(int stackDirection) {
        this.stackDirection = stackDirection;
    }


    public void setSwipeThreshold(int swipeThreshold) {
        this.swipeThreshold = swipeThreshold;
    }


    public float getCardScale() {
        return DEFAULT_SCALE;
    }


    public int getCardTranslateDistance() {
        return DEFAULT_TRANSLATE;
    }


    public float getCardRotateDegree() {
        return DEFAULT_ROTATE_DEGREE;
    }


    public int getSwipeDirection() {
        return ReItemTouchHelper.LEFT | ReItemTouchHelper.RIGHT | ReItemTouchHelper.UP |
                ReItemTouchHelper.DOWN;
    }


    public int couldSwipeOutDirection() {
        return couldSwipeOutDirection;
    }


    public float getSwipeThreshold() {
        return 0.3f;
    }


    public boolean enableHardWare() {
        return true;
    }


    public void setLoopCard(boolean loopCard) {
        isLoopCard = loopCard;
    }


    public boolean isLoopCard() {
        return isLoopCard;
    }


    public int getSwipeOutAnimDuration() {
        return 400;
    }


    public int getStackDirection() {
        return ReItemTouchHelper.DOWN;
    }


    public void setSwipeListener(OnSwipeCardListener listener) {
        mListener = listener;
    }


    public OnSwipeCardListener getListener() {
        return mListener;
    }
}

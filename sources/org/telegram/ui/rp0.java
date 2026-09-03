package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.Components.pv0 {
    public int t0;
    public boolean u0;
    public final /* synthetic */ wp0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(wp0 wp0Var, Context context) {
        super(context, null);
        this.v0 = wp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.Components.fu fuVar;
        int measuredHeight;
        int measuredHeight2;
        int i20 = this.t0;
        int i21 = i12 - i10;
        wp0 wp0Var = this.v0;
        if (i20 != i21) {
            this.t0 = i21;
            org.telegram.ui.ActionBar.p1 p1Var = wp0Var.F;
            if (p1Var != null && p1Var.isShowing()) {
                wp0Var.F.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : wp0Var.J.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & 112;
                int i25 = i23 & 7;
                if (i25 == 1) {
                    i14 = ((i21 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i25 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i24 == 16) {
                        if (i24 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                        } else if (i24 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        fuVar = wp0Var.J;
                        if (fuVar != null && fuVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    fuVar = wp0Var.J;
                    if (fuVar != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (i21 - measuredWidth) - layoutParams.rightMargin;
                    i15 = getPaddingRight();
                }
                i16 = i14 - i15;
                if (i24 == 16) {
                }
                i19 = i17 - i18;
                fuVar = wp0Var.J;
                if (fuVar != null) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int dp = AndroidUtilities.dp(20.0f);
        int i13 = 0;
        wp0 wp0Var = this.v0;
        if (dp < 0) {
            this.u0 = true;
            wp0Var.J.j();
            this.u0 = false;
        } else if (!AndroidUtilities.isInMultiwindow) {
            size2 -= wp0Var.J.getEmojiPadding();
            i11 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.fu fuVar = wp0Var.J;
                if (fuVar == null || !fuVar.l(childAt)) {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                    i13++;
                    i10 = i12;
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
            i12 = i10;
            i13++;
            i10 = i12;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.u0) {
            return;
        }
        super.requestLayout();
    }
}

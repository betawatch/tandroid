package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wn0 extends org.telegram.ui.Components.uu0 {
    public int f0;
    public boolean g0;
    public final /* synthetic */ yn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(yn0 yn0Var, Context context) {
        super(context, null);
        this.h0 = yn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.Components.wt wtVar;
        int measuredHeight;
        int measuredHeight2;
        int i20 = this.f0;
        int i21 = i12 - i10;
        yn0 yn0Var = this.h0;
        if (i20 != i21) {
            this.f0 = i21;
            org.telegram.ui.ActionBar.k1 k1Var = yn0Var.I;
            if (k1Var != null && k1Var.isShowing()) {
                yn0Var.I.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (org.telegram.messenger.i0.L(20.0f) < 0 || org.telegram.messenger.i0.E || org.telegram.messenger.i0.Q1()) ? 0 : yn0Var.M.getEmojiPadding();
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
                int i24 = i23 & org.telegram.messenger.zs.x1;
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
                        wtVar = yn0Var.M;
                        if (wtVar != null && wtVar.l(childAt)) {
                            if (org.telegram.messenger.i0.Q1()) {
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
                    wtVar = yn0Var.M;
                    if (wtVar != null) {
                        if (org.telegram.messenger.i0.Q1()) {
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
                wtVar = yn0Var.M;
                if (wtVar != null) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int L = org.telegram.messenger.i0.L(20.0f);
        int i13 = 0;
        yn0 yn0Var = this.h0;
        if (L < 0) {
            this.g0 = true;
            yn0Var.M.j();
            this.g0 = false;
        } else if (!org.telegram.messenger.i0.E) {
            size2 -= yn0Var.M.getEmojiPadding();
            i11 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.wt wtVar = yn0Var.M;
                if (wtVar == null || !wtVar.l(childAt)) {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                    i13++;
                    i10 = i12;
                } else if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size2 - org.telegram.messenger.i0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.i0.m), TLObject.FLAG_30));
                }
            }
            i12 = i10;
            i13++;
            i10 = i12;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}

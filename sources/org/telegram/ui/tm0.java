package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tm0 extends org.telegram.ui.Components.rt0 {
    public int f0;
    public boolean g0;
    public int h0;
    public final /* synthetic */ xm0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(xm0 xm0Var, Context context) {
        super(context, null);
        this.i0 = xm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.lt ltVar;
        int measuredHeight;
        int measuredHeight2;
        int i19 = this.f0;
        int i20 = i11 - i7;
        xm0 xm0Var = this.i0;
        if (i19 != i20) {
            this.f0 = i20;
            l4 l4Var = xm0Var.L;
            if (l4Var != null) {
                l4Var.f();
            }
            org.telegram.ui.ActionBar.g1 g1Var = xm0Var.m0;
            if (g1Var != null && g1Var.isShowing()) {
                xm0Var.m0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (xm0Var.d0 == null || xm0Var.Z.getParent() != this || org.telegram.messenger.g0.L(20.0f) < 0 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) ? 0 : xm0Var.d0.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.qs.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i13 = ((i20 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                        } else if (i23 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - emojiPadding) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        ltVar = xm0Var.d0;
                        if (ltVar != null && ltVar.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - emojiPadding) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    ltVar = xm0Var.d0;
                    if (ltVar != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (i20 - measuredWidth) - layoutParams.rightMargin;
                    i14 = getPaddingRight();
                }
                i15 = i13 - i14;
                if (i23 == 16) {
                }
                i18 = i16 - i17;
                ltVar = xm0Var.d0;
                if (ltVar != null) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.lt ltVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        xm0 xm0Var = this.i0;
        if (Q1) {
            xm0Var.g0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                xm0Var.g0 = 4;
            } else {
                xm0Var.g0 = 3;
            }
        }
        this.g0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / xm0Var.g0;
        xm0Var.R = L;
        if (this.h0 != L) {
            this.h0 = L;
            org.telegram.messenger.g0.h3(new ef0(this, 16));
        }
        if (xm0Var.Y) {
            xm0Var.M.y1(1);
        } else {
            xm0Var.M.y1(Math.max(1, ((xm0Var.g0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (xm0Var.R * xm0Var.g0)));
        }
        this.g0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && xm0Var.d0 != null && xm0Var.Z.getParent() == this) {
            size4 -= xm0Var.d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (ltVar = xm0Var.d0) != null) {
            this.g0 = true;
            ltVar.j();
            this.g0 = false;
        }
        org.telegram.ui.Components.lt ltVar2 = xm0Var.d0;
        if (ltVar2 != null && ltVar2.e) {
            xm0Var.fragmentView.setTranslationY(0.0f);
            xm0Var.K.setTranslationY(0.0f);
            xm0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.lt ltVar3 = xm0Var.d0;
                if (ltVar3 == null || !ltVar3.l(childAt)) {
                    measureChildWithMargins(childAt, i7, 0, i12, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (i11 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                }
            }
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

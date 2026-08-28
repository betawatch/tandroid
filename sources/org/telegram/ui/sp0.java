package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sp0 extends org.telegram.ui.Components.xu0 {
    public int s0;
    public boolean t0;
    public int u0;
    public final /* synthetic */ zp0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(zp0 zp0Var, Context context) {
        super(context, null);
        this.v0 = zp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.ut utVar;
        int measuredHeight;
        int measuredHeight2;
        int i19 = this.s0;
        int i20 = i11 - i9;
        zp0 zp0Var = this.v0;
        if (i19 != i20) {
            this.s0 = i20;
            xp0 xp0Var = zp0Var.H;
            if (xp0Var != null) {
                xp0Var.l();
            }
            org.telegram.ui.ActionBar.o1 o1Var = zp0Var.i0;
            if (o1Var != null && o1Var.isShowing()) {
                zp0Var.i0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (zp0Var.Z == null || zp0Var.V.getParent() != this || AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : zp0Var.Z.getEmojiPadding();
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
                int i23 = i22 & 112;
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
                        utVar = zp0Var.Z;
                        if (utVar != null && utVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
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
                    utVar = zp0Var.Z;
                    if (utVar != null) {
                        if (AndroidUtilities.isTablet()) {
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
                utVar = zp0Var.Z;
                if (utVar != null) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        S();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.Components.ut utVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i9);
        boolean isTablet = AndroidUtilities.isTablet();
        zp0 zp0Var = this.v0;
        if (isTablet) {
            zp0Var.c0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                zp0Var.c0 = 4;
            } else {
                zp0Var.c0 = 3;
            }
        }
        this.t0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / zp0Var.c0;
        zp0Var.N = dp;
        if (this.u0 != dp) {
            this.u0 = dp;
            AndroidUtilities.runOnUIThread(new zk0(this, 13));
        }
        if (zp0Var.U) {
            zp0Var.I.y1(1);
        } else {
            zp0Var.I.y1(Math.max(1, ((zp0Var.c0 - 1) * AndroidUtilities.dp(2.0f)) + (zp0Var.N * zp0Var.c0)));
        }
        this.t0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i9);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && zp0Var.Z != null && zp0Var.V.getParent() == this) {
            size4 -= zp0Var.Z.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (utVar = zp0Var.Z) != null) {
            this.t0 = true;
            utVar.j();
            this.t0 = false;
        }
        org.telegram.ui.Components.ut utVar2 = zp0Var.Z;
        if (utVar2 != null && utVar2.e) {
            zp0Var.fragmentView.setTranslationY(0.0f);
            zp0Var.G.setTranslationY(0.0f);
            zp0Var.J.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ut utVar3 = zp0Var.Z;
                if (utVar3 == null || !utVar3.l(childAt)) {
                    measureChildWithMargins(childAt, i9, 0, i12, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (i11 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t0) {
            return;
        }
        super.requestLayout();
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class yg1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public int d;
    public final /* synthetic */ zg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg1(zg1 zg1Var, Context context) {
        super(context);
        this.e = zg1Var;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        zg1 zg1Var = this.e;
        TextView textView = zg1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = zg1Var.c.getMeasuredHeight() + iArr[1];
        kVar = ((org.telegram.ui.ActionBar.m2) zg1Var).actionBar;
        boolean z10 = measuredHeight < kVar.getBottom();
        if (z10 != (zg1Var.c.getTag() == null)) {
            zg1Var.c.setTag(z10 ? null : 1);
            AnimatorSet animatorSet = zg1Var.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                zg1Var.K = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            zg1Var.K = animatorSet2;
            ci.r6 r6Var = zg1Var.y;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property, fArr);
            kVar2 = ((org.telegram.ui.ActionBar.m2) zg1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(kVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 1.0f : 0.0f));
            zg1Var.K.setDuration(150L);
            zg1Var.K.addListener(new xo0(this, 26));
            zg1Var.K.start();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (Build.VERSION.SDK_INT < 23) {
            int dp = AndroidUtilities.dp(120.0f) + rect.bottom;
            rect.bottom = dp;
            int i10 = this.d;
            if (i10 != 0) {
                rect.top -= i10;
                rect.bottom = dp - i10;
                this.d = 0;
            }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.widget.ScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.c = true;
        super.requestLayout();
    }

    @Override // android.widget.ScrollView
    public final void scrollToDescendant(View view) {
        Rect rect = this.b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            this.d = measuredHeight;
            computeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
        } else {
            this.d = 0;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

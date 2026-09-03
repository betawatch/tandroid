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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vg1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public int d;
    public final /* synthetic */ wg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg1(wg1 wg1Var, Context context) {
        super(context);
        this.e = wg1Var;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.c = false;
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        wg1 wg1Var = this.e;
        TextView textView = wg1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = wg1Var.c.getMeasuredHeight() + iArr[1];
        kVar = ((org.telegram.ui.ActionBar.p2) wg1Var).actionBar;
        boolean z4 = measuredHeight < kVar.getBottom();
        if (z4 != (wg1Var.c.getTag() == null)) {
            wg1Var.c.setTag(z4 ? null : 1);
            AnimatorSet animatorSet = wg1Var.H;
            if (animatorSet != null) {
                animatorSet.cancel();
                wg1Var.H = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            wg1Var.H = animatorSet2;
            eg.i0 i0Var = wg1Var.y;
            float[] fArr = {z4 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property, fArr);
            kVar2 = ((org.telegram.ui.ActionBar.p2) wg1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(kVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.k5, Float>) property, z4 ? 1.0f : 0.0f));
            wg1Var.H.setDuration(150L);
            wg1Var.H.addListener(new ss0(this, 24));
            wg1Var.H.start();
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
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
        return super.requestChildRectangleOnScreen(view, rect, z4);
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

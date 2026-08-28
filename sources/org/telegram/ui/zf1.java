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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zf1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public int d;
    public final /* synthetic */ ag1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1(ag1 ag1Var, Context context) {
        super(context);
        this.e = ag1Var;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.c = false;
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i9, i10, i11, i12);
        ag1 ag1Var = this.e;
        TextView textView = ag1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = ag1Var.c.getMeasuredHeight() + iArr[1];
        kVar = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
        boolean z10 = measuredHeight < kVar.getBottom();
        if (z10 != (ag1Var.c.getTag() == null)) {
            ag1Var.c.setTag(z10 ? null : 1);
            AnimatorSet animatorSet = ag1Var.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                ag1Var.G = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ag1Var.G = animatorSet2;
            kh.h6 h6Var = ag1Var.y;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) property, fArr);
            kVar2 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(kVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 1.0f : 0.0f));
            ag1Var.G.setDuration(150L);
            ag1Var.G.addListener(new te1(this, 1));
            ag1Var.G.start();
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
            int i9 = this.d;
            if (i9 != 0) {
                rect.top -= i9;
                rect.bottom = dp - i9;
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

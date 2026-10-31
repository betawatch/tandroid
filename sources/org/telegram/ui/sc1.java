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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sc1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final /* synthetic */ tc1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(tc1 tc1Var, Context context) {
        super(context);
        this.d = tc1Var;
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        tc1 tc1Var = this.d;
        TextView textView = tc1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = tc1Var.c.getMeasuredHeight() + iArr[1];
        lVar = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
        boolean z10 = measuredHeight < lVar.getBottom();
        if (z10 != (tc1Var.c.getTag() == null)) {
            tc1Var.c.setTag(z10 ? null : 1);
            AnimatorSet animatorSet = tc1Var.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                tc1Var.K = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            tc1Var.K = animatorSet2;
            kg.f0 f0Var = tc1Var.D;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property, fArr);
            lVar2 = ((org.telegram.ui.ActionBar.k2) tc1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(lVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.u5, Float>) property, z10 ? 1.0f : 0.0f));
            tc1Var.K.setDuration(150L);
            tc1Var.K.addListener(new ns0(this, 13));
            tc1Var.K.start();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
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
        rect.bottom = org.telegram.messenger.i0.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

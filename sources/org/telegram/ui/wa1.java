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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wa1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final /* synthetic */ xa1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(xa1 xa1Var, Context context) {
        super(context);
        this.d = xa1Var;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.c = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i7, i10, i11, i12);
        xa1 xa1Var = this.d;
        TextView textView = xa1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = xa1Var.c.getMeasuredHeight() + iArr[1];
        kVar = ((org.telegram.ui.ActionBar.e2) xa1Var).actionBar;
        boolean z10 = measuredHeight < kVar.getBottom();
        if (z10 != (xa1Var.c.getTag() == null)) {
            xa1Var.c.setTag(z10 ? null : 1);
            AnimatorSet animatorSet = xa1Var.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                xa1Var.L = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            xa1Var.L = animatorSet2;
            hi.n5 n5Var = xa1Var.E;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) property, fArr);
            kVar2 = ((org.telegram.ui.ActionBar.e2) xa1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(kVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.j5, Float>) property, z10 ? 1.0f : 0.0f));
            xa1Var.L.setDuration(150L);
            xa1Var.L.addListener(new g71(this, 3));
            xa1Var.L.start();
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
        rect.bottom = org.telegram.messenger.g0.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.Components.in0 {
    public final /* synthetic */ cp N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(cp cpVar, Context context, org.telegram.ui.Components.hn0 hn0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, hn0Var, p6Var, false);
        this.N = cpVar;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.N.L && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 ? super.onTouchEvent(motionEvent) : !this.N.L && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.bottom = org.telegram.messenger.i0.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}

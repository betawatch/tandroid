package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yn extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ ho O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(ho hoVar, Context context, org.telegram.ui.Components.km0 km0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, km0Var, e6Var, false);
        this.O = hoVar;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.O.M && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 ? super.onTouchEvent(motionEvent) : !this.O.M && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}

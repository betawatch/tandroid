package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xn extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ go N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(go goVar, Context context, org.telegram.ui.Components.gm0 gm0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, gm0Var, f6Var, false);
        this.N = goVar;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }
}

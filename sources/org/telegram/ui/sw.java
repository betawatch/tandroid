package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sw extends org.telegram.ui.Components.k00 {
    public final /* synthetic */ uy B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(uy uyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.B0 = uyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}

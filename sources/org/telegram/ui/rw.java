package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rw extends org.telegram.ui.Components.rz {
    public final /* synthetic */ cx I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(cx cxVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.I0 = cxVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.I0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}

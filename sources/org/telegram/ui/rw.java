package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rw extends org.telegram.ui.Components.pz {
    public final /* synthetic */ cx I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(cx cxVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.I0 = cxVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.I0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}

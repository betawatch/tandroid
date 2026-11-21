package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

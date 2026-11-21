package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class tv extends fi.q {
    public final /* synthetic */ cx P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(cx cxVar, Context context, cx cxVar2, int i7, int i10) {
        super(context, cxVar2, i7, i10);
        this.P0 = cxVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.P0).actionBar;
        return !kVar.x() && super.dispatchTouchEvent(motionEvent);
    }
}

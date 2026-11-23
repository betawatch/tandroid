package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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

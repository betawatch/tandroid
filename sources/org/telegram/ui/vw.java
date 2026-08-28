package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vw extends ih.r {
    public final /* synthetic */ dy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(dy dyVar, Context context, dy dyVar2, int i9, int i10) {
        super(context, dyVar2, i9, i10);
        this.K0 = dyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.K0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}

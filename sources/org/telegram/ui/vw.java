package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class vw extends ci.r {
    public final /* synthetic */ ey O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(ey eyVar, Context context, ey eyVar2, int i10, int i11) {
        super(context, eyVar2, i10, i11);
        this.O0 = eyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.O0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}

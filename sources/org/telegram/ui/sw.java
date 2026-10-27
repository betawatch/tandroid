package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sw extends di.r {
    public final /* synthetic */ ey O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(ey eyVar, Context context, ey eyVar2, int i10, int i11) {
        super(context, eyVar2, i10, i11);
        this.O0 = eyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.O0).actionBar;
        return !kVar.q() && super.dispatchTouchEvent(motionEvent);
    }
}

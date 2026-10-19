package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class tw extends ci.r {
    public final /* synthetic */ cy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(cy cyVar, Context context, cy cyVar2, int i10, int i11) {
        super(context, cyVar2, i10, i11);
        this.O0 = cyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        return !kVar.t() && super.dispatchTouchEvent(motionEvent);
    }
}

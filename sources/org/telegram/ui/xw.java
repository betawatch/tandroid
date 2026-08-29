package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xw extends lh.p {
    public final /* synthetic */ fy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(fy fyVar, Context context, fy fyVar2, int i10, int i11) {
        super(context, fyVar2, i10, i11);
        this.K0 = fyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.K0).actionBar;
        return !lVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}

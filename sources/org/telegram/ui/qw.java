package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qw extends di.r {
    public final /* synthetic */ cy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(cy cyVar, Context context, cy cyVar2, int i10, int i11) {
        super(context, cyVar2, i10, i11);
        this.O0 = cyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.O0).actionBar;
        return !kVar.q() && super.dispatchTouchEvent(motionEvent);
    }
}

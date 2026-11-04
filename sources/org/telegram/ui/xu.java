package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xu extends org.telegram.ui.Components.es {
    public final /* synthetic */ tw E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(pw pwVar, tw twVar) {
        super(pwVar);
        this.E = twVar;
    }

    @Override // u4.f1
    public final void y() {
        tw twVar = this.E;
        if (twVar.c.L0() == 0) {
            View m10 = twVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (twVar.w == 2) {
                twVar.w = 1;
            }
            cv cvVar = twVar.n;
            if (cvVar != null) {
                cvVar.b();
            }
        }
    }
}

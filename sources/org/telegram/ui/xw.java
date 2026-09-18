package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xw extends org.telegram.ui.Components.at {
    public final /* synthetic */ vy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(sy syVar, vy vyVar) {
        super(syVar);
        this.E = vyVar;
    }

    @Override // s4.f1
    public final void y() {
        vy vyVar = this.E;
        if (vyVar.c.L0() == 0) {
            View m10 = vyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (vyVar.v == 2) {
                vyVar.v = 1;
            }
            cx cxVar = vyVar.n;
            if (cxVar != null) {
                cxVar.b();
            }
        }
    }
}

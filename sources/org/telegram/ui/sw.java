package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sw extends org.telegram.ui.Components.bt {
    public final /* synthetic */ qy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(ny nyVar, qy qyVar) {
        super(nyVar);
        this.E = qyVar;
    }

    @Override // s4.f1
    public final void y() {
        qy qyVar = this.E;
        if (qyVar.c.L0() == 0) {
            View m10 = qyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (qyVar.v == 2) {
                qyVar.v = 1;
            }
            xw xwVar = qyVar.n;
            if (xwVar != null) {
                xwVar.b();
            }
        }
    }
}

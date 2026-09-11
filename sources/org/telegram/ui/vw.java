package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class vw extends org.telegram.ui.Components.zs {
    public final /* synthetic */ ty E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(qy qyVar, ty tyVar) {
        super(qyVar);
        this.E = tyVar;
    }

    @Override // s4.f1
    public final void y() {
        ty tyVar = this.E;
        if (tyVar.c.L0() == 0) {
            View m10 = tyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (tyVar.v == 2) {
                tyVar.v = 1;
            }
            ax axVar = tyVar.n;
            if (axVar != null) {
                axVar.b();
            }
        }
    }
}

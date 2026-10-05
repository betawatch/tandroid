package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class tw extends org.telegram.ui.Components.dt {
    public final /* synthetic */ ty E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(qy qyVar, ty tyVar) {
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
            yw ywVar = tyVar.n;
            if (ywVar != null) {
                ywVar.b();
            }
        }
    }
}

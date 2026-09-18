package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class vw extends org.telegram.ui.Components.at {
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

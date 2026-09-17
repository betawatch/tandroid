package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

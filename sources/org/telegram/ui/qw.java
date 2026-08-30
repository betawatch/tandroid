package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qw extends org.telegram.ui.Components.ys {
    public final /* synthetic */ ny E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(ky kyVar, ny nyVar) {
        super(kyVar);
        this.E = nyVar;
    }

    @Override // f2.o1
    public final void y() {
        ny nyVar = this.E;
        if (nyVar.c.L0() == 0) {
            View m9 = nyVar.c.m(0);
            if (m9 != null) {
                m9.invalidate();
            }
            if (nyVar.v == 2) {
                nyVar.v = 1;
            }
            vw vwVar = nyVar.n;
            if (vwVar != null) {
                vwVar.b();
            }
        }
    }
}

package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sw extends org.telegram.ui.Components.xs {
    public final /* synthetic */ py E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(my myVar, py pyVar) {
        super(myVar);
        this.E = pyVar;
    }

    @Override // f2.o1
    public final void y() {
        py pyVar = this.E;
        if (pyVar.c.L0() == 0) {
            View m9 = pyVar.c.m(0);
            if (m9 != null) {
                m9.invalidate();
            }
            if (pyVar.v == 2) {
                pyVar.v = 1;
            }
            xw xwVar = pyVar.n;
            if (xwVar != null) {
                xwVar.b();
            }
        }
    }
}

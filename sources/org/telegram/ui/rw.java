package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class rw extends org.telegram.ui.Components.ct {
    public final /* synthetic */ py E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(my myVar, py pyVar) {
        super(myVar);
        this.E = pyVar;
    }

    @Override // s4.f1
    public final void y() {
        py pyVar = this.E;
        if (pyVar.c.L0() == 0) {
            View m10 = pyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (pyVar.v == 2) {
                pyVar.v = 1;
            }
            ww wwVar = pyVar.n;
            if (wwVar != null) {
                wwVar.b();
            }
        }
    }
}

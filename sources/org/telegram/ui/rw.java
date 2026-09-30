package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

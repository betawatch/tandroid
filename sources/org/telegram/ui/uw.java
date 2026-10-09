package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class uw extends org.telegram.ui.Components.rt {
    public final /* synthetic */ sy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(py pyVar, sy syVar) {
        super(pyVar);
        this.E = syVar;
    }

    @Override // s4.g1
    public final void y() {
        sy syVar = this.E;
        if (syVar.c.L0() == 0) {
            View m10 = syVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (syVar.v == 2) {
                syVar.v = 1;
            }
            zw zwVar = syVar.n;
            if (zwVar != null) {
                zwVar.b();
            }
        }
    }
}

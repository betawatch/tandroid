package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z91 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ba1 a;

    public /* synthetic */ z91(ba1 ba1Var) {
        this.a = ba1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ea1 ea1Var = this.a.a;
        Iterator it = ea1Var.e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.e.clear();
        ea1Var.a0();
    }
}

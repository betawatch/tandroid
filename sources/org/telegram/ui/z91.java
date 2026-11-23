package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z91 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ba1 a;

    public /* synthetic */ z91(ba1 ba1Var) {
        this.a = ba1Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ea1 ea1Var = this.a.a;
        Iterator it = ea1Var.e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.e.clear();
        ea1Var.a0();
    }
}

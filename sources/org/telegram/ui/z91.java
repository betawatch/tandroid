package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

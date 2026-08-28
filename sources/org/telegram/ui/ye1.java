package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ af1 a;

    public /* synthetic */ ye1(af1 af1Var) {
        this.a = af1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        df1 df1Var = this.a.a;
        Iterator it = df1Var.e.iterator();
        while (it.hasNext()) {
            df1.T(df1Var, ((Integer) it.next()).intValue());
        }
        df1Var.e.clear();
        df1Var.U();
    }
}

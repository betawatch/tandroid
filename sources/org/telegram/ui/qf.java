package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ qf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        switch (this.a) {
            case 0:
                un unVar = this.b;
                org.telegram.messenger.jj jjVar3 = unVar.t5;
                if (jjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.i0.g(jjVar3.R0)) {
                    new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.xa).k(false).j();
                }
                return true;
            case 1:
                return un.S0(this.b);
            default:
                un unVar2 = this.b;
                int i10 = unVar2.Jb;
                if (i10 == 1 && (jjVar2 = unVar2.F5) != null) {
                    unVar2.k(jjVar2.f1(), 0, true, 0, true, 0);
                    return true;
                }
                if (unVar2.v5 == null || i10 != 2 || (jjVar = unVar2.D5) == null) {
                    return false;
                }
                unVar2.k(jjVar.f1(), 0, true, 0, true, 0);
                return true;
        }
    }
}

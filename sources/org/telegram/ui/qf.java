package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.kj kjVar2;
        switch (this.a) {
            case 0:
                un unVar = this.b;
                org.telegram.messenger.kj kjVar3 = unVar.t5;
                if (kjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.i0.g(kjVar3.R0)) {
                    new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.xa).k(false).j();
                }
                return true;
            case 1:
                return un.x1(this.b);
            default:
                un unVar2 = this.b;
                int i10 = unVar2.Kb;
                if (i10 == 1 && (kjVar2 = unVar2.F5) != null) {
                    unVar2.l(kjVar2.f1(), 0, true, 0, true, 0);
                    return true;
                }
                if (unVar2.v5 == null || i10 != 2 || (kjVar = unVar2.D5) == null) {
                    return false;
                }
                unVar2.l(kjVar.f1(), 0, true, 0, true, 0);
                return true;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r10 implements Runnable {
    public final /* synthetic */ e40 a;

    public r10(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e40 e40Var = this.a;
        org.telegram.ui.ActionBar.n5 n5Var = e40Var.P1;
        l30 l30Var = e40Var.Q1;
        if (l30Var == null || e40Var.J) {
            return;
        }
        org.telegram.messenger.t3 t3Var = e40Var.V2;
        int i7 = t3Var != null ? t3Var.b.schedule_date : e40Var.j4;
        if (i7 == 0) {
            return;
        }
        int currentTime = i7 - ConnectionsManager.getInstance(e40Var.o1.a).getCurrentTime();
        if (currentTime >= 86400) {
            l30Var.l(org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            l30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && n5Var.getTag() == null) {
                n5Var.setTag(1);
                n5Var.l(org.telegram.messenger.gd.N0(2131743191, null), false);
            }
        }
        e40Var.R1.l(org.telegram.messenger.gd.W(3, i7, true), false);
        org.telegram.messenger.g0.h3(e40Var.v4, 1000L);
    }
}

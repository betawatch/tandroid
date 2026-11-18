package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s10 implements Runnable {
    public final /* synthetic */ f40 a;

    public s10(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f40 f40Var = this.a;
        org.telegram.ui.ActionBar.n5 n5Var = f40Var.P1;
        m30 m30Var = f40Var.Q1;
        if (m30Var == null || f40Var.J) {
            return;
        }
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        int i7 = t3Var != null ? t3Var.b.schedule_date : f40Var.j4;
        if (i7 == 0) {
            return;
        }
        int currentTime = i7 - ConnectionsManager.getInstance(f40Var.o1.a).getCurrentTime();
        if (currentTime >= 86400) {
            m30Var.l(org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            m30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && n5Var.getTag() == null) {
                n5Var.setTag(1);
                n5Var.l(org.telegram.messenger.gd.M0(2131743204, null), false);
            }
        }
        f40Var.R1.l(org.telegram.messenger.gd.W(3, i7, true), false);
        org.telegram.messenger.g0.h3(f40Var.v4, 1000L);
    }
}

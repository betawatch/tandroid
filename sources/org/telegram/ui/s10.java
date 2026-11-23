package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class s10 implements Runnable {
    public final /* synthetic */ f40 a;

    public s10(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f40 f40Var = this.a;
        org.telegram.ui.ActionBar.m5 m5Var = f40Var.P1;
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
            m30Var.l(org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            m30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && m5Var.getTag() == null) {
                m5Var.setTag(1);
                m5Var.l(org.telegram.messenger.hd.N0(2131743196, null), false);
            }
        }
        f40Var.R1.l(org.telegram.messenger.hd.W(3, i7, true), false);
        org.telegram.messenger.g0.h3(f40Var.v4, 1000L);
    }
}

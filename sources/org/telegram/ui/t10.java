package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t10 implements Runnable {
    public final /* synthetic */ f40 a;

    public t10(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f40 f40Var = this.a;
        org.telegram.ui.ActionBar.m5 m5Var = f40Var.O1;
        m30 m30Var = f40Var.P1;
        if (m30Var == null || f40Var.I) {
            return;
        }
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        int i7 = r3Var != null ? r3Var.b.schedule_date : f40Var.e4;
        if (i7 == 0) {
            return;
        }
        int currentTime = i7 - ConnectionsManager.getInstance(f40Var.n1.a).getCurrentTime();
        if (currentTime >= 86400) {
            m30Var.l(org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            m30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && m5Var.getTag() == null) {
                m5Var.setTag(1);
                m5Var.l(org.telegram.messenger.id.M0(2131743441, null), false);
            }
        }
        f40Var.Q1.l(org.telegram.messenger.id.W(3, i7, true), false);
        org.telegram.messenger.g0.i3(f40Var.q4, 1000L);
    }
}

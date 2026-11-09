package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r10 implements Runnable {
    public final /* synthetic */ e40 a;

    public r10(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e40 e40Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var = e40Var.L1;
        l30 l30Var = e40Var.M1;
        if (l30Var == null || e40Var.I) {
            return;
        }
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        int i7 = r3Var != null ? r3Var.b.schedule_date : e40Var.b4;
        if (i7 == 0) {
            return;
        }
        int currentTime = i7 - ConnectionsManager.getInstance(e40Var.k1.a).getCurrentTime();
        if (currentTime >= 86400) {
            l30Var.l(org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            l30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && l5Var.getTag() == null) {
                l5Var.setTag(1);
                l5Var.l(org.telegram.messenger.id.M0(2131743441, null), false);
            }
        }
        e40Var.N1.l(org.telegram.messenger.id.W(3, i7, true), false);
        org.telegram.messenger.g0.i3(e40Var.n4, 1000L);
    }
}

package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r4 implements Runnable {
    public final /* synthetic */ u4 a;

    public r4(u4 u4Var) {
        this.a = u4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.K = new a0.h();
        usersSelectActivity.L = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.D = false;
        u4 u4Var = this.a;
        usersSelectActivity.O = u4Var.U();
        usersSelectActivity.n = new c1(this, 2);
        u4Var.presentFragment(usersSelectActivity);
    }
}

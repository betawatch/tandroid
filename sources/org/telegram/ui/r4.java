package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r4 implements Runnable {
    public final /* synthetic */ u4 a;

    public r4(u4 u4Var) {
        this.a = u4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.N = new a0.h();
        usersSelectActivity.O = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.G = false;
        u4 u4Var = this.a;
        usersSelectActivity.R = u4Var.U();
        usersSelectActivity.n = new a1(this, 2);
        u4Var.presentFragment(usersSelectActivity);
    }
}

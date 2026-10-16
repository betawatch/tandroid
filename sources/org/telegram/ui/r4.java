package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        usersSelectActivity.n = new b1(this, 2);
        u4Var.presentFragment(usersSelectActivity);
    }
}

package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s4 implements Runnable {
    public final /* synthetic */ v4 a;

    public s4(v4 v4Var) {
        this.a = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.N = new a0.h();
        usersSelectActivity.O = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.G = false;
        v4 v4Var = this.a;
        usersSelectActivity.R = v4Var.U();
        usersSelectActivity.n = new b1(this, 2);
        v4Var.presentFragment(usersSelectActivity);
    }
}

package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

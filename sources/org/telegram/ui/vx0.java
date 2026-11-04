package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ org.telegram.ui.Components.j50 e;

    public /* synthetic */ vx0(org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.j50 j50Var, int i3) {
        this.a = i3;
        this.b = d2Var;
        this.c = context;
        this.d = e6Var;
        this.e = j50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.ui.Components.j50 j50Var = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.d2 d2Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fc.a0(d2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 4), e6Var)).j();
                org.telegram.messenger.g0.h3(j50Var);
                break;
            case 1:
                org.telegram.ui.Components.fc.a0(d2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 3), e6Var)).j();
                org.telegram.messenger.g0.h3(j50Var);
                break;
            default:
                org.telegram.ui.Components.fc.a0(d2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 7), e6Var)).j();
                org.telegram.messenger.g0.h3(j50Var);
                break;
        }
    }
}

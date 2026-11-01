package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;
    public final /* synthetic */ org.telegram.ui.Components.hi0 e;

    public /* synthetic */ sz0(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.hi0 hi0Var, int i10) {
        this.a = i10;
        this.b = k2Var;
        this.c = context;
        this.d = p6Var;
        this.e = hi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.Components.hi0 hi0Var = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 4), p6Var)).j();
                org.telegram.messenger.i0.g3(hi0Var);
                break;
            case 1:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 3), p6Var)).j();
                org.telegram.messenger.i0.g3(hi0Var);
                break;
            default:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 7), p6Var)).j();
                org.telegram.messenger.i0.g3(hi0Var);
                break;
        }
    }
}

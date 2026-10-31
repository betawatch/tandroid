package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;
    public final /* synthetic */ org.telegram.ui.Components.gi0 e;

    public /* synthetic */ tz0(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.gi0 gi0Var, int i10) {
        this.a = i10;
        this.b = k2Var;
        this.c = context;
        this.d = p6Var;
        this.e = gi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.Components.gi0 gi0Var = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 4), p6Var)).j();
                org.telegram.messenger.i0.g3(gi0Var);
                break;
            case 1:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 3), p6Var)).j();
                org.telegram.messenger.i0.g3(gi0Var);
                break;
            default:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 7), p6Var)).j();
                org.telegram.messenger.i0.g3(gi0Var);
                break;
        }
    }
}

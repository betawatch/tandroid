package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;
    public final /* synthetic */ org.telegram.messenger.jj e;

    public /* synthetic */ rz0(un unVar, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.jj jjVar, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = activity;
        this.d = p6Var;
        this.e = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.messenger.jj jjVar = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        final Activity activity = this.c;
        un unVar = this.b;
        final int i11 = 2;
        switch (i10) {
            case 0:
                final int i12 = 1;
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.sz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, p6Var)).j();
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                break;
            case 1:
                final int i13 = 0;
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.sz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, p6Var)).j();
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                break;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.sz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, p6Var)).j();
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                break;
        }
    }
}

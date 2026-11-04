package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ org.telegram.messenger.zi e;

    public /* synthetic */ tx0(wm wmVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.zi ziVar, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = activity;
        this.d = e6Var;
        this.e = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.messenger.zi ziVar = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        final Activity activity = this.c;
        wm wmVar = this.b;
        final int i10 = 2;
        switch (i3) {
            case 0:
                final int i11 = 1;
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.ux0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, e6Var)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                break;
            case 1:
                final int i12 = 0;
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.ux0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, e6Var)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                break;
            default:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.ux0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, e6Var)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                break;
        }
    }
}

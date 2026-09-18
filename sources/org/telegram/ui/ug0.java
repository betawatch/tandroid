package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;
    public final /* synthetic */ lg0 c;

    public /* synthetic */ ug0(int i10, lg0 lg0Var, vg0 vg0Var) {
        this.a = i10;
        this.b = vg0Var;
        this.c = lg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        lg0 lg0Var = this.c;
        vg0 vg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = lg0.E;
                lg0Var.a();
                AndroidUtilities.runOnUIThread(new ug0(1, lg0Var, vg0Var), 150L);
                break;
            default:
                wg0 wg0Var = vg0Var.a;
                wg0Var.h(null);
                RadialProgressView radialProgressView = wg0Var.V.N.d;
                RadialProgressView radialProgressView2 = lg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.y = radialProgressView2.y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                break;
        }
    }
}

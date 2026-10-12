package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg0 b;
    public final /* synthetic */ pg0 c;

    public /* synthetic */ yg0(int i10, pg0 pg0Var, zg0 zg0Var) {
        this.a = i10;
        this.b = zg0Var;
        this.c = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        pg0 pg0Var = this.c;
        zg0 zg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = pg0.E;
                pg0Var.a();
                AndroidUtilities.runOnUIThread(new yg0(1, pg0Var, zg0Var), 150L);
                break;
            default:
                ah0 ah0Var = zg0Var.a;
                ah0Var.h(null);
                RadialProgressView radialProgressView = ah0Var.V.N.d;
                RadialProgressView radialProgressView2 = pg0Var.h.d;
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

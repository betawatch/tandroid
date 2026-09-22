package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;
    public final /* synthetic */ mg0 c;

    public /* synthetic */ vg0(int i10, mg0 mg0Var, wg0 wg0Var) {
        this.a = i10;
        this.b = wg0Var;
        this.c = mg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        mg0 mg0Var = this.c;
        wg0 wg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = mg0.E;
                mg0Var.a();
                AndroidUtilities.runOnUIThread(new vg0(1, mg0Var, wg0Var), 150L);
                break;
            default:
                xg0 xg0Var = wg0Var.a;
                xg0Var.h(null);
                RadialProgressView radialProgressView = xg0Var.V.N.d;
                RadialProgressView radialProgressView2 = mg0Var.h.d;
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

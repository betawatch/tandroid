package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ md0 c;

    public /* synthetic */ vd0(int i3, f fVar, md0 md0Var) {
        this.a = i3;
        this.b = fVar;
        this.c = md0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        md0 md0Var = this.c;
        f fVar = this.b;
        switch (i3) {
            case 0:
                int i10 = md0.G;
                md0Var.a();
                org.telegram.messenger.g0.i3(new vd0(1, fVar, md0Var), 150L);
                break;
            default:
                wd0 wd0Var = (wd0) fVar.b;
                wd0Var.h(null);
                RadialProgressView radialProgressView = wd0Var.b0.O.d;
                RadialProgressView radialProgressView2 = md0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.b(85L);
                break;
        }
    }
}

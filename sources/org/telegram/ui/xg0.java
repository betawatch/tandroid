package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;
    public final /* synthetic */ og0 c;

    public /* synthetic */ xg0(int i10, og0 og0Var, yg0 yg0Var) {
        this.a = i10;
        this.b = yg0Var;
        this.c = og0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        og0 og0Var = this.c;
        yg0 yg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = og0.E;
                og0Var.a();
                AndroidUtilities.runOnUIThread(new xg0(1, og0Var, yg0Var), 150L);
                break;
            default:
                zg0 zg0Var = yg0Var.a;
                zg0Var.h(null);
                RadialProgressView radialProgressView = zg0Var.V.N.d;
                RadialProgressView radialProgressView2 = og0Var.h.d;
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

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg0 b;
    public final /* synthetic */ ig0 c;

    public /* synthetic */ rg0(int i10, ig0 ig0Var, sg0 sg0Var) {
        this.a = i10;
        this.b = sg0Var;
        this.c = ig0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ig0 ig0Var = this.c;
        sg0 sg0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ig0.E;
                ig0Var.a();
                AndroidUtilities.runOnUIThread(new rg0(1, ig0Var, sg0Var), 150L);
                break;
            default:
                tg0 tg0Var = sg0Var.a;
                tg0Var.h(null);
                RadialProgressView radialProgressView = tg0Var.V.N.d;
                RadialProgressView radialProgressView2 = ig0Var.h.d;
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

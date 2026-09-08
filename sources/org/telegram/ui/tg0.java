package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;
    public final /* synthetic */ kg0 c;

    public /* synthetic */ tg0(int i10, kg0 kg0Var, ug0 ug0Var) {
        this.a = i10;
        this.b = ug0Var;
        this.c = kg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        kg0 kg0Var = this.c;
        ug0 ug0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new tg0(1, kg0Var, ug0Var), 150L);
                break;
            default:
                vg0 vg0Var = ug0Var.a;
                vg0Var.h(null);
                RadialProgressView radialProgressView = vg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
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

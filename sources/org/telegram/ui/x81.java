package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ x81(z81 z81Var, int i10) {
        this.a = i10;
        this.b = z81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z81 z81Var = this.b;
                z81Var.b.setVisibility(4);
                jg.g gVar = z81Var.b;
                gVar.J = false;
                jg.g gVar2 = z81Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = z81Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                z81 z81Var2 = this.b;
                jg.g gVar3 = z81Var2.c;
                gVar3.setVisibility(4);
                jg.g gVar4 = z81Var2.b;
                gVar4.y0 = 0;
                gVar3.y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (gVar4 instanceof jg.q) {
                    gVar4.u0 = false;
                    gVar4.d();
                } else {
                    gVar4.u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.g0.k) - jg.g.k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = z81Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                z81 z81Var3 = this.b;
                z81Var3.b.y0 = 0;
                z81Var3.e.setVisibility(8);
                break;
        }
    }
}

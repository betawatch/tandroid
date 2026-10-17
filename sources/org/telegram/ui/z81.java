package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class z81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b91 b;

    public /* synthetic */ z81(b91 b91Var, int i10) {
        this.a = i10;
        this.b = b91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b91 b91Var = this.b;
                b91Var.b.setVisibility(4);
                jg.g gVar = b91Var.b;
                gVar.J = false;
                jg.g gVar2 = b91Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = b91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                b91 b91Var2 = this.b;
                jg.g gVar3 = b91Var2.c;
                gVar3.setVisibility(4);
                jg.g gVar4 = b91Var2.b;
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
                Window window2 = b91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                b91 b91Var3 = this.b;
                b91Var3.b.y0 = 0;
                b91Var3.e.setVisibility(8);
                break;
        }
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b41 b;

    public /* synthetic */ z31(b41 b41Var, int i3) {
        this.a = i3;
        this.b = b41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b41 b41Var = this.b;
                b41Var.b.setVisibility(4);
                mg.g gVar = b41Var.b;
                gVar.K = false;
                mg.g gVar2 = b41Var.c;
                gVar2.K = true;
                gVar.z0 = 0;
                gVar2.z0 = 0;
                Window window = b41Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                b41 b41Var2 = this.b;
                mg.g gVar3 = b41Var2.c;
                gVar3.setVisibility(4);
                mg.g gVar4 = b41Var2.b;
                gVar4.z0 = 0;
                gVar3.z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (gVar4 instanceof mg.q) {
                    gVar4.v0 = false;
                    gVar4.d();
                } else {
                    gVar4.v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.h0.k) - mg.g.l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = b41Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                b41 b41Var3 = this.b;
                b41Var3.b.z0 = 0;
                b41Var3.e.setVisibility(8);
                break;
        }
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y91 b;

    public /* synthetic */ w91(y91 y91Var, int i10) {
        this.a = i10;
        this.b = y91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y91 y91Var = this.b;
                y91Var.b.setVisibility(4);
                vf.g gVar = y91Var.b;
                gVar.G = false;
                vf.g gVar2 = y91Var.c;
                gVar2.G = true;
                gVar.v0 = 0;
                gVar2.v0 = 0;
                Window window = y91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                y91 y91Var2 = this.b;
                vf.g gVar3 = y91Var2.c;
                gVar3.setVisibility(4);
                vf.g gVar4 = y91Var2.b;
                gVar4.v0 = 0;
                gVar3.v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (gVar4 instanceof vf.q) {
                    gVar4.r0 = false;
                    gVar4.d();
                } else {
                    gVar4.r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.d0.k) - vf.g.h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = y91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                y91 y91Var3 = this.b;
                y91Var3.b.v0 = 0;
                y91Var3.e.setVisibility(8);
                break;
        }
    }
}

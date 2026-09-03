package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x91 b;

    public /* synthetic */ v91(x91 x91Var, int i10) {
        this.a = i10;
        this.b = x91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x91 x91Var = this.b;
                x91Var.b.setVisibility(4);
                wf.g gVar = x91Var.b;
                gVar.G = false;
                wf.g gVar2 = x91Var.c;
                gVar2.G = true;
                gVar.v0 = 0;
                gVar2.v0 = 0;
                Window window = x91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                x91 x91Var2 = this.b;
                wf.g gVar3 = x91Var2.c;
                gVar3.setVisibility(4);
                wf.g gVar4 = x91Var2.b;
                gVar4.v0 = 0;
                gVar3.v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (gVar4 instanceof wf.q) {
                    gVar4.r0 = false;
                    gVar4.d();
                } else {
                    gVar4.r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.d0.k) - wf.g.h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = x91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                x91 x91Var3 = this.b;
                x91Var3.b.v0 = 0;
                x91Var3.e.setVisibility(8);
                break;
        }
    }
}

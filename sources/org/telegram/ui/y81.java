package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a91 b;

    public /* synthetic */ y81(a91 a91Var, int i10) {
        this.a = i10;
        this.b = a91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a91 a91Var = this.b;
                a91Var.b.setVisibility(4);
                rf.g gVar = a91Var.b;
                gVar.F = false;
                rf.g gVar2 = a91Var.c;
                gVar2.F = true;
                gVar.u0 = 0;
                gVar2.u0 = 0;
                Window window = a91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                a91 a91Var2 = this.b;
                rf.g gVar3 = a91Var2.c;
                gVar3.setVisibility(4);
                rf.g gVar4 = a91Var2.b;
                gVar4.u0 = 0;
                gVar3.u0 = 0;
                gVar4.F = true;
                gVar3.F = false;
                if (gVar4 instanceof rf.q) {
                    gVar4.q0 = false;
                    gVar4.d();
                } else {
                    gVar4.q0 = true;
                    gVar4.x((gVar4.C0 * gVar4.c0.k) - rf.g.g1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = a91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                a91 a91Var3 = this.b;
                a91Var3.b.u0 = 0;
                a91Var3.e.setVisibility(8);
                break;
        }
    }
}

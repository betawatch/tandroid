package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ z61 c;

    public /* synthetic */ s51(z61 z61Var, boolean z10, int i10) {
        this.a = i10;
        this.c = z61Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                z61 z61Var = this.c;
                m51 m51Var = z61Var.i0;
                boolean z10 = this.b;
                m51Var.setVisibility(z10 ? 0 : 8);
                z61Var.h0.setVisibility(z10 ? 8 : 0);
                z61Var.E1 = null;
                if (!z10 && (arrayList2 = z61Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = z61Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    z61Var.q0.E(false);
                }
                if (!z10 && (arrayList = z61Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                z61 z61Var2 = this.c;
                z61Var2.j0.setVisibility((this.b && z61Var2.i0.getVisibility() == 0) ? 0 : 8);
                z61Var2.H1 = null;
                break;
        }
    }
}

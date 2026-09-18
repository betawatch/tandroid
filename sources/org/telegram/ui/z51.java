package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ g71 c;

    public /* synthetic */ z51(g71 g71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = g71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                g71 g71Var = this.c;
                t51 t51Var = g71Var.i0;
                boolean z10 = this.b;
                t51Var.setVisibility(z10 ? 0 : 8);
                g71Var.h0.setVisibility(z10 ? 8 : 0);
                g71Var.E1 = null;
                if (!z10 && (arrayList2 = g71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = g71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    g71Var.q0.E(false);
                }
                if (!z10 && (arrayList = g71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                g71 g71Var2 = this.c;
                g71Var2.j0.setVisibility((this.b && g71Var2.i0.getVisibility() == 0) ? 0 : 8);
                g71Var2.H1 = null;
                break;
        }
    }
}

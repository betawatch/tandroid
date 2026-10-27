package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f61 c;

    public /* synthetic */ y41(f61 f61Var, boolean z10, int i10) {
        this.a = i10;
        this.c = f61Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                f61 f61Var = this.c;
                s41 s41Var = f61Var.i0;
                boolean z10 = this.b;
                s41Var.setVisibility(z10 ? 0 : 8);
                f61Var.h0.setVisibility(z10 ? 8 : 0);
                f61Var.F1 = null;
                if (!z10 && (arrayList2 = f61Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = f61Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    f61Var.q0.E(false);
                }
                if (!z10 && (arrayList = f61Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                f61 f61Var2 = this.c;
                f61Var2.j0.setVisibility((this.b && f61Var2.i0.getVisibility() == 0) ? 0 : 8);
                f61Var2.I1 = null;
                break;
        }
    }
}

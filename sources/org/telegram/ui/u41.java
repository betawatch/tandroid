package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class u41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b61 c;

    public /* synthetic */ u41(b61 b61Var, boolean z10, int i10) {
        this.a = i10;
        this.c = b61Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                b61 b61Var = this.c;
                o41 o41Var = b61Var.i0;
                boolean z10 = this.b;
                o41Var.setVisibility(z10 ? 0 : 8);
                b61Var.h0.setVisibility(z10 ? 8 : 0);
                b61Var.F1 = null;
                if (!z10 && (arrayList2 = b61Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = b61Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    b61Var.q0.E(false);
                }
                if (!z10 && (arrayList = b61Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                b61 b61Var2 = this.c;
                b61Var2.j0.setVisibility((this.b && b61Var2.i0.getVisibility() == 0) ? 0 : 8);
                b61Var2.I1 = null;
                break;
        }
    }
}

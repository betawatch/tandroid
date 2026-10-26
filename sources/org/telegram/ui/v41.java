package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c61 c;

    public /* synthetic */ v41(c61 c61Var, boolean z10, int i10) {
        this.a = i10;
        this.c = c61Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                c61 c61Var = this.c;
                p41 p41Var = c61Var.i0;
                boolean z10 = this.b;
                p41Var.setVisibility(z10 ? 0 : 8);
                c61Var.h0.setVisibility(z10 ? 8 : 0);
                c61Var.F1 = null;
                if (!z10 && (arrayList2 = c61Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = c61Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    c61Var.q0.E(false);
                }
                if (!z10 && (arrayList = c61Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                c61 c61Var2 = this.c;
                c61Var2.j0.setVisibility((this.b && c61Var2.i0.getVisibility() == 0) ? 0 : 8);
                c61Var2.I1 = null;
                break;
        }
    }
}

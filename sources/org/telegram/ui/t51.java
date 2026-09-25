package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class t51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a71 c;

    public /* synthetic */ t51(a71 a71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = a71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                a71 a71Var = this.c;
                n51 n51Var = a71Var.i0;
                boolean z10 = this.b;
                n51Var.setVisibility(z10 ? 0 : 8);
                a71Var.h0.setVisibility(z10 ? 8 : 0);
                a71Var.E1 = null;
                if (!z10 && (arrayList2 = a71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = a71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    a71Var.q0.E(false);
                }
                if (!z10 && (arrayList = a71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                a71 a71Var2 = this.c;
                a71Var2.j0.setVisibility((this.b && a71Var2.i0.getVisibility() == 0) ? 0 : 8);
                a71Var2.H1 = null;
                break;
        }
    }
}

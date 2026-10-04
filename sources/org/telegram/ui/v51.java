package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class v51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c71 c;

    public /* synthetic */ v51(c71 c71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = c71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                c71 c71Var = this.c;
                p51 p51Var = c71Var.i0;
                boolean z10 = this.b;
                p51Var.setVisibility(z10 ? 0 : 8);
                c71Var.h0.setVisibility(z10 ? 8 : 0);
                c71Var.E1 = null;
                if (!z10 && (arrayList2 = c71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = c71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    c71Var.q0.E(false);
                }
                if (!z10 && (arrayList = c71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                c71 c71Var2 = this.c;
                c71Var2.j0.setVisibility((this.b && c71Var2.i0.getVisibility() == 0) ? 0 : 8);
                c71Var2.H1 = null;
                break;
        }
    }
}

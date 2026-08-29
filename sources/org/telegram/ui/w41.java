package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d61 c;

    public /* synthetic */ w41(d61 d61Var, boolean z10, int i10) {
        this.a = i10;
        this.c = d61Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                d61 d61Var = this.c;
                q41 q41Var = d61Var.e0;
                boolean z10 = this.b;
                q41Var.setVisibility(z10 ? 0 : 8);
                d61Var.d0.setVisibility(z10 ? 8 : 0);
                d61Var.A1 = null;
                if (!z10 && (arrayList2 = d61Var.w1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = d61Var.z1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    d61Var.m0.E(false);
                }
                if (!z10 && (arrayList = d61Var.x1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                d61 d61Var2 = this.c;
                d61Var2.f0.setVisibility((this.b && d61Var2.e0.getVisibility() == 0) ? 0 : 8);
                d61Var2.D1 = null;
                break;
        }
    }
}

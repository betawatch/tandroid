package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a61 c;

    public /* synthetic */ t41(a61 a61Var, boolean z10, int i10) {
        this.a = i10;
        this.c = a61Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                a61 a61Var = this.c;
                n41 n41Var = a61Var.e0;
                boolean z10 = this.b;
                n41Var.setVisibility(z10 ? 0 : 8);
                a61Var.d0.setVisibility(z10 ? 8 : 0);
                a61Var.A1 = null;
                if (!z10 && (arrayList2 = a61Var.w1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = a61Var.z1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    a61Var.m0.E(false);
                }
                if (!z10 && (arrayList = a61Var.x1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                a61 a61Var2 = this.c;
                a61Var2.f0.setVisibility((this.b && a61Var2.e0.getVisibility() == 0) ? 0 : 8);
                a61Var2.D1 = null;
                break;
        }
    }
}

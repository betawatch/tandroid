package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b61 c;

    public /* synthetic */ u41(b61 b61Var, boolean z10, int i9) {
        this.a = i9;
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
                o41 o41Var = b61Var.e0;
                boolean z10 = this.b;
                o41Var.setVisibility(z10 ? 0 : 8);
                b61Var.d0.setVisibility(z10 ? 8 : 0);
                b61Var.A1 = null;
                if (!z10 && (arrayList2 = b61Var.w1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = b61Var.z1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    b61Var.m0.E(false);
                }
                if (!z10 && (arrayList = b61Var.x1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                b61 b61Var2 = this.c;
                b61Var2.f0.setVisibility((this.b && b61Var2.e0.getVisibility() == 0) ? 0 : 8);
                b61Var2.D1 = null;
                break;
        }
    }
}

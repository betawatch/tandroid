package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class s41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ z51 c;

    public /* synthetic */ s41(z51 z51Var, boolean z10, int i10) {
        this.a = i10;
        this.c = z51Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                z51 z51Var = this.c;
                m41 m41Var = z51Var.i0;
                boolean z10 = this.b;
                m41Var.setVisibility(z10 ? 0 : 8);
                z51Var.h0.setVisibility(z10 ? 8 : 0);
                z51Var.E1 = null;
                if (!z10 && (arrayList2 = z51Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = z51Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    z51Var.q0.E(false);
                }
                if (!z10 && (arrayList = z51Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                z51 z51Var2 = this.c;
                z51Var2.j0.setVisibility((this.b && z51Var2.i0.getVisibility() == 0) ? 0 : 8);
                z51Var2.H1 = null;
                break;
        }
    }
}

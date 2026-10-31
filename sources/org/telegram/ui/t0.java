package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.c;
                h4Var.u0[1].b();
                h4Var.u0[1].setVisibility(8);
                h4Var.P0.S(h4Var.u0[0].b);
                org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
                l3[] l3VarArr = h4Var.u0;
                k9Var.z0 = l3VarArr[0].d;
                int i10 = this.b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.u0[i10].setLayerType(0, null);
                h4Var.v0 = null;
                h4Var.f0.f = false;
                break;
            case 1:
                Activity activity = (Activity) this.c;
                int i11 = this.b;
                org.telegram.messenger.i0.s3(activity, i11, false);
                org.telegram.messenger.i0.l3(activity, org.telegram.messenger.i0.B(i11) >= 0.721f);
                break;
            default:
                ((LaunchActivity) this.c).D0(this.b);
                break;
        }
    }
}

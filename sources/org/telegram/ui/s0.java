package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.c;
                i4Var.v0[1].b();
                i4Var.v0[1].setVisibility(8);
                i4Var.Q0.S(i4Var.v0[0].b);
                org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
                l3[] l3VarArr = i4Var.v0;
                h9Var.z0 = l3VarArr[0].d;
                int i3 = this.b;
                l3VarArr[i3].setBackgroundDrawable(null);
                i4Var.v0[i3].setLayerType(0, null);
                i4Var.w0 = null;
                i4Var.g0.f = false;
                break;
            case 1:
                Activity activity = (Activity) this.c;
                int i10 = this.b;
                org.telegram.messenger.g0.t3(activity, i10, false);
                org.telegram.messenger.g0.m3(activity, org.telegram.messenger.g0.B(i10) >= 0.721f);
                break;
            default:
                ((LaunchActivity) this.c).D0(this.b);
                break;
        }
    }
}

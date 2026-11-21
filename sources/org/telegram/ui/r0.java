package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.fs c;

    public /* synthetic */ r0(org.telegram.messenger.fs fsVar, int i7, int i10) {
        this.a = i10;
        this.c = fsVar;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                g4Var.v0[1].b();
                g4Var.v0[1].setVisibility(8);
                g4Var.Q0.S(g4Var.v0[0].b);
                org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
                k3[] k3VarArr = g4Var.v0;
                j9Var.z0 = k3VarArr[0].d;
                int i7 = this.b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.v0[i7].setLayerType(0, null);
                g4Var.w0 = null;
                g4Var.g0.f = false;
                break;
            default:
                ((LaunchActivity) this.c).D0(this.b);
                break;
        }
    }
}

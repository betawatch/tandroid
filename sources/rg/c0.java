package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ c0(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f2.setTranslationY(0.0f);
                break;
            default:
                o0 o0Var = this.b;
                o0Var.i2 = false;
                o0Var.f2.setTranslationY(0.0f);
                o0Var.m0();
                break;
        }
    }
}

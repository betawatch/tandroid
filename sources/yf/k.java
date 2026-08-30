package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ n e;

    public k(n nVar, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.e = nVar;
        this.a = z4;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.e;
        nVar.C = false;
        if (this.a) {
            return;
        }
        nVar.e(this.b, this.c, this.d, true);
    }
}

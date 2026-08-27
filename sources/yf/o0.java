package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ o0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                p0Var.K = null;
                p0Var.f.f(new qf.b(this, 19));
                break;
            default:
                this.b.f.f(new qf.b(this, 20));
                break;
        }
    }
}

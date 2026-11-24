// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qz9 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nz9 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ nz9 e;
    public final /* synthetic */ rz9 f;

    public qz9(rz9 rz9Var, boolean z, nz9 nz9Var, boolean[] zArr, boolean z2, nz9 nz9Var2) {
        this.f = rz9Var;
        this.a = z;
        this.b = nz9Var;
        this.c = zArr;
        this.d = z2;
        this.e = nz9Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nz9 nz9Var;
        rz9 rz9Var = this.f;
        ne6 ne6Var = rz9Var.s;
        boolean z = this.a;
        float f = z ? 1.0f : 0.0f;
        rz9Var.J = f;
        gm.V1(rz9Var.c, rz9Var.d, f, rz9Var.e);
        ne6Var.invalidate();
        if (!z) {
            rz9Var.w.setAlpha(rz9Var.J);
        }
        if (rz9Var.J < 0.5f && !z && (nz9Var = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                nz9Var.run();
            }
        }
        if (!z) {
            if (this.d) {
                rz9Var.a.b = false;
                rz9Var.Q.i0.invalidate();
            }
            nm7.e().k(nm7.k1, 4);
        }
        rz9Var.L = null;
        ne6Var.invalidate();
        nz9 nz9Var2 = this.e;
        if (nz9Var2 != null) {
            nz9Var2.run();
        }
    }
}

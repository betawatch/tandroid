package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ z2 c;

    public /* synthetic */ q1(z2 z2Var, boolean z10, int i10) {
        this.a = i10;
        this.c = z2Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    z2 z2Var = this.c;
                    z2Var.a3.setVisibility(8);
                    z2Var.a3.n();
                    break;
                }
                break;
            default:
                z2 z2Var2 = this.c;
                t6 t6Var = z2Var2.l0;
                dg0 dg0Var = z2Var2.h0;
                ImageView imageView = z2Var2.g0;
                ImageView imageView2 = z2Var2.f0;
                w2 w2Var = z2Var2.X0;
                z2Var2.N3 = this.b ? 1.0f : 0.0f;
                w2Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                w2Var.setAlpha(1.0f - z2Var2.N3);
                imageView2.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                imageView2.setAlpha(1.0f - z2Var2.N3);
                imageView.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                imageView.setAlpha(1.0f - z2Var2.N3);
                dg0Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                dg0Var.setAlpha((1.0f - z2Var2.N3) * z2Var2.N2);
                b2 b2Var = z2Var2.F1;
                if (b2Var != null) {
                    b2Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * z2Var2.N3);
                    z2Var2.F1.setAlpha(1.0f - z2Var2.N3);
                }
                if (t6Var != null) {
                    t6Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                    t6Var.setAlpha(1.0f - z2Var2.N3);
                }
                z2Var2.t0.setAlpha(1.0f - z2Var2.N3);
                v2 v2Var = z2Var2.z1;
                float f7 = v2Var != null ? ((f7) v2Var).d.V : 0.0f;
                hideInterfaceAlpha = z2Var2.getHideInterfaceAlpha();
                b2 b2Var2 = z2Var2.m0;
                if (b2Var2 != null) {
                    b2Var2.setAlpha((1.0f - z2Var2.N3) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = z2Var2.w0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - z2Var2.N3) * (1.0f - f7) * hideInterfaceAlpha);
                }
                b2 b2Var3 = z2Var2.y0;
                if (b2Var3 != null) {
                    b2Var3.setAlpha((1.0f - z2Var2.N3) * (1.0f - f7) * hideInterfaceAlpha);
                }
                t1 t1Var = z2Var2.K1;
                if (t1Var != null) {
                    t1Var.setAlpha(1.0f - z2Var2.N3);
                    z2Var2.invalidate();
                }
                z2Var2.L0.invalidate();
                break;
        }
    }
}

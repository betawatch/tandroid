package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a3 c;

    public /* synthetic */ p1(a3 a3Var, boolean z10, int i10) {
        this.a = i10;
        this.c = a3Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    a3 a3Var = this.c;
                    a3Var.r3.setVisibility(8);
                    a3Var.r3.n();
                    break;
                }
                break;
            default:
                a3 a3Var2 = this.c;
                z6 z6Var = a3Var2.C0;
                m91 m91Var = a3Var2.y0;
                ImageView imageView = a3Var2.x0;
                ImageView imageView2 = a3Var2.w0;
                x2 x2Var = a3Var2.o1;
                a3Var2.d4 = this.b ? 1.0f : 0.0f;
                x2Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.d4);
                x2Var.setAlpha(1.0f - a3Var2.d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.d4);
                imageView2.setAlpha(1.0f - a3Var2.d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.d4);
                imageView.setAlpha(1.0f - a3Var2.d4);
                m91Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.d4);
                m91Var.setAlpha((1.0f - a3Var2.d4) * a3Var2.e3);
                b2 b2Var = a3Var2.W1;
                if (b2Var != null) {
                    b2Var.setTranslationY(AndroidUtilities.dp(8.0f) * a3Var2.d4);
                    a3Var2.W1.setAlpha(1.0f - a3Var2.d4);
                }
                if (z6Var != null) {
                    z6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.d4);
                    z6Var.setAlpha(1.0f - a3Var2.d4);
                }
                a3Var2.K0.setAlpha(1.0f - a3Var2.d4);
                w2 w2Var = a3Var2.Q1;
                float f7 = w2Var != null ? ((l7) w2Var).d.V : 0.0f;
                hideInterfaceAlpha = a3Var2.getHideInterfaceAlpha();
                b2 b2Var2 = a3Var2.D0;
                if (b2Var2 != null) {
                    b2Var2.setAlpha((1.0f - a3Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = a3Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - a3Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                b2 b2Var3 = a3Var2.P0;
                if (b2Var3 != null) {
                    b2Var3.setAlpha((1.0f - a3Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                t1 t1Var = a3Var2.b2;
                if (t1Var != null) {
                    t1Var.setAlpha(1.0f - a3Var2.d4);
                    a3Var2.invalidate();
                }
                a3Var2.c1.invalidate();
                break;
        }
    }
}

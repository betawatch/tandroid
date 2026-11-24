// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sc5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tc5 c;

    public /* synthetic */ sc5(tc5 tc5Var, boolean z, byte b) {
        this.a = b;
        this.c = tc5Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f;
        tu1 tu1Var;
        fu fuVar;
        byte b = this.a;
        boolean z = this.b;
        tc5 tc5Var = this.c;
        switch (b) {
            case 0:
                f = z ? 1.0f : 0.0f;
                tc5Var.x = f;
                tc5Var.e.setTranslationY(f * gl.L(48.0f));
                tc5Var.e.setPadding(0, 0, 0, (int) (tc5Var.x * gl.L(48.0f)));
                break;
            default:
                f = z ? 1.0f : 0.0f;
                tc5Var.F = f;
                tc5Var.n.setScaleX(gl.R1(0.95f, 1.0f, f));
                tc5Var.n.setScaleY(gl.R1(0.95f, 1.0f, tc5Var.F));
                wq1 wq1Var = tc5Var.f;
                if (wq1Var != null && (tu1Var = wq1Var.a) != null && (fuVar = tu1Var.a4) != null) {
                    fuVar.setScaleX(gl.R1(1.0f, 0.95f, tc5Var.F));
                    tc5Var.f.a.a4.setScaleY(gl.R1(1.0f, 0.95f, tc5Var.F));
                }
                tc5Var.h.setAlpha(tc5Var.F);
                if (!z) {
                    tc5Var.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}

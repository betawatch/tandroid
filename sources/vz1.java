// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vz1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c02 c;

    public /* synthetic */ vz1(c02 c02Var, boolean z, byte b) {
        this.a = b;
        this.c = c02Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int L;
        byte b = this.a;
        boolean z = this.b;
        c02 c02Var = this.c;
        switch (b) {
            case 0:
                x02 x02Var = c02Var.e;
                if (z) {
                    x02Var.u3.setVisibility(8);
                    L = gl.L(36.0f);
                } else {
                    x02Var.B3.setVisibility(8);
                    L = 0;
                }
                for (int i = 0; i < x02Var.u2.size(); i++) {
                    ((s12) x02Var.u2.valueAt(i)).setMeasureOffsetY(L);
                }
                if (c02Var.a == animator) {
                    c02Var.a = null;
                    break;
                }
                break;
            default:
                x02 x02Var2 = c02Var.e;
                x02Var2.y3 = z;
                if (!z) {
                    x02Var2.z3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                x02 x02Var = this.c.e;
                if (this.b) {
                    x02Var.B3.setAlpha(0.0f);
                    x02Var.B3.setVisibility(0);
                    int L = gl.L(36.0f);
                    for (int i = 0; i < x02Var.u2.size(); i++) {
                        ((s12) x02Var.u2.valueAt(i)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    x02Var.u3.setAlpha(0.0f);
                    x02Var.u3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.q2;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ d0(i0 i0Var, x0 x0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
        this.c = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x0 x0Var = this.c;
        i0 i0Var = this.b;
        switch (i7) {
            case 0:
                i0Var.c = x0Var;
                if (i0Var.h == null) {
                    i0Var.h = new RectF();
                }
                i0Var.c.a(i0Var.h);
                jn jnVar = i0Var.a;
                if (jnVar != null) {
                    jnVar.l();
                    break;
                }
                break;
            default:
                if (x0Var != null && i0Var.q == 0) {
                    i0Var.q = i1.b(i0Var.g);
                }
                int i10 = 0;
                if (i0Var.H == (x0Var != null)) {
                    if (x0Var != i0Var.d) {
                        i0Var.d = x0Var;
                        jn jnVar2 = i0Var.a;
                        if (jnVar2 != null) {
                            jnVar2.l();
                            break;
                        }
                    }
                } else {
                    i0Var.H = x0Var != null;
                    ValueAnimator valueAnimator = i0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        i0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(i0Var.I, i0Var.H ? 1.0f : 0.0f);
                    i0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new c0(i0Var, i10));
                    i0Var.K.addListener(new g0(i0Var, i10));
                    i0Var.K.setInterpolator(nr.h);
                    i0Var.K.start();
                    i0Var.d = x0Var;
                    jn jnVar3 = i0Var.a;
                    if (jnVar3 != null) {
                        jnVar3.l();
                    }
                    if (i0Var.H) {
                        q2.y.a();
                        break;
                    }
                }
                break;
        }
    }
}

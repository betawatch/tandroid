package xf;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ f1 c;

    public /* synthetic */ l0(q0 q0Var, f1 f1Var, int i9) {
        this.a = i9;
        this.b = q0Var;
        this.c = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        f1 f1Var = this.c;
        q0 q0Var = this.b;
        switch (i9) {
            case 0:
                q0Var.c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.c.a(q0Var.h);
                m5.c0 c0Var = q0Var.a;
                if (c0Var != null) {
                    c0Var.i();
                    break;
                }
                break;
            default:
                if (f1Var != null && q0Var.q == 0) {
                    q0Var.q = r1.b(q0Var.g);
                }
                int i10 = 0;
                if (q0Var.H == (f1Var != null)) {
                    if (f1Var != q0Var.d) {
                        q0Var.d = f1Var;
                        m5.c0 c0Var2 = q0Var.a;
                        if (c0Var2 != null) {
                            c0Var2.i();
                            break;
                        }
                    }
                } else {
                    q0Var.H = f1Var != null;
                    ValueAnimator valueAnimator = q0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(q0Var.I, q0Var.H ? 1.0f : 0.0f);
                    q0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new k0(q0Var, i10));
                    q0Var.K.addListener(new p0(q0Var, i10));
                    q0Var.K.setInterpolator(gr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    m5.c0 c0Var3 = q0Var.a;
                    if (c0Var3 != null) {
                        c0Var3.i();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}

package yf;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ e1 c;

    public /* synthetic */ l0(p0 p0Var, e1 e1Var, int i10) {
        this.a = i10;
        this.b = p0Var;
        this.c = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        e1 e1Var = this.c;
        p0 p0Var = this.b;
        switch (i10) {
            case 0:
                p0Var.c = e1Var;
                if (p0Var.h == null) {
                    p0Var.h = new RectF();
                }
                p0Var.c.a(p0Var.h);
                n1.d dVar = p0Var.a;
                if (dVar != null) {
                    dVar.C();
                    break;
                }
                break;
            default:
                if (e1Var != null && p0Var.q == 0) {
                    p0Var.q = q1.b(p0Var.g);
                }
                int i11 = 0;
                if (p0Var.H == (e1Var != null)) {
                    if (e1Var != p0Var.d) {
                        p0Var.d = e1Var;
                        n1.d dVar2 = p0Var.a;
                        if (dVar2 != null) {
                            dVar2.C();
                            break;
                        }
                    }
                } else {
                    p0Var.H = e1Var != null;
                    ValueAnimator valueAnimator = p0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        p0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(p0Var.I, p0Var.H ? 1.0f : 0.0f);
                    p0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new k0(p0Var, i11));
                    p0Var.K.addListener(new o0(p0Var, i11));
                    p0Var.K.setInterpolator(er.h);
                    p0Var.K.start();
                    p0Var.d = e1Var;
                    n1.d dVar3 = p0Var.a;
                    if (dVar3 != null) {
                        dVar3.C();
                    }
                    if (p0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}

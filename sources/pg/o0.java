package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ o0(s0 s0Var, i1 i1Var, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i1 i1Var = this.c;
        s0 s0Var = this.b;
        switch (i10) {
            case 0:
                s0Var.c = i1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.c.a(s0Var.h);
                l.d dVar = s0Var.a;
                if (dVar != null) {
                    dVar.V();
                    break;
                }
                break;
            default:
                if (i1Var != null && s0Var.q == 0) {
                    s0Var.q = u1.b(s0Var.g);
                }
                int i11 = 0;
                if (s0Var.H == (i1Var != null)) {
                    if (i1Var != s0Var.d) {
                        s0Var.d = i1Var;
                        l.d dVar2 = s0Var.a;
                        if (dVar2 != null) {
                            dVar2.V();
                            break;
                        }
                    }
                } else {
                    s0Var.H = i1Var != null;
                    ValueAnimator valueAnimator = s0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        s0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s0Var.I, s0Var.H ? 1.0f : 0.0f);
                    s0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new n0(s0Var, i11));
                    s0Var.K.addListener(new r0(s0Var, i11));
                    s0Var.K.setInterpolator(qr.h);
                    s0Var.K.start();
                    s0Var.d = i1Var;
                    l.d dVar3 = s0Var.a;
                    if (dVar3 != null) {
                        dVar3.V();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}

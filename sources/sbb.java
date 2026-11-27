// default package

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sbb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lcb b;

    public /* synthetic */ sbb(lcb lcbVar, byte b) {
        this.a = b;
        this.b = lcbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        lcb lcbVar = this.b;
        switch (b) {
            case 0:
                lcbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.l();
                ybb ybbVar = lcbVar.s;
                if (ybbVar != null) {
                    ybbVar.invalidate();
                }
                w96 w96Var = lcbVar.B0;
                if (w96Var != null) {
                    w96Var.F((1.0f - lcbVar.W) * lcbVar.V);
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.V = floatValue;
                zbb zbbVar = lcbVar.w;
                if (zbbVar != null && floatValue > 0.6f && si5.c && zbbVar.a) {
                    zbbVar.a(false);
                }
                w96 w96Var2 = lcbVar.B0;
                if (w96Var2 != null) {
                    w96Var2.F((1.0f - lcbVar.W) * lcbVar.V);
                }
                lcbVar.l();
                ybb ybbVar2 = lcbVar.s;
                if (ybbVar2 != null) {
                    ybbVar2.invalidate();
                    break;
                }
                break;
            case 2:
                lcbVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.e0 = Utilities.i(lcbVar.a0 / hl.L(200.0f), 1.0f, 0.0f);
                acb acbVar = lcbVar.o0;
                o68 currentPeerView = acbVar == null ? null : acbVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                lcbVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcbVar.w.invalidate();
                break;
        }
    }
}

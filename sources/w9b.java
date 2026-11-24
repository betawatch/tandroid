// default package

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class w9b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oab b;

    public /* synthetic */ w9b(oab oabVar, byte b) {
        this.a = b;
        this.b = oabVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        oab oabVar = this.b;
        switch (b) {
            case 0:
                oabVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.l();
                cab cabVar = oabVar.s;
                if (cabVar != null) {
                    cabVar.invalidate();
                }
                s96 s96Var = oabVar.B0;
                if (s96Var != null) {
                    s96Var.F((1.0f - oabVar.W) * oabVar.V);
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.V = floatValue;
                dab dabVar = oabVar.w;
                if (dabVar != null && floatValue > 0.6f && pi5.c && dabVar.a) {
                    dabVar.a(false);
                }
                s96 s96Var2 = oabVar.B0;
                if (s96Var2 != null) {
                    s96Var2.F((1.0f - oabVar.W) * oabVar.V);
                }
                oabVar.l();
                cab cabVar2 = oabVar.s;
                if (cabVar2 != null) {
                    cabVar2.invalidate();
                    break;
                }
                break;
            case 2:
                oabVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.e0 = Utilities.i(oabVar.a0 / gm.L(200.0f), 1.0f, 0.0f);
                eab eabVar = oabVar.o0;
                a58 currentPeerView = eabVar == null ? null : eabVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                oabVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.w.invalidate();
                break;
        }
    }
}

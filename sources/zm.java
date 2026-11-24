// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zm(Object obj, float f, float f2, float f3, float f4, byte b) {
        this.a = b;
        this.f = obj;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        float f4 = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                gn gnVar = (gn) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.lastDrawnCy = gm.R1(f4, f3, floatValue);
                gnVar.lastDrawnCx = gm.R1(f2, f, floatValue);
                break;
            case 1:
                tl1 tl1Var = (tl1) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tl1Var.k = td4.A(f3, f4, floatValue2, f4);
                tl1Var.l = td4.A(f, f2, floatValue2, f2);
                tl1Var.a.a(f3, f, false);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i = ChatActivityEnterView.z7;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float A = td4.A(f3, f4, floatValue3, f4);
                m6a m6aVar = chatActivityEnterView.q0;
                if (m6aVar != null) {
                    m6aVar.setAlpha(((f - f2) * floatValue3) + f2);
                    chatActivityEnterView.q0.setTranslationX(A);
                }
                chatActivityEnterView.R0.setTranslationX(A);
                chatActivityEnterView.H = A;
                chatActivityEnterView.u2();
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vs4 vs4Var = ((sm3) ((rm3) obj).b).a;
                vs4Var.d = td4.A(f3, f4, floatValue4, f4);
                vs4Var.i = td4.A(f, f2, floatValue4, f2);
                break;
            default:
                wc1 wc1Var = (wc1) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an9 an9Var = wc1Var.a;
                an9Var.setScaleX(gm.R1(f4, f3, floatValue5));
                an9Var.setScaleY(gm.R1(f4, f3, floatValue5));
                an9Var.setTranslationX(f2 * floatValue5);
                an9Var.setTranslationY(f * floatValue5);
                float f5 = 1.0f - floatValue5;
                an9Var.setAlpha(f5);
                wc1Var.s = f5;
                wc1Var.invalidate();
                break;
        }
    }
}

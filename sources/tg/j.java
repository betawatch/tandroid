package tg;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ j(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                nVar.g(org.telegram.messenger.g0.b2(nVar.N, nVar.k0, nVar.S.getAnimatedFraction()));
                break;
            case 1:
                n nVar2 = this.b;
                nVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar2.p0 = floatValue;
                nVar2.setAlpha(floatValue);
                m mVar = nVar2.J;
                if (mVar != null) {
                    mVar.setScaleX(Utilities.i(nVar2.p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, nVar2.l0));
                    nVar2.J.setScaleY(Utilities.i(nVar2.p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, nVar2.l0));
                    nVar2.J.setAlpha(Math.max(0.0f, nVar2.p0 - 0.8f) * nVar2.l0 * 5.0f);
                }
                nVar2.invalidate();
                break;
            case 2:
                n nVar3 = this.b;
                nVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar3.l0 = floatValue2;
                m mVar2 = nVar3.J;
                if (mVar2 != null) {
                    mVar2.setScaleX(Utilities.i(nVar3.p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, floatValue2));
                    nVar3.J.setScaleY(Utilities.i(nVar3.p0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, nVar3.l0));
                    nVar3.J.setAlpha(Math.max(0.0f, nVar3.p0 - 0.8f) * nVar3.l0 * 5.0f);
                    break;
                }
                break;
            case 3:
                this.b.k();
                break;
            case 4:
                this.b.k();
                break;
            default:
                n nVar4 = this.b;
                float b22 = org.telegram.messenger.g0.b2(nVar4.k0, nVar4.N, valueAnimator.getAnimatedFraction());
                nVar4.Q = b22;
                nVar4.g(b22);
                break;
        }
    }
}

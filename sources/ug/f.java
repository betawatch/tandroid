package ug;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ f(j jVar, int i3) {
        this.a = i3;
        this.b = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.g(org.telegram.messenger.g0.b2(jVar.M, jVar.j0, jVar.R.getAnimatedFraction()));
                break;
            case 1:
                j jVar2 = this.b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.o0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.I;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.i(jVar2.o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar2.k0));
                    jVar2.I.setScaleY(Utilities.i(jVar2.o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar2.k0));
                    jVar2.I.setAlpha(Math.max(0.0f, jVar2.o0 - 0.8f) * jVar2.k0 * 5.0f);
                }
                jVar2.invalidate();
                break;
            case 2:
                j jVar3 = this.b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.k0 = floatValue2;
                i iVar2 = jVar3.I;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.i(jVar3.o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, floatValue2));
                    jVar3.I.setScaleY(Utilities.i(jVar3.o0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.g0.T1(0.9f, 1.0f, jVar3.k0));
                    jVar3.I.setAlpha(Math.max(0.0f, jVar3.o0 - 0.8f) * jVar3.k0 * 5.0f);
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
                j jVar4 = this.b;
                float b22 = org.telegram.messenger.g0.b2(jVar4.j0, jVar4.M, valueAnimator.getAnimatedFraction());
                jVar4.P = b22;
                jVar4.g(b22);
                break;
        }
    }
}

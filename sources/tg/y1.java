package tg;

import ai.q2;
import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                f2 f2Var = (f2) obj;
                f2Var.getClass();
                f2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 1:
                m2 m2Var = (m2) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.E = floatValue;
                q2 q2Var = m2Var.c;
                q2Var.setAlpha(floatValue);
                q2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, m2Var.E));
                q2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, m2Var.E));
                m2Var.b.invalidate();
                break;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.c0 = floatValue2 < 0.5f ? (floatValue2 / 0.5f) * (-7.0f) : (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 3:
                ug.q0 q0Var = (ug.q0) obj;
                q0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.f.invalidate();
                ug.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((ug.s1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                ((vg.e) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 6:
                wg.b bVar = (wg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            default:
                ((wi.h) obj).m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}

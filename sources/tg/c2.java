package tg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                i2 i2Var = (i2) obj;
                i2Var.getClass();
                i2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 1:
                o2 o2Var = (o2) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2Var.E = floatValue;
                ai.l2 l2Var = o2Var.c;
                l2Var.setAlpha(floatValue);
                l2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, o2Var.E));
                l2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, o2Var.E));
                o2Var.b.invalidate();
                break;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.c0 = floatValue2 < 0.5f ? (floatValue2 / 0.5f) * (-7.0f) : (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 3:
                ug.r0 r0Var = (ug.r0) obj;
                r0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.f.invalidate();
                ug.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((ug.t1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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

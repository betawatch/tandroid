package tg;

import ai.r2;
import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                e2 e2Var = (e2) obj;
                e2Var.getClass();
                e2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 1:
                l2 l2Var = (l2) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.E = floatValue;
                r2 r2Var = l2Var.c;
                r2Var.setAlpha(floatValue);
                r2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, l2Var.E));
                r2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, l2Var.E));
                l2Var.b.invalidate();
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

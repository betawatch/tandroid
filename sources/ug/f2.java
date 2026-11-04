package ug;

import android.animation.ValueAnimator;
import android.view.KeyEvent;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ f2(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.b = callback;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i3) {
            case 0:
                j2 j2Var = (j2) callback;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j2Var.E = floatValue;
                ci.q qVar = j2Var.c;
                qVar.setAlpha(floatValue);
                qVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, j2Var.E));
                qVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, j2Var.E));
                j2Var.b.invalidate();
                break;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) callback;
                int i10 = LimitPreviewView.p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.c0 = floatValue2 < 0.5f ? (floatValue2 / 0.5f) * (-7.0f) : (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 2:
                vg.o0 o0Var = (vg.o0) callback;
                o0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.f.invalidate();
                vg.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((vg.t1) callback).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                ((wg.e) callback).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                xg.b bVar = (xg.b) callback;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
        }
    }
}

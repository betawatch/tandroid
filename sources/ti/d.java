package ti;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import ug.o0;
import ug.p0;
import ug.q1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((i) obj).m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.o0;
                limitPreviewView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue < 0.5f ? (floatValue / 0.5f) * (-7.0f) : (1.0f - ((floatValue - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 2:
                p0 p0Var = (p0) obj;
                p0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.f.invalidate();
                o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((q1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                ((vg.e) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                wg.b bVar = (wg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
        }
    }
}

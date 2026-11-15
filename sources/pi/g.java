package pi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ k c;
    public final /* synthetic */ View d;

    public /* synthetic */ g(k kVar, View view, float f10, int i7) {
        this.a = i7;
        this.c = kVar;
        this.d = view;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.c;
                float measuredHeight = ((kVar.G.getMeasuredHeight() - kVar.F.O9) - r2.Xa) / 2.0f;
                f0 f0Var = (f0) this.d;
                float measuredHeight2 = (measuredHeight - (f0Var.getMeasuredHeight() / 2.0f)) + kVar.F.O9;
                f0Var.setTranslationY(((((float) f0Var.getTop()) > measuredHeight2 ? measuredHeight2 - f0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.c;
                float measuredHeight3 = ((kVar2.G.getMeasuredHeight() - kVar2.F.O9) - r2.Xa) / 2.0f;
                ra raVar = (ra) this.d;
                float measuredHeight4 = (measuredHeight3 - (raVar.getMeasuredHeight() / 2.0f)) + kVar2.F.O9;
                raVar.setTranslationY(((((float) raVar.getTop()) > measuredHeight4 ? measuredHeight4 - raVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}

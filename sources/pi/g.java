package pi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.sa;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                float measuredHeight = ((kVar.G.getMeasuredHeight() - kVar.F.P9) - r2.Ya) / 2.0f;
                g0 g0Var = (g0) this.d;
                float measuredHeight2 = (measuredHeight - (g0Var.getMeasuredHeight() / 2.0f)) + kVar.F.P9;
                g0Var.setTranslationY(((((float) g0Var.getTop()) > measuredHeight2 ? measuredHeight2 - g0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.c;
                float measuredHeight3 = ((kVar2.G.getMeasuredHeight() - kVar2.F.P9) - r2.Ya) / 2.0f;
                sa saVar = (sa) this.d;
                float measuredHeight4 = (measuredHeight3 - (saVar.getMeasuredHeight() / 2.0f)) + kVar2.F.P9;
                saVar.setTranslationY(((((float) saVar.getTop()) > measuredHeight4 ? measuredHeight4 - saVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}

package wh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.xa;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ n c;
    public final /* synthetic */ View d;

    public /* synthetic */ h(n nVar, View view, float f10, int i10) {
        this.a = i10;
        this.c = nVar;
        this.d = view;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.c;
                float measuredHeight = ((nVar.G.getMeasuredHeight() - nVar.F.p9) - r2.xa) / 2.0f;
                h0 h0Var = (h0) this.d;
                float measuredHeight2 = (measuredHeight - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.p9;
                h0Var.setTranslationY(((((float) h0Var.getTop()) > measuredHeight2 ? measuredHeight2 - h0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.c;
                float measuredHeight3 = ((nVar2.G.getMeasuredHeight() - nVar2.F.p9) - r2.xa) / 2.0f;
                xa xaVar = (xa) this.d;
                float measuredHeight4 = (measuredHeight3 - (xaVar.getMeasuredHeight() / 2.0f)) + nVar2.F.p9;
                xaVar.setTranslationY(((((float) xaVar.getTop()) > measuredHeight4 ? measuredHeight4 - xaVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}

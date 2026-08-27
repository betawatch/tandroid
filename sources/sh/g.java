package sh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.ua;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ View d;

    public /* synthetic */ g(m mVar, View view, float f10, int i10) {
        this.a = i10;
        this.c = mVar;
        this.d = view;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.c;
                float measuredHeight = ((mVar.G.getMeasuredHeight() - mVar.F.o9) - r2.wa) / 2.0f;
                h0 h0Var = (h0) this.d;
                float measuredHeight2 = (measuredHeight - (h0Var.getMeasuredHeight() / 2.0f)) + mVar.F.o9;
                h0Var.setTranslationY(((((float) h0Var.getTop()) > measuredHeight2 ? measuredHeight2 - h0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * this.b));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.c;
                float measuredHeight3 = ((mVar2.G.getMeasuredHeight() - mVar2.F.o9) - r2.wa) / 2.0f;
                ua uaVar = (ua) this.d;
                float measuredHeight4 = (measuredHeight3 - (uaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.o9;
                uaVar.setTranslationY(((((float) uaVar.getTop()) > measuredHeight4 ? measuredHeight4 - uaVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * this.b));
                break;
        }
    }
}

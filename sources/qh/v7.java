package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.pr;
import org.telegram.ui.qd1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class v7 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.z5 f;
    public final /* synthetic */ x7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(x7 x7Var, Context context) {
        super(context);
        this.h = x7Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.z5(this);
    }

    public static /* synthetic */ void a(v7 v7Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v7Var.b = floatValue;
        super.setTranslationY(floatValue + v7Var.a);
    }

    public final void b(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            setVisibility(z4 ? 8 : 0);
            float measuredHeight = z4 ? getMeasuredHeight() : 0.0f;
            this.b = measuredHeight;
            super.setTranslationY(measuredHeight + this.a);
            return;
        }
        setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, z4 ? getMeasuredHeight() : 0.0f);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new u7(this, r1));
        this.c.addListener(new qd1(12, this, z4));
        this.c.setDuration(320L);
        this.c.setInterpolator(pr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        x7 x7Var = this.h;
        g6Var = ((org.telegram.ui.ActionBar.h3) x7Var.T).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(x7Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}

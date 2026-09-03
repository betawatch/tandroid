package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.pr;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class u7 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.z5 f;
    public final /* synthetic */ w7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var, Context context) {
        super(context);
        this.h = w7Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.z5(this);
    }

    public static /* synthetic */ void a(u7 u7Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u7Var.b = floatValue;
        super.setTranslationY(floatValue + u7Var.a);
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
        ofFloat.addUpdateListener(new t7(this, r1));
        this.c.addListener(new vd1(12, this, z4));
        this.c.setDuration(320L);
        this.c.setInterpolator(pr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        w7 w7Var = this.h;
        g6Var = ((org.telegram.ui.ActionBar.h3) w7Var.T).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(w7Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}

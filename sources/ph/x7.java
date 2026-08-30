package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.nr;
import org.telegram.ui.l61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class x7 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.z5 f;
    public final /* synthetic */ z7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(z7 z7Var, Context context) {
        super(context);
        this.h = z7Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.z5(this);
    }

    public static /* synthetic */ void a(x7 x7Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x7Var.b = floatValue;
        super.setTranslationY(floatValue + x7Var.a);
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
        ofFloat.addUpdateListener(new w7(this, r1));
        this.c.addListener(new l61(12, this, z4));
        this.c.setDuration(320L);
        this.c.setInterpolator(nr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        z7 z7Var = this.h;
        f6Var = ((org.telegram.ui.ActionBar.g3) z7Var.T).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        paint.setAlpha((int) (this.f.d(z7Var.f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        float f11 = this.b;
        this.a = f10;
        super.setTranslationY(f11 + f10);
    }
}

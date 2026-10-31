package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p6 extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.t5 f;
    public final /* synthetic */ r6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(r6 r6Var, Context context) {
        super(context);
        this.h = r6Var;
        this.e = new Paint(1);
        this.f = new org.telegram.ui.Components.t5(this);
    }

    public static /* synthetic */ void a(p6 p6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p6Var.b = floatValue;
        super.setTranslationY(floatValue + p6Var.a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            setVisibility(z10 ? 8 : 0);
            float measuredHeight = z10 ? getMeasuredHeight() : 0.0f;
            this.b = measuredHeight;
            super.setTranslationY(measuredHeight + this.a);
            return;
        }
        setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, z10 ? getMeasuredHeight() : 0.0f);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new o6(this, r1));
        this.c.addListener(new sg.y(13, this, z10));
        this.c.setDuration(320L);
        this.c.setInterpolator(gr.h);
        this.c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.t6.a7;
        r6 r6Var = this.h;
        w6 w6Var = r6Var.W;
        int i11 = w6.U1;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, w6Var.I0);
        Paint paint = this.e;
        paint.setColor(w02);
        paint.setAlpha((int) (this.f.e(false, r6Var.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        float f10 = this.b;
        this.a = f7;
        super.setTranslationY(f10 + f7);
    }
}

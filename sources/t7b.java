// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class t7b extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final ln f;
    public final /* synthetic */ v7b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7b(v7b v7bVar, Context context) {
        super(context);
        this.h = v7bVar;
        this.e = new Paint(1);
        this.f = new ln(this);
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            setVisibility(z ? 8 : 0);
            float measuredHeight = z ? getMeasuredHeight() : 0.0f;
            this.b = measuredHeight;
            super.setTranslationY(measuredHeight + this.a);
            return;
        }
        setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, z ? getMeasuredHeight() : 0.0f);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new s7b(this, (byte) 0));
        this.c.addListener(new sw9((byte) 5, this, z));
        this.c.setDuration(320L);
        this.c.setInterpolator(d53.h);
        this.c.start();
    }

    public final /* synthetic */ void b(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.b = floatValue;
        super.setTranslationY(floatValue + this.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = cmb.Z6;
        v7b v7bVar = this.h;
        a8b a8bVar = v7bVar.a0;
        int i2 = a8b.X1;
        int v0 = cmb.v0(i, a8bVar.J0);
        Paint paint = this.e;
        paint.setColor(v0);
        paint.setAlpha((int) (this.f.e(false, v7bVar.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        float f2 = this.b;
        this.a = f;
        super.setTranslationY(f2 + f);
    }
}

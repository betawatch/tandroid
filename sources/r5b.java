// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class r5b extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final lm f;
    public final /* synthetic */ t5b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5b(t5b t5bVar, Context context) {
        super(context);
        this.h = t5bVar;
        this.e = new Paint(1);
        this.f = new lm(this);
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
        ofFloat.addUpdateListener(new q5b(this, (byte) 0));
        this.c.addListener(new pu9((byte) 5, this, z));
        this.c.setDuration(320L);
        this.c.setInterpolator(s33.h);
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
        int i = bkb.Z6;
        t5b t5bVar = this.h;
        y5b y5bVar = t5bVar.a0;
        int i2 = y5b.X1;
        int v0 = bkb.v0(i, y5bVar.J0);
        Paint paint = this.e;
        paint.setColor(v0);
        paint.setAlpha((int) (this.f.e(false, t5bVar.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        float f2 = this.b;
        this.a = f;
        super.setTranslationY(f2 + f);
    }
}

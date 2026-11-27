// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class p9b extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final mm f;
    public final /* synthetic */ r9b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9b(r9b r9bVar, Context context) {
        super(context);
        this.h = r9bVar;
        this.e = new Paint(1);
        this.f = new mm(this);
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
        ofFloat.addUpdateListener(new o9b(this, (byte) 0));
        this.c.addListener(new i1a((byte) 4, this, z));
        this.c.setDuration(320L);
        this.c.setInterpolator(k43.h);
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
        int i = aob.a7;
        r9b r9bVar = this.h;
        w9b w9bVar = r9bVar.a0;
        int i2 = w9b.X1;
        int v0 = aob.v0(i, w9bVar.J0);
        Paint paint = this.e;
        paint.setColor(v0);
        paint.setAlpha((int) (this.f.e(false, r9bVar.f.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        float f2 = this.b;
        this.a = f;
        super.setTranslationY(f2 + f);
    }
}

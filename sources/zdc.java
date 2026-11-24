// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zdc extends jy {
    public final Path h;
    public final /* synthetic */ bec n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdc(bec becVar, Context context) {
        super(context);
        this.n = becVar;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // jy, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RectF rectF;
        super.onMeasure(i, i2);
        Path path = this.h;
        path.reset();
        bec becVar = this.n;
        if (becVar.d) {
            rectF = gm.P;
            rectF.set(0.0f, -becVar.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            rectF = gm.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + becVar.N));
        }
        float L = becVar.N - gm.L(3.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
    }
}

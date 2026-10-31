package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f7 extends LinearLayout {
    public final Path a;
    public final /* synthetic */ Matrix b;
    public final /* synthetic */ RadialGradient c;
    public final /* synthetic */ Paint d;
    public final /* synthetic */ org.telegram.ui.Components.d5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.d5 d5Var) {
        super(context);
        this.b = matrix;
        this.c = radialGradient;
        this.d = paint;
        this.e = d5Var;
        this.a = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.i0.L(10.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, org.telegram.messenger.i0.L(2.0f) + 1, getWidth(), getHeight() + L);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, org.telegram.messenger.i0.L(100.0f));
        this.c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, org.telegram.messenger.i0.L(100.0f));
        j0.a(canvas, 0, this.e, getWidth(), org.telegram.messenger.i0.L(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.b();
    }
}

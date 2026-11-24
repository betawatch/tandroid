// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xr7 extends View {
    public final Paint a;
    public float b;

    public xr7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.L(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawLine((getWidth() / 2.0f) + gl.L(gl.R1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(5.33f, 0.0f, this.b)), (getWidth() / 2.0f) + gl.L(gl.R1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(-5.33f, -7.0f, this.b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + gl.L(gl.R1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(5.33f, 7.0f, this.b)), (getWidth() / 2.0f) + gl.L(gl.R1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(-5.33f, 0.0f, this.b)), paint);
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }
}

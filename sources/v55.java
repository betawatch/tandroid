// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v55 extends TextView {
    public final RectF a;
    public final Paint b;

    public v55(LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        paint.setColor(-16711936);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}

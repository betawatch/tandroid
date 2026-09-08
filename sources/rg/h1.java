package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h1 extends View {
    public final Paint a;
    public float b;

    public h1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 0.0f, this.b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -7.0f, this.b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 7.0f, this.b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, 0.0f, this.b)), paint);
    }

    public void setProgress(float f7) {
        this.b = f7;
        invalidate();
    }
}

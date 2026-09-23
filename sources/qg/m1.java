package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m1 extends View {
    public final Paint a;
    public float b;

    public m1(Context context) {
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
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-6.7f, -7.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(0.71f, 0.0f, this.b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-2.45f, 7.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(4.79f, 0.0f, this.b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-2.45f, 0.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(4.79f, 7.0f, this.b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(6.59f, 0.0f, this.b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-4.27f, -7.0f, this.b)), paint);
    }

    public void setProgress(float f7) {
        this.b = f7;
        invalidate();
    }
}

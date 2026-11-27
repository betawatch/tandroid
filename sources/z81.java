// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z81 extends TextView {
    public final Paint a;
    public final /* synthetic */ vnb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(Context context, vnb vnbVar) {
        super(context);
        this.b = vnbVar;
        this.a = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int p1 = aob.p1(0.8f, aob.v0(aob.z6, this.b));
        Paint paint = this.a;
        paint.setColor(p1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i = 0;
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            i = Math.max(i, (int) layout.getLineWidth(i2));
        }
        float f = i / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f) - hl.L(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f + hl.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}

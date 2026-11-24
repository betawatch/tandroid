// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z42 extends TextView {
    public float a;
    public boolean b;
    public final /* synthetic */ Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z42(Context context, Paint paint) {
        super(context);
        this.c = paint;
        this.a = 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i = (int) ((this.a * 130.0f) + 125.0f);
        Paint paint = this.c;
        paint.setAlpha(i);
        boolean z = this.b;
        float f = this.a;
        if (z) {
            float f2 = f + 0.026666667f;
            this.a = f2;
            if (f2 >= 1.0f) {
                this.a = 1.0f;
                this.b = false;
            }
        } else {
            float f3 = f - 0.026666667f;
            this.a = f3;
            if (f3 <= 0.0f) {
                this.a = 0.0f;
                this.b = true;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(gl.L(14.0f), getMeasuredHeight() / 2, gl.L(4.0f), paint);
        invalidate();
    }
}

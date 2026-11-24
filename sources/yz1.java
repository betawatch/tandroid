// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yz1 extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x02 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz1(x02 x02Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = x02Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.V1.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                x02 x02Var = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, x02Var.v2.getSelectedItemsCount())));
                TextPaint textPaint = x02Var.G2;
                int max = Math.max(gl.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), gl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                textPaint.setColor(bm2.o(bkb.v0(bkb.B5, x02Var.J0), (int) (((x02Var.S2 * 0.42d) + 0.58d) * Color.alpha(r6))));
                Paint paint = x02Var.I2;
                paint.setColor(bkb.v0(bkb.g5, x02Var.J0));
                RectF rectF = x02Var.H2;
                int i = max / 2;
                rectF.set(measuredWidth - i, 0.0f, i + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
                paint.setColor(bkb.v0(bkb.V9, x02Var.J0));
                rectF.set(gl.L(2.0f) + r8, gl.L(2.0f), r4 - gl.L(2.0f), getMeasuredHeight() - gl.L(2.0f));
                canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (r3 / 2), gl.L(16.2f), textPaint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                this.b.V1.setBounds(0, (i2 - gl.n) - gl.L(48.0f), i, i2);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }
}

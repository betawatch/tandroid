// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qo3 extends View {
    public boolean a;
    public final Paint b;
    public final wjb c;

    public qo3(Context context, wjb wjbVar) {
        super(context);
        this.b = new Paint();
        this.c = wjbVar;
        setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.a;
        wjb wjbVar = this.c;
        Paint paint = this.b;
        if (z) {
            paint.setColor(bm2.f(0.2f, -16777216, bkb.v0(bkb.kh, wjbVar)));
        } else {
            paint.setColor(bkb.v0(bkb.c7, wjbVar));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z) {
        this.a = z;
    }
}

// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wg8 extends mr {
    public bra e;
    public Paint f;
    public float h;

    @Override // mr, android.view.View
    public final void draw(Canvas canvas) {
        int L = gl.L(10.0f);
        bra braVar = this.e;
        braVar.c.set(gl.L(5.0f), gl.L(5.0f), getMeasuredWidth() - gl.L(5.0f), getMeasuredHeight() - gl.L(5.0f));
        float f = -L;
        braVar.a.set(f, f, getWidth() + L, getHeight() + L);
        canvas.save();
        float f2 = 1.0f - this.h;
        canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        braVar.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), this.f);
        super.draw(canvas);
    }
}

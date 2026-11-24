// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class s18 extends uz6 {
    public final /* synthetic */ y28 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s18(y28 y28Var, Context context, long j, d dVar, f53 f53Var) {
        super(context, j, 0L, dVar, f53Var);
        this.V = y28Var;
    }

    @Override // uz6
    public final void f(Canvas canvas, Rect rect, float f) {
        y28 y28Var = this.V;
        ep epVar = y28Var.F1;
        epVar.i(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = gl.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f, f, (Paint) epVar.a);
        canvas.drawRoundRect(rectF, f, f, y28Var.d2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, y28Var.r0.d("paintDivider"));
        }
    }
}

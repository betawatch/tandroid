// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y45 extends TextView {
    public final RectF a;
    public final /* synthetic */ h75 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y45(h75 h75Var, Context context) {
        super(context);
        this.b = h75Var;
        this.a = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), this.b.Z2);
        super.onDraw(canvas);
    }
}

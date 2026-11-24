// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tz3 extends FrameLayout {
    public final /* synthetic */ t14 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz3(t14 t14Var, Context context) {
        super(context);
        this.a = t14Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t14 t14Var = this.a;
        yz3 yz3Var = t14Var.J;
        ty3 ty3Var = t14Var.W;
        g04 g04Var = t14Var.Q;
        if (view != g04Var && view != ty3Var) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float y = yz3Var.getY() + yz3Var.getMeasuredHeight() + 1.0f;
        if (view == g04Var && ty3Var != null) {
            y = Math.max(y, ty3Var.getY() + ty3Var.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y - (gl.L(16.0f) * t14Var.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}

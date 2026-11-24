// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y55 extends ma8 {
    public final /* synthetic */ h75 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y55(h75 h75Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = h75Var;
    }

    @Override // ma8
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        h75 h75Var = this.T;
        g55 g55Var = h75Var.l1;
        i55 i55Var = h75Var.s4;
        if (f > 0.0f) {
            float x = h75Var.b.getX() + i55Var.getX();
            float y = h75Var.b.getY() + i55Var.getY();
            RectF rectF = gl.P;
            rectF.set(x, y, g55Var.getMeasuredWidth() + x, g55Var.getMeasuredHeight() + y);
            canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
            canvas.translate(x, y);
            i55Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // ma8
    public final void e() {
        g55 g55Var = this.T.l1;
        super.e();
        for (int i = 0; i < g55Var.getChildCount(); i++) {
            g55Var.getChildAt(i).invalidate();
        }
    }
}

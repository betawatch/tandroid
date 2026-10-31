package ph;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f4 extends s4.m0 {
    public final PointF a = new PointF();
    public final /* synthetic */ g4 b;

    public f4(g4 g4Var) {
        this.b = g4Var;
    }

    @Override // s4.m0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        bi.t0 t0Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        g4 g4Var = this.b;
        b4 b4Var = g4Var.l2;
        a4 a4Var = g4Var.Z1;
        tk0 tk0Var = g4Var.k1;
        PointF pointF = this.a;
        float f10 = 0.0f;
        if (zg.h.b(a4Var, tk0Var, pointF)) {
            float f11 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + a4Var.getMeasuredHeight());
            f7 = f11;
            width = a4Var.getMeasuredWidth() + f11;
        } else {
            f7 = 0.0f;
        }
        if (zg.h.b(b4Var, tk0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + b4Var.getMeasuredHeight() + org.telegram.messenger.i0.L(12.0f));
        }
        if (height >= f10 || (t0Var = a4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / t0Var.getHeight();
        canvas.save();
        canvas.clipRect(f7, height, width, f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        a4Var.L.draw(canvas);
        canvas.restore();
    }
}

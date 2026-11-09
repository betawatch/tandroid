package zh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import bi.ec;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a4 extends v4.m0 {
    public final PointF a = new PointF();
    public final /* synthetic */ b4 b;

    public a4(b4 b4Var) {
        this.b = b4Var;
    }

    @Override // v4.m0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        ec ecVar;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        b4 b4Var = this.b;
        w3 w3Var = b4Var.l2;
        v3 v3Var = b4Var.Z1;
        qj0 qj0Var = b4Var.k1;
        PointF pointF = this.a;
        float f11 = 0.0f;
        if (jh.k.b(v3Var, qj0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + v3Var.getMeasuredHeight());
            f10 = f12;
            width = v3Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(w3Var, qj0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + w3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height >= f11 || (ecVar = v3Var.L) == null) {
            return;
        }
        float height2 = (f11 - height) / ecVar.getHeight();
        canvas.save();
        canvas.clipRect(f10, height, width, f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        v3Var.L.draw(canvas);
        canvas.restore();
    }
}

package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.ab;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class y4 extends s4.n0 {
    public final PointF a = new PointF();
    public final /* synthetic */ z4 b;

    public y4(z4 z4Var) {
        this.b = z4Var;
    }

    @Override // s4.n0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        ab abVar;
        float height = recyclerView.getHeight();
        z4 z4Var = this.b;
        u4 u4Var = z4Var.s0;
        t4 t4Var = z4Var.h0;
        zl0 zl0Var = z4Var.d;
        PointF pointF = this.a;
        if (hh.k.b(t4Var, zl0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + t4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.k.b(u4Var, zl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + u4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (abVar = t4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / abVar.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        t4Var.L.draw(canvas);
        canvas.restore();
    }
}

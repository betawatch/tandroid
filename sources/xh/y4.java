package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        eb ebVar;
        float height = recyclerView.getHeight();
        z4 z4Var = this.b;
        u4 u4Var = z4Var.s0;
        t4 t4Var = z4Var.h0;
        vl0 vl0Var = z4Var.d;
        PointF pointF = this.a;
        if (hh.k.b(t4Var, vl0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + t4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.k.b(u4Var, vl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + u4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (ebVar = t4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / ebVar.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        t4Var.L.draw(canvas);
        canvas.restore();
    }
}

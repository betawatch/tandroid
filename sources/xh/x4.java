package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class x4 extends s4.n0 {
    public final PointF a = new PointF();
    public final /* synthetic */ y4 b;

    public x4(y4 y4Var) {
        this.b = y4Var;
    }

    @Override // s4.n0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        eb ebVar;
        float height = recyclerView.getHeight();
        y4 y4Var = this.b;
        t4 t4Var = y4Var.s0;
        s4 s4Var = y4Var.h0;
        ml0 ml0Var = y4Var.d;
        PointF pointF = this.a;
        if (hh.k.b(s4Var, ml0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + s4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.k.b(t4Var, ml0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + t4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (ebVar = s4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / ebVar.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        s4Var.L.draw(canvas);
        canvas.restore();
    }
}

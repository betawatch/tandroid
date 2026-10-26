package zh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import bi.cc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x4 extends s4.n0 {
    public final PointF a = new PointF();
    public final /* synthetic */ y4 b;

    public x4(y4 y4Var) {
        this.b = y4Var;
    }

    @Override // s4.n0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        cc ccVar;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        y4 y4Var = this.b;
        t4 t4Var = y4Var.t0;
        s4 s4Var = y4Var.h0;
        mm0 mm0Var = y4Var.d;
        PointF pointF = this.a;
        float f10 = 0.0f;
        if (jh.k.b(s4Var, mm0Var, pointF)) {
            float f11 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + s4Var.getMeasuredHeight());
            f7 = f11;
            width = s4Var.getMeasuredWidth() + f11;
        } else {
            f7 = 0.0f;
        }
        if (jh.k.b(t4Var, mm0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + t4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (ccVar = s4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / ccVar.getHeight();
        canvas.save();
        canvas.clipRect(f7, height, width, f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        s4Var.L.draw(canvas);
        canvas.restore();
    }
}

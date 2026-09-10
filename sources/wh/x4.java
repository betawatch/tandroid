package wh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import bi.nc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x4 extends s4.n0 {
    public final PointF a = new PointF();
    public final /* synthetic */ y4 b;

    public x4(y4 y4Var) {
        this.b = y4Var;
    }

    @Override // s4.n0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        nc ncVar;
        float height = recyclerView.getHeight();
        y4 y4Var = this.b;
        t4 t4Var = y4Var.s0;
        s4 s4Var = y4Var.h0;
        vl0 vl0Var = y4Var.d;
        PointF pointF = this.a;
        if (gh.k.b(s4Var, vl0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + s4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (gh.k.b(t4Var, vl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + t4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (ncVar = s4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / ncVar.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        s4Var.L.draw(canvas);
        canvas.restore();
    }
}

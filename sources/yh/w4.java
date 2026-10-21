package yh;

import ai.ic;
import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jm0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class w4 extends s4.m0 {
    public final PointF a = new PointF();
    public final /* synthetic */ x4 b;

    public w4(x4 x4Var) {
        this.b = x4Var;
    }

    @Override // s4.m0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        ic icVar;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        x4 x4Var = this.b;
        s4 s4Var = x4Var.s0;
        r4 r4Var = x4Var.h0;
        jm0 jm0Var = x4Var.d;
        PointF pointF = this.a;
        float f10 = 0.0f;
        if (ih.j.b(r4Var, jm0Var, pointF)) {
            float f11 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + r4Var.getMeasuredHeight());
            f7 = f11;
            width = r4Var.getMeasuredWidth() + f11;
        } else {
            f7 = 0.0f;
        }
        if (ih.j.b(s4Var, jm0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + s4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (icVar = r4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / icVar.getHeight();
        canvas.save();
        canvas.clipRect(f7, height, width, f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        r4Var.L.draw(canvas);
        canvas.restore();
    }
}

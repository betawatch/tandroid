package yh;

import ai.ic;
import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        float f10;
        ic icVar;
        float height = recyclerView.getHeight();
        x4 x4Var = this.b;
        s4 s4Var = x4Var.s0;
        r4 r4Var = x4Var.h0;
        im0 im0Var = x4Var.d;
        PointF pointF = this.a;
        if (ih.j.b(r4Var, im0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + r4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (ih.j.b(s4Var, im0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + s4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (icVar = r4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / icVar.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        r4Var.L.draw(canvas);
        canvas.restore();
    }
}

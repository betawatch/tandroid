package yh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import di.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class w4 extends s4.n0 {
    public final PointF a = new PointF();
    public final /* synthetic */ x4 b;

    public w4(x4 x4Var) {
        this.b = x4Var;
    }

    @Override // s4.n0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        eb ebVar;
        float height = recyclerView.getHeight();
        x4 x4Var = this.b;
        s4 s4Var = x4Var.s0;
        r4 r4Var = x4Var.h0;
        ll0 ll0Var = x4Var.d;
        PointF pointF = this.a;
        if (ih.k.b(r4Var, ll0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + r4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (ih.k.b(s4Var, ll0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + s4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (ebVar = r4Var.L) == null) {
            return;
        }
        float height2 = (f10 - height) / ebVar.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
        canvas.translate(f7, height);
        canvas.scale(height2, height2);
        r4Var.L.draw(canvas);
        canvas.restore();
    }
}

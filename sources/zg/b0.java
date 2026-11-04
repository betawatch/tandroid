package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b0 extends TableLayout {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ c0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Context context, e6 e6Var) {
        super(context);
        this.b = c0Var;
        this.a = e6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c0 c0Var = this.b;
        c0Var.w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.s.rewind();
        c0Var.s.addRoundRect(c0Var.w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.r.setColor(i0.a.f(0.1f, k6.w0(k6.d7, this.a), -1));
        c0Var.r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight() / (c0Var.E.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i3 = 1; i3 <= 4; i3++) {
            float f10 = height * i3;
            canvas.drawLine(0.0f, f10, getWidth(), f10, c0Var.r);
        }
        float right = bd.a0 ? c0Var.e.getRight() : c0Var.e.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), c0Var.r);
        c0Var.r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.s, c0Var.r);
    }
}

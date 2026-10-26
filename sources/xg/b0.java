package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b0 extends TableLayout {
    public final /* synthetic */ u6 a;
    public final /* synthetic */ c0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Context context, u6 u6Var) {
        super(context);
        this.b = c0Var;
        this.a = u6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c0 c0Var = this.b;
        c0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.s.rewind();
        c0Var.s.addRoundRect(c0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.r.setColor(i0.a.f(0.1f, y6.w0(y6.d7, this.a), -1));
        c0Var.r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight() / (c0Var.y.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i10 = 1; i10 <= 4; i10++) {
            float f7 = height * i10;
            canvas.drawLine(0.0f, f7, getWidth(), f7, c0Var.r);
        }
        float right = LocaleController.isRTL ? c0Var.e.getRight() : c0Var.e.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), c0Var.r);
        c0Var.r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(c0Var.s, c0Var.r);
    }
}

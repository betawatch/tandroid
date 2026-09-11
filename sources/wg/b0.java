package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b0 extends TableLayout {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ c0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Context context, f6 f6Var) {
        super(context);
        this.b = c0Var;
        this.a = f6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c0 c0Var = this.b;
        c0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.s.rewind();
        c0Var.s.addRoundRect(c0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.r.setColor(i0.a.d(0.1f, j6.v0(j6.d7, this.a), -1));
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

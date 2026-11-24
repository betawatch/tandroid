// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vy3 extends FrameLayout {
    public final /* synthetic */ t14 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy3(t14 t14Var, Context context) {
        super(context);
        this.a = t14Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t14 t14Var = this.a;
        yy3 yy3Var = t14Var.p0;
        if (view != t14Var.i0) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0.0f, yy3Var.getY() + yy3Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}

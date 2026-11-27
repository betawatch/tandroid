// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qz3 extends FrameLayout {
    public final /* synthetic */ o24 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz3(o24 o24Var, Context context) {
        super(context);
        this.a = o24Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o24 o24Var = this.a;
        tz3 tz3Var = o24Var.p0;
        if (view != o24Var.i0) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0.0f, tz3Var.getY() + tz3Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}

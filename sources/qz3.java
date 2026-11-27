// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

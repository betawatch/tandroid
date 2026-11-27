// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rx0 extends View implements snb {
    public final /* synthetic */ tx0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx0(tx0 tx0Var, Context context) {
        super(context);
        this.a = tx0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.n);
        setTranslationY(hl.n);
    }

    @Override // snb
    public final void updateColors() {
        tx0 tx0Var = this.a;
        Paint paint = tx0Var.d;
        try {
            dy0 dy0Var = tx0Var.a;
            if (dy0Var != null) {
                int e = dy0Var.e(aob.w0(null, aob.a7, false));
                if (paint.getColor() != e) {
                    paint.setColor(e);
                    invalidate();
                    hl.o3(tx0Var, e, true, null);
                    hl.i3(tx0Var, hl.B(e) >= 0.721f);
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}

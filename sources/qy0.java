// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qy0 extends View implements vlb {
    public final /* synthetic */ sy0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(sy0 sy0Var, Context context) {
        super(context);
        this.a = sy0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.n);
        setTranslationY(gm.n);
    }

    @Override // vlb
    public final void updateColors() {
        sy0 sy0Var = this.a;
        Paint paint = sy0Var.d;
        try {
            cz0 cz0Var = sy0Var.a;
            if (cz0Var != null) {
                int e = cz0Var.e(cmb.w0(null, cmb.Z6, false));
                if (paint.getColor() != e) {
                    paint.setColor(e);
                    invalidate();
                    gm.o3(sy0Var, e, true, null);
                    gm.i3(sy0Var, gm.B(e) >= 0.721f);
                }
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}

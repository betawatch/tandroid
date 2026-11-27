// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wl4 extends ViewGroup {
    public final /* synthetic */ xl4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl4(xl4 xl4Var, Activity activity) {
        super(activity);
        this.a = xl4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xl4 xl4Var = this.a;
        boolean z = xl4Var.d;
        if (z && aob.k3 != null) {
            int L = z ? hl.L(3.0f) : 0;
            aob.k3.setAlpha(jn7.d4);
            aob.k3.setBounds(L - hl.L(2.0f), L - hl.L(1.0f), hl.L(2.0f) + (xl4Var.A - L), hl.L(2.0f) + (xl4Var.B - L));
            aob.k3.draw(canvas);
            Paint paint = aob.S1;
            if (paint != null) {
                paint.setColor(aob.w0(null, aob.ra, false));
                canvas.drawCircle(xl4Var.A / 2.0f, xl4Var.B / 2.0f, ((r2 - (L << 1)) / 2.0f) - hl.L(0.5f), aob.S1);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.a.d) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(r0.A / r0.k.getWidth(), r0.B / r0.k.getHeight());
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        xl4 xl4Var = this.a;
        int L = xl4Var.d ? hl.L(3.0f) : 0;
        xl4Var.k.layout(L, L, xl4Var.A - L, xl4Var.B - L);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        xl4 xl4Var = this.a;
        int L = (xl4Var.d ? hl.L(3.0f) : 0) << 1;
        xl4Var.k.measure(View.MeasureSpec.makeMeasureSpec(xl4Var.A - L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(xl4Var.B - L, TLObject.FLAG_30));
    }
}

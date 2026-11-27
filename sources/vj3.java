// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vj3 extends View implements snb {
    public final fm0 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final zg3 f;

    public vj3(Context context) {
        super(context);
        this.a = new fm0(380L, this, k43.h);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new zg3(this, (byte) 9);
        updateColors();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hl.d3(this.f, 3000L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl.r(this.f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        hl.X1(rectF, rectF2, f, rectF3);
        float U1 = hl.U1(f, hl.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, U1, U1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, TLObject.FLAG_30));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        this.d.set(hl.L(12.0f), ((currentActionBarHeight / 2) + paddingTop) - hl.L(15.0f), hl.L(30.0f) + hl.L(12.0f), hl.L(30.0f) + r6);
    }

    @Override // snb
    public final void updateColors() {
        this.b.setColor(aob.w0(null, aob.Yl, false));
        invalidate();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}

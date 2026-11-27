// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class tf9 extends View implements snb {
    public final vnb a;
    public final Paint b;
    public mk0 c;

    public tf9(Context context, vnb vnbVar) {
        super(context);
        this.b = new Paint();
        this.a = vnbVar;
        updateColors();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.wl));
    }

    public mk0 getRow() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, hl.L(6.0f), getMeasuredWidth(), hl.L(6.0f) + 1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(6.0f) + 1);
    }

    @Override // snb
    public final void updateColors() {
        this.b.setColor(aob.v0(aob.wl, this.a));
    }
}

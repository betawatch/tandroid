// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rjb extends wma {
    public final pm3 g0;
    public final /* synthetic */ vnb h0;
    public final /* synthetic */ pjb i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjb(Context context, vnb vnbVar, pjb pjbVar) {
        super(context, null);
        this.h0 = vnbVar;
        this.i0 = pjbVar;
        this.g0 = new pm3((byte) 7);
    }

    @Override // wma
    public final boolean O() {
        return false;
    }

    @Override // wma
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.i0) {
            return super.drawChild(canvas, view, j);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, hl.L(45.0f), getHeight());
        this.g0.r(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // wma
    public final vnb getResourceProvider() {
        return this.h0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.q.x, TLObject.FLAG_30);
        pjb pjbVar = this.i0;
        pjbVar.measure(makeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), pjbVar.getMeasuredHeight() + hl.L(24.0f));
    }
}

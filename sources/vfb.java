// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vfb extends cja {
    public final xl3 m0;
    public final /* synthetic */ wjb n0;
    public final /* synthetic */ tfb o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfb(Context context, wjb wjbVar, tfb tfbVar) {
        super(context, null);
        this.n0 = wjbVar;
        this.o0 = tfbVar;
        this.m0 = new xl3((byte) 7);
    }

    @Override // cja
    public final boolean O() {
        return false;
    }

    @Override // cja
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.o0) {
            return super.drawChild(canvas, view, j);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, gl.L(45.0f), getHeight());
        this.m0.s(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // cja
    public final wjb getResourceProvider() {
        return this.n0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.q.x, TLObject.FLAG_30);
        tfb tfbVar = this.o0;
        tfbVar.measure(makeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), tfbVar.getMeasuredHeight() + gl.L(24.0f));
    }
}

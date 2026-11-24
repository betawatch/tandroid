// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class whb extends ela {
    public final in3 m0;
    public final /* synthetic */ ylb n0;
    public final /* synthetic */ uhb o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whb(Context context, ylb ylbVar, uhb uhbVar) {
        super(context, null);
        this.n0 = ylbVar;
        this.o0 = uhbVar;
        this.m0 = new in3((byte) 7);
    }

    @Override // ela
    public final boolean O() {
        return false;
    }

    @Override // ela
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.o0) {
            return super.drawChild(canvas, view, j);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.d4, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, gm.L(45.0f), getHeight());
        this.m0.r(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // ela
    public final ylb getResourceProvider() {
        return this.n0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.q.x, TLObject.FLAG_30);
        uhb uhbVar = this.o0;
        uhbVar.measure(makeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), uhbVar.getMeasuredHeight() + gm.L(24.0f));
    }
}

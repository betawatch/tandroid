// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t57 extends ema {
    public final Paint N0;
    public final /* synthetic */ vnb O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t57(Context context, vnb vnbVar) {
        super(context);
        this.O0 = vnbVar;
        this.N0 = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0 = aob.v0(aob.K5, this.O0);
        Paint paint = this.N0;
        paint.setColor(v0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - hl.L(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + hl.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}

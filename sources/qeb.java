// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qeb extends lp7 {
    public final /* synthetic */ reb z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qeb(reb rebVar, Context context) {
        super(13, null, context);
        this.z0 = rebVar;
    }

    @Override // lp7, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int w0 = cmb.w0(null, cmb.i5, false);
        reb rebVar = this.z0;
        Paint paint = rebVar.e;
        if (w0 != rebVar.a) {
            rebVar.a = w0;
            setTextColor(w0);
        }
        super.onDraw(canvas);
        float L = gm.L(31.0f);
        paint.setColor(cmb.w0(null, cmb.g7, false));
        canvas.drawLine(gm.L(2.0f), L, getMeasuredWidth() - gm.L(2.0f), L, paint);
        float measuredHeight = getMeasuredHeight() - gm.L(31.0f);
        canvas.drawLine(gm.L(2.0f), measuredHeight, getMeasuredWidth() - gm.L(2.0f), measuredHeight, paint);
    }
}

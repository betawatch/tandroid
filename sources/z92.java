// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z92 extends xib {
    public final /* synthetic */ byte a0 = 0;

    public z92(lq8 lq8Var, Context context, ylb ylbVar) {
        super(18, ylbVar, context, false, false);
    }

    @Override // xib
    public final int e(int i) {
        switch (this.a0) {
            case 1:
                RectF rectF = ProfileActivity.e7;
                break;
        }
        return i;
    }

    @Override // xib, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a0) {
            case 0:
                canvas.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    public /* synthetic */ z92(Context context) {
        super(context);
    }
}

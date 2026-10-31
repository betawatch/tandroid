package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v1 extends y90 {
    public final /* synthetic */ z2 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(z2 z2Var, Context context, long j10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, j10, 0L, k2Var, p6Var);
        this.V = z2Var;
    }

    @Override // org.telegram.ui.Components.y90
    public final void f(Canvas canvas, Rect rect, float f7) {
        z2 z2Var = this.V;
        j2.f fVar = z2Var.y1;
        fVar.x(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) fVar.a);
        canvas.drawRoundRect(rectF, f7, f7, z2Var.W1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, z2Var.k0.d("paintDivider"));
        }
    }
}

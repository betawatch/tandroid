package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xa0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v1 extends xa0 {
    public final /* synthetic */ a3 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(a3 a3Var, Context context, long j3, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, 0L, p2Var, f6Var);
        this.V = a3Var;
    }

    @Override // org.telegram.ui.Components.xa0
    public final void f(Canvas canvas, Rect rect, float f7) {
        a3 a3Var = this.V;
        com.google.firebase.messaging.n nVar = a3Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
        canvas.drawRoundRect(rectF, f7, f7, a3Var.n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, a3Var.B0.F("paintDivider"));
        }
    }
}

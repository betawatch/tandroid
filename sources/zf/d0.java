package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d0 extends View {
    public final /* synthetic */ ys0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ys0 ys0Var, Context context) {
        super(context);
        this.a = ys0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.a.S0;
        if (b0Var != null) {
            b0Var.d(canvas);
        }
    }
}

package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.cu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g0 extends View {
    public final /* synthetic */ cu0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(cu0 cu0Var, Context context) {
        super(context);
        this.a = cu0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e0 e0Var = this.a.W0;
        if (e0Var != null) {
            e0Var.d(canvas);
        }
    }
}

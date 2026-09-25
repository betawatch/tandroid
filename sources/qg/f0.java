package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class f0 extends View {
    public final /* synthetic */ st0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(st0 st0Var, Context context) {
        super(context);
        this.a = st0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.a.W0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}

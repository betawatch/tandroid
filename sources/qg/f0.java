package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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

package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class g0 extends View {
    public final /* synthetic */ zt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(zt0 zt0Var, Context context) {
        super(context);
        this.a = zt0Var;
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

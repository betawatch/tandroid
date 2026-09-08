package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

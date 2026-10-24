package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class e0 extends View {
    public final /* synthetic */ jt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(jt0 jt0Var, Context context) {
        super(context);
        this.a = jt0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}

package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d0 extends View {
    public final /* synthetic */ xs0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(xs0 xs0Var, Context context) {
        super(context);
        this.a = xs0Var;
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

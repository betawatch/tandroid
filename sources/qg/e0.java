package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class e0 extends View {
    public final /* synthetic */ vt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(vt0 vt0Var, Context context) {
        super(context);
        this.a = vt0Var;
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

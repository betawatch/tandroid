package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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

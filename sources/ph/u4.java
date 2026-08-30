package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class u4 extends View {
    public final /* synthetic */ h9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(h9 h9Var, Context context) {
        super(context);
        this.a = h9Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        s4 s4Var = this.a.L0;
        if (s4Var != null) {
            s4Var.d(canvas);
        }
    }
}

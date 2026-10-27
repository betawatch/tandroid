package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e0 extends View {
    public final /* synthetic */ pt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(pt0 pt0Var, Context context) {
        super(context);
        this.a = pt0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.a.L0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}

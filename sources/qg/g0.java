package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class g0 extends View {
    public final /* synthetic */ au0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(au0 au0Var, Context context) {
        super(context);
        this.a = au0Var;
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

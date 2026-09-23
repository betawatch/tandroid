package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.tt0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g0 extends View {
    public final /* synthetic */ tt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(tt0 tt0Var, Context context) {
        super(context);
        this.a = tt0Var;
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

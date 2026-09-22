package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class f0 extends View {
    public final /* synthetic */ au0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(au0 au0Var, Context context) {
        super(context);
        this.a = au0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.a.W0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}

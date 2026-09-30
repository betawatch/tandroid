package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class f0 extends View {
    public final /* synthetic */ st0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(st0 st0Var, Context context) {
        super(context);
        this.a = st0Var;
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

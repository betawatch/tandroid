package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class d0 extends View {
    public final /* synthetic */ gt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(gt0 gt0Var, Context context) {
        super(context);
        this.a = gt0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.a.W0;
        if (b0Var != null) {
            b0Var.d(canvas);
        }
    }
}

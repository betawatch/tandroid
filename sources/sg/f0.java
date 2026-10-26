package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f0 extends View {
    public final /* synthetic */ nt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(nt0 nt0Var, Context context) {
        super(context);
        this.a = nt0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.a.L0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}

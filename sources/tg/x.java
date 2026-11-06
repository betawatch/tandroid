package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x extends d2 {
    public final /* synthetic */ g0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, Context context, PointF pointF, float f10, float f11, mt0 mt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, mt0Var, document, obj);
        this.y0 = g0Var;
    }

    @Override // tg.d2
    public final void q(zg0 zg0Var) {
        PhotoViewer photoViewer = ((up0) this.y0).X1;
        t51 t51Var = photoViewer.F2;
        if (t51Var == null) {
            return;
        }
        long S = t51Var.S();
        long j3 = photoViewer.l8;
        zg0Var.U(S - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

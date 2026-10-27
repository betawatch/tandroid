package sg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z extends p2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, rw0 rw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, rw0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // sg.p2
    public final void q(yj0 yj0Var) {
        PhotoViewer photoViewer = ((pt0) this.y0).d2;
        t81 t81Var = photoViewer.F2;
        if (t81Var == null) {
            return;
        }
        long n10 = t81Var.n();
        long j10 = photoViewer.m8;
        yj0Var.U(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

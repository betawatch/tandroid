package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a0 extends q2 {
    public final /* synthetic */ p0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p0 p0Var, Context context, PointF pointF, float f7, float f10, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, jv0Var, document, obj);
        this.y0 = p0Var;
    }

    @Override // qg.q2
    public final void q(xi0 xi0Var) {
        PhotoViewer photoViewer = ((au0) this.y0).o2;
        g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        long n10 = g71Var.n();
        long j3 = photoViewer.m8;
        xi0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

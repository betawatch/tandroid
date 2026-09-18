package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z extends n2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, vv0 vv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, vv0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // qg.n2
    public final void q(ij0 ij0Var) {
        PhotoViewer photoViewer = ((au0) this.y0).o2;
        u71 u71Var = photoViewer.F2;
        if (u71Var == null) {
            return;
        }
        long n10 = u71Var.n();
        long j3 = photoViewer.m8;
        ij0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z extends p2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, iw0 iw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, iw0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // rg.p2
    public final void q(yj0 yj0Var) {
        PhotoViewer photoViewer = ((jt0) this.y0).o2;
        j81 j81Var = photoViewer.F2;
        if (j81Var == null) {
            return;
        }
        long n10 = j81Var.n();
        long j10 = photoViewer.m8;
        yj0Var.U(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

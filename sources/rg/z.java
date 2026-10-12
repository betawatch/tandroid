package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class z extends q2 {
    public final /* synthetic */ o0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(o0 o0Var, Context context, PointF pointF, float f7, float f10, iw0 iw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, iw0Var, document, obj);
        this.y0 = o0Var;
    }

    @Override // rg.q2
    public final void q(yj0 yj0Var) {
        PhotoViewer photoViewer = ((hu0) this.y0).o2;
        h81 h81Var = photoViewer.F2;
        if (h81Var == null) {
            return;
        }
        long n10 = h81Var.n();
        long j10 = photoViewer.m8;
        yj0Var.U(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

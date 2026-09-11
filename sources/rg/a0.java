package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class a0 extends q2 {
    public final /* synthetic */ o0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(o0 o0Var, Context context, PointF pointF, float f7, float f10, iv0 iv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, iv0Var, document, obj);
        this.y0 = o0Var;
    }

    @Override // rg.q2
    public final void q(xi0 xi0Var) {
        PhotoViewer photoViewer = ((zt0) this.y0).o2;
        g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        long n10 = g71Var.n();
        long j3 = photoViewer.l8;
        xi0Var.R(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

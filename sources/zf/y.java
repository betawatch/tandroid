package zf;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y extends o2 {
    public final /* synthetic */ l0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(l0 l0Var, Context context, PointF pointF, float f10, float f11, tu0 tu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, tu0Var, document, obj);
        this.u0 = l0Var;
    }

    @Override // zf.o2
    public final void q(oi0 oi0Var) {
        PhotoViewer photoViewer = ((ys0) this.u0).k2;
        m61 m61Var = photoViewer.B2;
        if (m61Var == null) {
            return;
        }
        long o10 = m61Var.o();
        long j10 = photoViewer.h8;
        oi0Var.R(o10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

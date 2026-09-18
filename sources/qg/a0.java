package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a0 extends q2 {
    public final /* synthetic */ p0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p0 p0Var, Context context, PointF pointF, float f7, float f10, kv0 kv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, kv0Var, document, obj);
        this.y0 = p0Var;
    }

    @Override // qg.q2
    public final void q(yi0 yi0Var) {
        PhotoViewer photoViewer = ((cu0) this.y0).o2;
        h71 h71Var = photoViewer.F2;
        if (h71Var == null) {
            return;
        }
        long n10 = h71Var.n();
        long j3 = photoViewer.m8;
        yi0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

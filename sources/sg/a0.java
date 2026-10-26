package sg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a0 extends q2 {
    public final /* synthetic */ n0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, qw0 qw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, qw0Var, document, obj);
        this.y0 = n0Var;
    }

    @Override // sg.q2
    public final void q(xj0 xj0Var) {
        PhotoViewer photoViewer = ((nt0) this.y0).d2;
        s81 s81Var = photoViewer.F2;
        if (s81Var == null) {
            return;
        }
        long n10 = s81Var.n();
        long j10 = photoViewer.m8;
        xj0Var.U(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

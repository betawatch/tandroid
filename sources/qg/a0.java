package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class a0 extends o2 {
    public final /* synthetic */ n0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, uv0 uv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, uv0Var, document, obj);
        this.y0 = n0Var;
    }

    @Override // qg.o2
    public final void q(ij0 ij0Var) {
        PhotoViewer photoViewer = ((st0) this.y0).o2;
        s71 s71Var = photoViewer.F2;
        if (s71Var == null) {
            return;
        }
        long n10 = s71Var.n();
        long j3 = photoViewer.m8;
        ij0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

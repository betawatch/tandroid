package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class z extends o2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, gw0 gw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, gw0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // qg.o2
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((vt0) this.y0).o2;
        e81 e81Var = photoViewer.F2;
        if (e81Var == null) {
            return;
        }
        long n10 = e81Var.n();
        long j3 = photoViewer.m8;
        kj0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

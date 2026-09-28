package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class a0 extends o2 {
    public final /* synthetic */ n0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, wv0 wv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, wv0Var, document, obj);
        this.y0 = n0Var;
    }

    @Override // qg.o2
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((st0) this.y0).o2;
        u71 u71Var = photoViewer.F2;
        if (u71Var == null) {
            return;
        }
        long n10 = u71Var.n();
        long j3 = photoViewer.m8;
        kj0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

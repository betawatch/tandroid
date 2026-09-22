package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        PhotoViewer photoViewer = ((au0) this.y0).o2;
        v71 v71Var = photoViewer.F2;
        if (v71Var == null) {
            return;
        }
        long n10 = v71Var.n();
        long j3 = photoViewer.m8;
        kj0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

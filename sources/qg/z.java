package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class z extends o2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, fw0 fw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, fw0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // qg.o2
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((vt0) this.y0).o2;
        d81 d81Var = photoViewer.F2;
        if (d81Var == null) {
            return;
        }
        long n10 = d81Var.n();
        long j3 = photoViewer.m8;
        kj0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

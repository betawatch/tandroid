package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y extends g2 {
    public final /* synthetic */ g0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g0 g0Var, Context context, PointF pointF, float f10, float f11, nt0 nt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, nt0Var, document, obj);
        this.z0 = g0Var;
    }

    @Override // tg.g2
    public final void q(ch0 ch0Var) {
        PhotoViewer photoViewer = ((tp0) this.z0).Y1;
        u51 u51Var = photoViewer.G2;
        if (u51Var == null) {
            return;
        }
        long S = u51Var.S();
        long j3 = photoViewer.m8;
        ch0Var.U(S - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

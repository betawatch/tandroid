package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class y extends o2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m0 m0Var, Context context, PointF pointF, float f7, float f10, fw0 fw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, fw0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // rg.o2
    public final void q(vj0 vj0Var) {
        PhotoViewer photoViewer = ((gt0) this.y0).o2;
        c81 c81Var = photoViewer.F2;
        if (c81Var == null) {
            return;
        }
        long n10 = c81Var.n();
        long j10 = photoViewer.m8;
        vj0Var.U(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

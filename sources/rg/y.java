package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class y extends o2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m0 m0Var, Context context, PointF pointF, float f7, float f10, ew0 ew0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, ew0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // rg.o2
    public final void q(uj0 uj0Var) {
        PhotoViewer photoViewer = ((gt0) this.y0).o2;
        b81 b81Var = photoViewer.F2;
        if (b81Var == null) {
            return;
        }
        long n10 = b81Var.n();
        long j10 = photoViewer.m8;
        uj0Var.U(n10 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

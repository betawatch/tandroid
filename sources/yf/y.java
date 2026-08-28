package yf;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y extends n2 {
    public final /* synthetic */ l0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(l0 l0Var, Context context, PointF pointF, float f10, float f11, qu0 qu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, qu0Var, document, obj);
        this.u0 = l0Var;
    }

    @Override // yf.n2
    public final void q(mi0 mi0Var) {
        PhotoViewer photoViewer = ((xs0) this.u0).k2;
        k61 k61Var = photoViewer.B2;
        if (k61Var == null) {
            return;
        }
        long o6 = k61Var.o();
        long j10 = photoViewer.h8;
        mi0Var.R(o6 - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

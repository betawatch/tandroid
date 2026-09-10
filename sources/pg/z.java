package pg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z extends o2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, tv0 tv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, tv0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // pg.o2
    public final void q(hj0 hj0Var) {
        PhotoViewer photoViewer = ((zt0) this.y0).o2;
        t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        long n10 = t71Var.n();
        long j3 = photoViewer.l8;
        hj0Var.T(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y extends f2 {
    public final /* synthetic */ g0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g0 g0Var, Context context, PointF pointF, float f10, float f11, vt0 vt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, vt0Var, document, obj);
        this.z0 = g0Var;
    }

    @Override // tg.f2
    public final void q(mh0 mh0Var) {
        PhotoViewer photoViewer = ((vp0) this.z0).Y1;
        f61 f61Var = photoViewer.G2;
        if (f61Var == null) {
            return;
        }
        long S = f61Var.S();
        long j3 = photoViewer.m8;
        mh0Var.U(S - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d0 extends j2 {
    public final /* synthetic */ l0 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(l0 l0Var, Context context, PointF pointF, float f10, float f11, xt0 xt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, xt0Var, document, obj);
        this.A0 = l0Var;
    }

    @Override // tg.j2
    public final void q(nh0 nh0Var) {
        PhotoViewer photoViewer = ((vp0) this.A0).d2;
        h61 h61Var = photoViewer.G2;
        if (h61Var == null) {
            return;
        }
        long S = h61Var.S();
        long j3 = photoViewer.s8;
        nh0Var.U(S - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

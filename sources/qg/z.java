package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z extends p2 {
    public final /* synthetic */ m0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, mw0 mw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, mw0Var, document, obj);
        this.y0 = m0Var;
    }

    @Override // qg.p2
    public final void q(ck0 ck0Var) {
        PhotoViewer photoViewer = ((bu0) this.y0).o2;
        k81 k81Var = photoViewer.F2;
        if (k81Var == null) {
            return;
        }
        long n10 = k81Var.n();
        long j3 = photoViewer.m8;
        ck0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

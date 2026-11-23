package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z extends g2 {
    public final /* synthetic */ h0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h0 h0Var, Context context, PointF pointF, float f10, float f11, yt0 yt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, yt0Var, document, obj);
        this.z0 = h0Var;
    }

    @Override // tg.g2
    public final void q(oh0 oh0Var) {
        PhotoViewer photoViewer = ((vp0) this.z0).Y1;
        i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return;
        }
        long S = i61Var.S();
        long j3 = photoViewer.m8;
        oh0Var.U(S - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

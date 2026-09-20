package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class a0 extends o2 {
    public final /* synthetic */ n0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, uv0 uv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, uv0Var, document, obj);
        this.y0 = n0Var;
    }

    @Override // qg.o2
    public final void q(hj0 hj0Var) {
        PhotoViewer photoViewer = ((au0) this.y0).o2;
        t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        long n10 = t71Var.n();
        long j3 = photoViewer.m8;
        hj0Var.U(n10 - (j3 > 0 ? j3 / 1000 : 0L));
    }
}

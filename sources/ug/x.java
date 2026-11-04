package ug;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x extends d2 {
    public final /* synthetic */ f0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f0 f0Var, Context context, PointF pointF, float f10, float f11, lt0 lt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, lt0Var, document, obj);
        this.z0 = f0Var;
    }

    @Override // ug.d2
    public final void q(ch0 ch0Var) {
        PhotoViewer photoViewer = ((lp0) this.z0).Y1;
        m51 m51Var = photoViewer.G2;
        if (m51Var == null) {
            return;
        }
        long S = m51Var.S();
        long j10 = photoViewer.n8;
        ch0Var.U(S - (j10 > 0 ? j10 / 1000 : 0L));
    }
}

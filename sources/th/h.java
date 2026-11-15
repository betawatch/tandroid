package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h extends sh.c {
    public final TLRPC.Document b;
    public final Object c;

    public h(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        gj.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = gj.u4(document) || gj.N4(document);
        gj.K2(document, true);
        imageReceiver.p0(gc.b(document), "38_38", t5.f(document, j6.cd, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}

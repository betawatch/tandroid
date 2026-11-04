package uh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.t5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends th.c {
    public final TLRPC.Document b;
    public final Object c;

    public h(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        zi.I2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = zi.v4(document) || zi.O4(document);
        zi.L2(document, true);
        imageReceiver.p0(ac.b(document), "38_38", t5.f(document, k6.Zc, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // th.c
    public final void c(Canvas canvas, int i3, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i3, i10);
        imageReceiver.h(canvas, null);
    }
}

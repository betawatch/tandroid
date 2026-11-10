package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h extends sh.d {
    public final TLRPC.Document b;
    public final Object c;

    public h(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        ij.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z9 = ij.u4(document) || ij.N4(document);
        ij.K2(document, true);
        imageReceiver.p0(hc.b(document), "38_38", t5.f(document, m6.Zc, 1.0f, null), document.size, z9 ? "webp" : null, obj, 0);
    }

    @Override // sh.d
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}

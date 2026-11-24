// default package

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xf8 extends nf8 {
    public final TLRPC.Document b;
    public final Object c;

    public xf8(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        k47.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z = k47.t4(document) || k47.M4(document);
        k47.K2(document, true);
        imageReceiver.c0(gn5.b(document), "38_38", eq3.f(document, cmb.bd, 1.0f, null), document.size, z ? "webp" : null, obj, 0);
    }

    @Override // nf8
    public final void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}

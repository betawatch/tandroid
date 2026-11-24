// default package

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vd8 extends ld8 {
    public final TLRPC.Document b;
    public final Object c;

    public vd8(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        k27.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z = k27.t4(document) || k27.M4(document);
        k27.K2(document, true);
        imageReceiver.c0(gl5.b(document), "38_38", uo3.f(document, bkb.bd, 1.0f, null), document.size, z ? "webp" : null, obj, 0);
    }

    @Override // ld8
    public final void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}

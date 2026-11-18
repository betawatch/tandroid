package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h extends sh.d {
    public final TLRPC.Document b;
    public final Object c;

    public h(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        fj.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = fj.u4(document) || fj.N4(document);
        fj.K2(document, true);
        imageReceiver.p0(fc.b(document), "38_38", u5.f(document, n6.cd, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // sh.d
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}

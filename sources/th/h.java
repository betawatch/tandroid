package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h extends sh.c {
    public final TLRPC.Document b;
    public final Object c;

    public h(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        fj.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = fj.u4(document) || fj.N4(document);
        fj.K2(document, true);
        imageReceiver.q0(fc.b(document), "38_38", u5.f(document, n6.cd, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.z0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}

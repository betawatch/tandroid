// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s5a implements RequestDelegate {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ t5a b;

    public s5a(t5a t5aVar, Runnable runnable) {
        this.b = t5aVar;
        this.a = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new hw9((Object) this, (Object) tLObject, (Object) this.a, (byte) 3));
    }
}

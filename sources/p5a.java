// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p5a implements RequestDelegate {
    public final /* synthetic */ String a;
    public final /* synthetic */ r5a b;

    public p5a(r5a r5aVar, String str) {
        this.b = r5aVar;
        this.a = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new il9(this, this.a, (byte) 27));
    }
}
